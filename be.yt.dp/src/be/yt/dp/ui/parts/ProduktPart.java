package be.yt.dp.ui.parts;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationListener;
import org.eclipse.jface.viewers.ColumnViewerEditorDeactivationEvent;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import be.yt.dp.data.provider.AantalEdittingSupport;
import be.yt.dp.data.provider.DateEdditingSupport;
import be.yt.dp.data.provider.NameEdittinSupport;
import be.yt.dp.data.provider.TableModelProvider;
import dp.Categorie;
import dp.Produkt;
import dp.StockItem;

public class ProduktPart {
	private TableViewer viewer;
	private Categorie selectedCategory;
	private static final String DATE_FORMAT = "dd/MM/yy";
	Shell shell;

	@Inject
	MDirtyable dirty;

	@Inject
	ESelectionService eSelectionService;

	@PostConstruct
	public void execute(MApplication application, EModelService eModelService,
			Composite parent, @Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {
		this.shell = shell;
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
		tableModelProvider.setSelectedCategory(selectedCategory);
		if (selectedCategory == null) {
			viewer.setInput(Collections.EMPTY_LIST);
		} else {
			viewer.setInput(selectedCategory.getStockitems());
		}

		// Layout the viewer
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		viewer.getControl().setLayoutData(gridData);
		viewer.getColumnViewerEditor().addEditorActivationListener(
				new ColumnViewerEditorActivationListener() {

					@Override
					public void beforeEditorDeactivated(
							ColumnViewerEditorDeactivationEvent event) {
						// TODO Auto-generated method stub

					}

					@Override
					public void beforeEditorActivated(
							ColumnViewerEditorActivationEvent event) {
						// TODO Auto-generated method stub

					}

					@Override
					public void afterEditorDeactivated(
							ColumnViewerEditorDeactivationEvent event) {
						// TODO Auto-generated method stub
						System.out.println("aftereditor is DE-activated");
					}

					@Override
					public void afterEditorActivated(
							ColumnViewerEditorActivationEvent event) {
						// TODO Auto-generated method stub
						System.out.println("aftereditoractivated");
						dirty.setDirty(true);
					}
				});

		// listen to a selection in the table and put the selection in
		// eSelectionServices
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) viewer
						.getSelection();
				@SuppressWarnings("unchecked")
				List<StockItem> stockList = sel.toList();
				StockItem stockItem = (StockItem) sel.getFirstElement(); // this
																			// can
																			// return
																			// null
																			// !!
				eSelectionService.setSelection(stockList);
				if (stockItem != null) {
					System.out.println("selected a stockitem with aantal : "
							+ stockItem.getAantal());
				}
			}
		});
	}

	public TableViewer getViewer() {
		return this.viewer;
	}

	// This will create the columns for the table
	private void createColums(Composite parent, TableViewer viewer2) {
		String[] titles = { "Naam", "Aantal", "Datum" };
		int[] bounds = { 100, 100, 100 };

		// first column is for the produkt name
		TableViewerColumn col = createTableViewerColumn(titles[0], bounds[0], 0);
		col.setLabelProvider(new CellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				cell.setText(((StockItem) cell.getElement()).getProdukt()
						.getNaam());
			}
		});
		col.setEditingSupport(new NameEdittinSupport(viewer2));

		// second column is for the amount
		col = createTableViewerColumn(titles[1], bounds[1], 1);
		col.setLabelProvider(new CellLabelProvider() {

			@Override
			public void update(ViewerCell cell) {
				cell.setText(((StockItem) cell.getElement()).getAantal()
						.toString());
			}

		});
		col.setEditingSupport(new AantalEdittingSupport(viewer2));

		// third column is for the date
		col = createTableViewerColumn(titles[2], bounds[2], 2);
		col.setLabelProvider(new CellLabelProvider() {

			@Override
			public void update(ViewerCell cell) {
				SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
				Date date = ((StockItem) cell.getElement()).getDatum();
				String dateToString = sdf.format(date);
				cell.setText(dateToString);
			}

		});
		col.setEditingSupport(new DateEdditingSupport(viewer2, shell));
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
			if (dirty.isDirty())
				save();
			System.out.println("Inside setCategorie: categorie name = "
					+ categorie.getNaam());

			this.selectedCategory = categorie;
			TableModelProvider.getInstance().setSelectedCategory(categorie);
			viewer.setInput(selectedCategory.getStockitems());
			viewer.refresh();
			System.out.println("categorie name after injection:"
					+ categorie.getNaam());

		}
	}

	@Persist
	public void save() {
		System.out.println("Saving data");
		// Save the data
		// ...
		// Now set the dirty flag to false
		for (StockItem s : selectedCategory.getStockitems()) {
			System.out.println("Overzicht van wat gesaved gaat worden:");
			System.out.println("stockitem aantal" + s.getAantal());
			System.out.println("Produkt naam : " + s.getProdukt().getNaam());
			System.out.println();
		}
		dirty.setDirty(false);
	}

	@Focus
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}