import javax.swing.JTextField;
import javax.swing.JFrame;
import java.util.EventListener;
import java.awt.Graphics2D;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.KeyListener;

public class Main {
    private static Player player;
    private static JTextField textField;
    private static JFrame gameFrame;
    private static EventListener eventListener;
    private static Graphics2D graphics2D;
    private static JLabel label;
    private static JButton button;
    private static KeyListener keyListener;

    /* Game Frame */

    public static void setupGameFrame(){
        if(gameFrame == null) {
            gameFrame = new JFrame("Game");
        }
    }

    public static JFrame getGameFrame() {
        if (gameFrame != null) {
            return gameFrame;
        }
        return null;
    }

    /* Player */
    public static Player getPlayer(){
        if(player != null) {
            return player;
        }
        return null;
    }

    /* Events */
    public static EventListener getEventListener(){
        if(eventListener != null) {
            return eventListener;
        }
        return null;
    }

    /* Text fields */
    public static JTextField getTextField() {
        if (textField != null) {
            return textField;
        }
        return null;
    }

    /* Graphics */
    public static Graphics2D getGraphics2D(){
        if(graphics2D != null){
            return graphics2D;
        }
        return null;
    }

    /* Labels */
    public static JLabel getLabel(){
        if(label != null){
            return label;
        }
        return null;
    }

    /* Buttons */
    public static JButton getButton() {
        if (button != null) {
            return button;
        }
        return null;
    }

    /* Key listener */
    public static KeyListener getKeyListener(){
        if(keyListener != null) {
            return keyListener;
        }
        return null;
    }
}

