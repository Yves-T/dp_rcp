package be.yt.dp.ui.parts;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import be.yt.dp.data.entity.Categorie;
import be.yt.dp.data.entity.Produkt;
import be.yt.dp.data.entity.Stockitem;
import be.yt.dp.data.provider.TableModelProvider;

public class ProduktPart {
	private TableViewer viewer;
	private Categorie selectedCategory;

	@PostConstruct
	public void execute(MApplication application, EModelService eModelService,
			Composite parent) {
		List<MPart> findElements = eModelService.findElements(application,
				"be.yt.dp.part.produkt", MPart.class, null);
		System.out.println("Found part(s) : " + findElements.size());

		// create the table
		GridLayout layout = new GridLayout(2, false);
		parent.setLayout(layout);
		Label searchLabel = new Label(parent, SWT.NONE);
		searchLabel.setText("Search: ");
		final Text searchText = new Text(parent, SWT.BORDER | SWT.SEARCH);
		searchText.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
				| GridData.HORIZONTAL_ALIGN_FILL));
		createViewer(parent);
	}

	private void createViewer(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		createColums(parent, viewer);
		final Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		viewer.setContentProvider(new ArrayContentProvider());

		// get the content for the viewer, setInput will call getElements in the
		// contentProvider
		TableModelProvider tableModelProvider = TableModelProvider
				.getInstance();
		//tableModelProvider.setSelectedCategory(selectedCategory);
		viewer.setInput(TableModelProvider.getInstance().getProdukts());

		// Layout the viewer
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		viewer.getControl().setLayoutData(gridData);
	}

	public TableViewer getViewer() {
		return this.viewer;
	}

	// This will create the columns for the table
	private void createColums(Composite parent, TableViewer viewer2) {
		String[] titles = { "Name" };
		int[] bounds = { 100 };

		// first column is for the produkt name
		TableViewerColumn col = createTableViewerColumn(titles[0], bounds[0], 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Stockitem stockItem = (Stockitem) element;
				return stockItem.getProdukt().getNaam();
			}
		});
	}

	private TableViewerColumn createTableViewerColumn(String title, int bound,
			int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
				SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);

		return viewerColumn;
	}

	// this method is called when user selects a produkt in the tree
	@Inject
	public void setProdukt(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Produkt produkt) {
		if (produkt != null) {
			System.out.println("Produkt name after injection:"
					+ produkt.getNaam());
		}
	}

	// this method is called when user selects a Categorie in the tree
	@Inject
	public void setCategorie(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Categorie categorie) {
		if (categorie != null) {
			this.selectedCategory = categorie;
			TableModelProvider.getInstance().setSelectedCategory(categorie);
			viewer.setInput(TableModelProvider.getInstance().getProdukts());
			viewer.refresh();
			System.out.println("categorie name after injection:"
					+ categorie.getNaam());
		}
	}

	@Focus
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}