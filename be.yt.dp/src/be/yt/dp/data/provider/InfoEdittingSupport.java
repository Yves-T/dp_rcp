package be.yt.dp.data.provider;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;

import dp.StockItem;

public class InfoEdittingSupport extends EditingSupport {
	public InfoEdittingSupport(TableViewer viewer) {
		super(viewer);
		this.viewer = viewer;
	}

	private final TableViewer viewer;

	@Override
	protected CellEditor getCellEditor(Object element) {
		return new TextCellEditor(viewer.getTable());
	}

	@Override
	protected boolean canEdit(Object element) {
		return false;
	}

	@Override
	protected Object getValue(Object element) {
		return ((StockItem) element).getInfo();
	}

	@Override
	protected void setValue(Object element, Object value) {
		((StockItem) element).getInfo();
		viewer.refresh();
	}
}
