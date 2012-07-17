package be.yt.dp.data.provider;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Shell;

import dp.StockItem;

public class DateEdditingSupport extends EditingSupport {

	private final TableViewer viewer;
	private Shell shell;
	private static final String DATE_FORMAT = "dd/MM/yy";

	public DateEdditingSupport(TableViewer viewer, Shell shell) {
		super(viewer);
		this.viewer = viewer;
		this.shell = shell;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return new TextCellEditor(viewer.getTable());
	}

	@Override
	protected boolean canEdit(Object element) {
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		// convert date to dd/mm/yy format and put it in the table
		StockItem stockitem = (StockItem) element;
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		return sdf.format(stockitem.getDatum());
	}

	@Override
	protected void setValue(Object element, Object value) {
		// convert user input from table to a Date object
		StockItem stockitem = (StockItem) element;
		String dateToBeConverted = (String) value;
		Date date = null;
		try {
			date = new SimpleDateFormat(DATE_FORMAT).parse(dateToBeConverted);
			stockitem.setDatum(date);
		} catch (ParseException e) {
			// the user entered a value that can't convert to a date
			// so show a error dialog
			MessageDialog
					.openError(shell, "Error",
							"De waarde die is ingegeven is kan niet omgezet worden naar een datum.");
		}
		viewer.refresh();
	}
}
