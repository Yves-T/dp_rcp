package be.yt.dp.ui.handlers;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import be.yt.dp.ui.controller.TreeViewerPartController;
import be.yt.dp.ui.dialog.NewStockItemDialog;
import be.yt.dp.ui.parts.ProduktPart;
import dp.Categorie;
import dp.Produkt;
import dp.Schuif;

public class AddNewStockItemHandler {

	@Inject
	ESelectionService eSelectionService;

	// open dialog
	// ask for aantal
	// ask for date

	@Execute
	public void addNewStockItem(
			@Named(IServiceConstants.ACTIVE_SHELL) Shell shell,
			MApplication application, EModelService service) {
		findObjectsById(application, service);

		Categorie c = (Categorie) eSelectionService
				.getSelection("be.yt.dp.part.category");
		if (c == null) {
			// show error dialog to user : please select a category
			System.out.println("Please select a category !!");
			MessageDialog.openError(shell, "Fout!",
					"Selecteer eerst een categorie in de boomstructuur!");
		} else {
			List<Schuif> schuifList = TreeViewerPartController.getInstance()
					.findSchuiven();

			for (Schuif schuif : schuifList) {
				System.out.println("schuiven : " + schuif.getNummer());
			}

			List<Produkt> produkts = c.getProdukten();

			for (Produkt p : produkts) {
				System.out.println("produkt in selected list = " + p.getNaam());
			}

			// fetch categories from db and display dialog
			NewStockItemDialog dialog = new NewStockItemDialog(shell, produkts,schuifList);
			dialog.create();
			if (dialog.open() == Window.OK) {
				System.out.println(dialog.getAantalAsString());
				System.out.println(dialog.getDatumAsString());
				System.out.println(dialog.getProduktAsString());
				System.out.println(dialog.getSchuifAsString());
				System.out.println(dialog.getInfo());
			}
		}
	}

	private void findObjectsById(MApplication application, EModelService service) {

		// refresh the table in produktpart after user created a new stockitem
		List<MPart> findElements = service.findElements(application,
				"be.yt.dp.part.produkt", MPart.class, null);
		System.out.println("Found part(s) : " + findElements.size());
		MPart part = findElements.get(0);
		ProduktPart p = (ProduktPart) part.getObject();
		p.getViewer().refresh();

	}

}
