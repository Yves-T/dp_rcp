package be.yt.dp.data.provider;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import be.yt.dp.data.entity.Categorie;
import be.yt.dp.data.entity.Produkt;

public class CategoryLabelProvider extends LabelProvider {

        @Override
        public String getText(Object element) {
                if(element instanceof Categorie) {
                        Categorie categorie = (Categorie) element;
                        return categorie.getNaam();
                }
                return ((Produkt)element).getNaam();
        }

        @Override
        public Image getImage(Object element) {
                if (element instanceof Categorie) {
                        Bundle bundle = FrameworkUtil.getBundle(this.getClass());
                        URL url = FileLocator.find(bundle, new Path("icons/046.png"), null);
                        Image image = ImageDescriptor.createFromURL(url).createImage();
                        return image;
                }
                Bundle bundle = FrameworkUtil.getBundle(this.getClass());
                URL url = FileLocator.find(bundle, new Path("icons/042.png"), null);
                Image image = ImageDescriptor.createFromURL(url).createImage();
                return image;
        }

}