package be.yt.dp.ui.handlers;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import be.yt.dp.ui.controller.TreeViewerPartController;
import be.yt.dp.ui.dialog.MyDialog;

public class AddNewProduktHandler {

	@Inject
	ESelectionService eSelectionService;

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {

		TreeViewerPartController controller = TreeViewerPartController
				.getInstance();

		// fetch categories from db and display dialog
		MyDialog dialog = new MyDialog(shell, controller.getCategories());
		dialog.create();
		if (dialog.open() == Window.OK) {
			System.out.println(dialog.getFirstName());
			System.out.println(dialog.getLastName());
			System.out.println(dialog.getCategory());
		}

	}
}
