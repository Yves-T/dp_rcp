package be.yt.dp.data.provider;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import dp.Categorie;

public class CategorieContentProvider implements ITreeContentProvider {

        private CategorieModel model = CategorieModel.getInstance();

        @Override
        public void dispose() {

        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
                this.model = (CategorieModel) newInput;
        }

        @Override
        public Object[] getElements(Object inputElement) {
                return model.getCategories().toArray();
        }

        @Override
        public Object[] getChildren(Object parentElement) {
                if (parentElement instanceof Categorie) {
                        Categorie category = (Categorie) parentElement;
                        return category.getProdukten().toArray();
                }
                return null;
        }

        @Override
        public Object getParent(Object element) {
                return null;
        }

        @Override
        public boolean hasChildren(Object element) {
                if (element instanceof Categorie) {
                        return true;
                }
                return false;
        }

}