package be.yt.dp.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import be.yt.dp.data.entity.Categorie;
import be.yt.dp.data.entity.Produkt;
import be.yt.dp.data.provider.CategorieContentProvider;
import be.yt.dp.data.provider.CategorieModel;
import be.yt.dp.data.provider.CategoryLabelProvider;
import be.yt.dp.data.provider.Observer;
import be.yt.dp.data.util.FillDatabase;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;

public class TreeViewerPart implements Observer {
	private TreeViewer viewer;
	@Inject
	ESelectionService selectionService;

	@PostConstruct
	public void createControls(Composite parent, EMenuService service) {
		@SuppressWarnings("unused")
		FillDatabase filDatabase = new FillDatabase();
		FillDatabase.initDb();
		System.out.println("init database complete");

		CategorieModel categorieModel = CategorieModel.getInstance();
		
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new CategorieContentProvider());
		viewer.setLabelProvider(new CategoryLabelProvider());
		// expand the tree
		viewer.setAutoExpandLevel(2);
		viewer.setInput(categorieModel);
		// set listener to tree
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event
						.getSelection();
				if (event.getSelection() instanceof IStructuredSelection) {
					if (selection.getFirstElement() instanceof Produkt) {
						Produkt produkt = (Produkt) selection.getFirstElement();
						selectionService.setSelection(selection
								.getFirstElement());
						System.out.println("selection :" + produkt.getNaam());
					}

					if (selection.getFirstElement() instanceof Categorie) {
						Categorie categorie = (Categorie) selection
								.getFirstElement();
						selectionService.setSelection(categorie);
					}

				}
			}
		});

		// add tree as listener to data model
		categorieModel.registerObserver(this);
		// provide the input to the ContentProvider
		viewer.setInput(categorieModel);

		// popup test
		final Text text = new Text(parent, SWT.BORDER);
		text.setText("Hello");
		service.registerContextMenu(text, "be.yt.dp.popupmenu.popuptest");
	}

	@Focus
	private void setFocus() {
		viewer.getControl().setFocus();
	}

	@Override
	public void update() {
		viewer.refresh();
	}
}