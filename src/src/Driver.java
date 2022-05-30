
package src;

import javax.swing.UIManager;
import org.pushingpixels.substance.api.skin.SubstanceGeminiLookAndFeel;
//import ui.Home;
import ui.Login;
public class Driver {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("org.pushingpixels.substance.api.skin.SubstanceGeminiLookAndFeel");
            new Login ().setVisible(true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
