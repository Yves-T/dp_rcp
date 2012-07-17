package be.yt.dp.data.provider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;

import dp.StockItem;



public class AantalEdittingSupport extends EditingSupport {

        private final TableViewer viewer;

        public AantalEdittingSupport(TableViewer viewer) {
                super(viewer);
                this.viewer = viewer;
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
                return ((StockItem) element).getAantal().toString();
        }

        @Override
        protected void setValue(Object element, Object value) {
                ((StockItem) element).setAantal(Integer.valueOf((String) value));
                viewer.refresh();
        }

}