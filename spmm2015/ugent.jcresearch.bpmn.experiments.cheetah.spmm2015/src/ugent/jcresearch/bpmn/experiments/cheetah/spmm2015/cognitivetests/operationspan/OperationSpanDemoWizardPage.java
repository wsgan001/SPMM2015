package ugent.jcresearch.bpmn.experiments.cheetah.spmm2015.cognitivetests.operationspan;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class OperationSpanDemoWizardPage extends OperationSpanWizardPage {

	public OperationSpanDemoWizardPage(String pageName, List<OperationSpanExercise> level, int idx) {
		super(pageName, level, idx, 0, 0);
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		setTitle(getTitle());
		
		@SuppressWarnings("unused")
		Label filler = new Label(control, SWT.WRAP);
		
		Label text = new Label(control, SWT.NONE);
		text.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, true, false));
		text.setText("DEMO. Read the equation, assess its validity, read the word to remember, press the appropriate button.");
		text.setForeground(parent.getDisplay().getSystemColor(SWT.COLOR_BLUE));
	}
	
	@Override
	public String getTitle() {
		return super.getTitle() + " - DEMO";
	}	
}