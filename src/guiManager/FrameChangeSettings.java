package guiManager;

import javax.swing.JFrame;

/**
 * @author MELIH AFSAR
 * This class switches between windows.
 */
public class FrameChangeSettings {
    public static void setVisible(JFrame oldFrame, JFrame newFrame){
        oldFrame.setVisible(false);
        newFrame.setVisible(true);
    }
}
