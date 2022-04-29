package guiManager;

import javax.swing.JFrame;

/*@author AFSAR*/
public class FrameChangeSettings {
    public static void setVisible(JFrame oldFrame, JFrame newFrame){
        oldFrame.setVisible(false);
        newFrame.setVisible(true);
    }
}
