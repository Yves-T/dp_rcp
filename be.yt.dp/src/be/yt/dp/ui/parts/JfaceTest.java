package be.yt.dp.ui.parts;

import javax.annotation.PostConstruct;
import org.eclipse.e4.core.contexts.IEclipseContext;
import javax.annotation.PreDestroy;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

public class JfaceTest {

	public JfaceTest() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		
		TabFolder tabFolder = new TabFolder(parent, SWT.NONE);
		
		TabItem tbtmTest = new TabItem(tabFolder, SWT.NONE);
		tbtmTest.setText("test1");
		
		TabItem tbtmTest_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmTest_1.setText("test2");
		
		Text text = new Text(tabFolder,SWT.BORDER);
		text.setText("Dit is tab 2");
		tbtmTest_1.setControl(text);
	}

	@PreDestroy
	public void dispose() {
	}
	
	@Execute
	public void execute(IEclipseContext  context) {
		context.set("myactivePartId", 
				  "com.example.e4.rcp.ui.parts.todooverview");
		context.remove("myactivePartId");
	}

	@Focus
	public void setFocus() {
		// TODO	Set the focus to control
	}

}
