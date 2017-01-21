package org.nasdanika.config.presentation;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Control;

/**
 * Viewer which uses a form to edit bounded context generator model information.
 * @author Pavel Vlasov
 *
 */
public class MasterDetailViewer extends Viewer {
	
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		super.addSelectionChangedListener(listener);
		treeViewer.addSelectionChangedListener(listener);
	}
	
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		super.removeSelectionChangedListener(listener);
		treeViewer.removeSelectionChangedListener(listener);
	}
	
	private MasterDetailForm masterDetailForm;
	private TreeViewer treeViewer;

	public MasterDetailViewer(MasterDetailForm masterDetailForm) {
		this.masterDetailForm = masterDetailForm;
		this.treeViewer = new TreeViewer(masterDetailForm.getTree());
		treeViewer.addSelectionChangedListener(masterDetailForm);
	}
	
	@Override
	public Control getControl() {
		return masterDetailForm;
	}
	
	public TreeViewer getTreeViewer() {
		return treeViewer;
	}

	@Override
	public Object getInput() {
		return treeViewer.getInput();
	}

	@Override
	public ISelection getSelection() {
		return treeViewer.getSelection();
	}

	@Override
	public void refresh() {
		treeViewer.refresh();
	}

	@Override
	public void setInput(Object input) {
		treeViewer.setInput(input);
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		treeViewer.setSelection(selection);
	}
	
	

}
