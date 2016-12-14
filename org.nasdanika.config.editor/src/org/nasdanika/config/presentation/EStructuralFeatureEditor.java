package org.nasdanika.config.presentation;

import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class EStructuralFeatureEditor extends Composite {
	private Text text;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public EStructuralFeatureEditor(Composite parent, int style) {
		super(parent, style);
		
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginRight = 5;
		gridLayout.marginLeft = 5;
		setLayout(gridLayout);
		
		text = new Text(this, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
//		Text text = new Text(parent, SWT.BORDER);
//
		FieldDecorationRegistry decRegistry = FieldDecorationRegistry.getDefault();

		FieldDecoration infoField = decRegistry.getFieldDecoration(FieldDecorationRegistry.DEC_INFORMATION);

		ControlDecoration decoration = new ControlDecoration(text, SWT.TOP | SWT.RIGHT);
		decoration.setImage(infoField.getImage());

		decoration.setDescriptionText("Info <B>decoration</B> text");

		GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false);

		// Space for decoration image
		gridData.horizontalIndent = decRegistry.getMaximumDecorationWidth()+10;

//		text.setLayoutData(gridData);
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
