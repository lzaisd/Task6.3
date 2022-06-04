import frame.SortDemoFrame;
import util.SwingUtils;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        EventQueue.invokeLater(() -> {
            try {
                JFrame frameMain = new SortDemoFrame();
                frameMain.setVisible(true);
            } catch (Exception ex) {
                SwingUtils.showErrorMessageBox(ex);
            }
        });
    }
}
