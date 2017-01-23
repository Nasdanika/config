package org.nasdanika.config.ecp.renderers;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.core.swt.renderer.TextControlSWTRenderer;
import org.eclipse.emf.ecp.view.spi.model.VControl;
import org.eclipse.emf.ecp.view.template.model.VTViewTemplateProvider;
import org.eclipse.emfforms.spi.common.report.ReportService;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedException;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedReport;
import org.eclipse.emfforms.spi.core.services.databinding.EMFFormsDatabinding;
import org.eclipse.emfforms.spi.core.services.editsupport.EMFFormsEditSupport;
import org.eclipse.emfforms.spi.core.services.label.EMFFormsLabelProvider;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.wizards.NewClassWizardPage;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.nasdanika.config.presentation.ConfigEditorPlugin;


public class JavaClassControlRenderer extends TextControlSWTRenderer {
	 
	private IProject project;

	@Inject
	public JavaClassControlRenderer(
			VControl vElement, 
			ViewModelContext viewContext,
			ReportService reportService,
			EMFFormsDatabinding emfFormsDatabinding, 
			EMFFormsLabelProvider emfFormsLabelProvider,
			VTViewTemplateProvider vtViewTemplateProvider, 
			EMFFormsEditSupport emfFormsEditSupport) {
		
		super(
				vElement, 
				viewContext, 
				reportService, 
				emfFormsDatabinding, 
				emfFormsLabelProvider, 
				vtViewTemplateProvider,
				emfFormsEditSupport);
		
		org.eclipse.emf.common.util.URI resourceURI = viewContext.getDomainModel().eResource().getURI();
		IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resourceURI.toPlatformString(true)));
		if (modelFile.exists()) {
			project = modelFile.getProject();
		}		
	}
	
	@Override
	protected Control createLabel(Composite parent) {
		Label label = (Label) super.createLabel(parent);
		label.setCursor(parent.getDisplay().getSystemCursor(SWT.CURSOR_HAND));
		FontDescriptor fontDescriptor = FontDescriptor.createFrom(label.getFont()).setStyle(SWT.UNDERLINE_SINGLE);
		label.setFont(fontDescriptor.createFont(parent.getDisplay()));
		label.setForeground(parent.getDisplay().getSystemColor(SWT.COLOR_BLUE));
		label.addMouseListener(new MouseAdapter() {
			
			@SuppressWarnings("unchecked")
			@Override
			public void mouseUp(MouseEvent e) {
				String className = createClass(parent.getShell(), null, null);
				if (className != null) {
					try {
						getModelValue().setValue(className);
					} catch (DatabindingFailedException ex) {
						getReportService().report(new DatabindingFailedReport(ex));
					}
				}				
			}
			
		});
		return label;
	}
 
	@Override
	protected Control createSWTControl(Composite parent) {
		final Composite main = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(main);
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.BEGINNING).applyTo(main);
		final Control control = super.createSWTControl(main);
		final Button button = new Button(main, SWT.PUSH);
		button.setText("Browse"); //$NON-NLS-1$
		button.setEnabled(project != null);
		button.addSelectionListener(new SelectionAdapter() {
			@SuppressWarnings("unchecked")
			@Override
			public void widgetSelected(SelectionEvent e) {				
				try {
					String className = findClass("java.lang.Object", parent.getShell(), (String) getModelValue().getValue());
					if (className != null) {
						getModelValue().setValue(className);
					}
				} catch (final DatabindingFailedException ex) {
					getReportService().report(new DatabindingFailedReport(ex));
				}
			}
		});
		return control;
	}
	
	/**
	 * Opens a dialog for class creation.
	 * @return class name.
	 */
	protected String createClass(Shell shell, String superClass, List<String> superInterfaces) {
		try {
			IWorkbench workbench = PlatformUI.getWorkbench();
			IWizardDescriptor descriptor = workbench.getNewWizardRegistry().findWizard("org.eclipse.jdt.ui.wizards.NewClassCreationWizard");
			IWorkbenchWizard wizard = descriptor.createWizard();
			wizard.init(workbench, null);
			WizardDialog wd = new  WizardDialog(shell, wizard);
			wd.addPageChangedListener(new IPageChangedListener() {
				
				@Override
				public void pageChanged(PageChangedEvent event) {
					if (event.getSelectedPage() instanceof NewClassWizardPage) {
						NewClassWizardPage ncwp = (NewClassWizardPage) event.getSelectedPage();
						if (superInterfaces != null && !superInterfaces.isEmpty()) {
							ncwp.setSuperInterfaces(superInterfaces, true);
						}
						if (superClass != null) {
							ncwp.setSuperClass(superClass, true);
						}
					}
				}
			});
			
			wd.setTitle(wizard.getWindowTitle());
			if (wd.open() == Window.OK) {
				for (IWizardPage wp: wizard.getPages()) {
					if (wp instanceof NewClassWizardPage) {
						NewClassWizardPage ncwp = (NewClassWizardPage) wp;
						return ncwp.getPackageText()+"."+ncwp.getTypeName();
					}
				}
			}
		} catch (Exception e1) {
			ConfigEditorPlugin.getPlugin().log(e1);
		}
		return null;
	}
	
	/**
	 * Opens a dialog to find class.
	 * @return class name
	 */
	protected String findClass(String rootTypeName, Shell shell, String initialPattern) {
		try {
			if (project.isOpen() && project.getNature(JavaCore.NATURE_ID) != null) {
				IJavaProject javaProject = JavaCore.create(project);
				IType rootType = javaProject.findType(rootTypeName); 
				if (rootType == null) {
					MessageDialog.openError(shell, "Root type not found", rootTypeName+" is not found in the project's scope.");
				} else {
					IJavaSearchScope scope = SearchEngine.createHierarchyScope(rootType);
					SelectionDialog typeDialog = JavaUI.createTypeDialog(
							shell, 
							PlatformUI.getWorkbench().getProgressService(), //site.getService(IProgressService.class), 
							scope, 
							IJavaElementSearchConstants.CONSIDER_CLASSES, 
							false);

					if (typeDialog instanceof FilteredItemsSelectionDialog && initialPattern != null && initialPattern.trim().length() > 0) {								
						((FilteredItemsSelectionDialog) typeDialog).setInitialPattern(initialPattern);
					}							
					
					if (typeDialog.open() == Window.OK) {
						Object[] result = typeDialog.getResult();
						if (result.length > 0 && result[0] instanceof IType) {
							return ((IType) result[0]).getFullyQualifiedName();
						}
					}
				}						
			}
		} catch (Exception e1) {
			ConfigEditorPlugin.getPlugin().log(e1);
		}
		return null;
	}
	
 
}