package be.yt.dp.ui.handlers;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;

import dp.StockItem;

public class DeleteStockItemHandler {
	@Inject
	ESelectionService eSelectionService;

	// Get table selections from eSelectionService

	@Execute
	public void deleteStockItems() {
		System.out.println(eSelectionService
				.getSelection("be.yt.dp.part.produkt"));
		System.out.println("Class name of selection = "
				+ eSelectionService.getSelection().getClass().getName());

		if (eSelectionService.getSelection("be.yt.dp.part.produkt") instanceof List) {
			@SuppressWarnings("unchecked")
			List<StockItem> list = (List<StockItem>) eSelectionService
					.getSelection();
			for (StockItem s : list) {

				System.out
						.println("selectionservice: selected stockitem met aantal : "
								+ s.getAantal());
			}
		}
	}
}
