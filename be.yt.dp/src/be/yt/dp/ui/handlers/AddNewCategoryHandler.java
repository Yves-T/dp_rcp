package be.yt.dp.ui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.css.swt.theme.IThemeEngine;

import be.yt.dp.ui.controller.TreeViewerPartController;

public class AddNewCategoryHandler {
        @Execute
        public void execute(IThemeEngine engine) {
                System.out.println("Add new category handler called");
                TreeViewerPartController controller =  TreeViewerPartController.getInstance();
                controller.addNewCategory("demo");
                engine.setTheme("be.yt.dp.standardtheme", true);
        }
}