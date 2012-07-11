package be.yt.dp.ui.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;

public class ExitHandler {
        @Execute
        public void execute(IWorkbench workbench) {
                System.out.println("exit called");
                workbench.close();
        }

        @CanExecute
        public boolean canExecute() {
                return true;
        }
}