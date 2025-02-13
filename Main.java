import javax.swing.JTextField;
import javax.swing.JFrame;
public class Main{
    public static Player player;
    public static JTextField player1_name, player2_name;
    public static Controller controller;
    public static JFrame gameFrame;

    public static JFrame getGameFrame(JFrame frame) {
        if (gameFrame == null) {
            gameFrame = frame;
        }
        gameFrame.setSize(500, 500);
        gameFrame.setVisible(true);
        return gameFrame;
    }

    public static Controller getController(Controller c) {
        if (controller == null) {
            controller = c;
        }
        return controller;
    }

    public static JTextField getText(JTextField p1, JTextField p2) {
        if (player1_name == null) {
            player1_name = p1;
            player2_name = p2;
        }
        player1_name.setVisible(true);
        player2_name.setVisible(true);
        return player1_name;
    }

    public static Player getPlayer(Player p){
        player = p;
        player.axis = new int[4];
        player.scores = new int [2];
        player.names = new String[2];
        return player;
    }

    public static void storeUsernames(){
        player.names[0] = player1_name.getText();
        player.names[1] = player2_name.getText();
    }

    public static void main(String[] args){
    }
};
