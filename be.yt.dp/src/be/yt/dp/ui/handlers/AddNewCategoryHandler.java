package be.yt.dp.ui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

import be.yt.dp.ui.controller.TreeViewerPartController;

public class AddNewCategoryHandler {
        @Execute
        public void execute() {
                System.out.println("Add new category handler called");
                TreeViewerPartController controller =  TreeViewerPartController.getInstance();
                controller.addNewCategory("demo");
        }
}