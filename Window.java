import javax.swing.JComponent;
public class Window{
    public void setVisible(boolean visible) {
        Main.getGameFrame().setVisible(visible);
    }

    public void setSize(int width, int height){
        Main.getGameFrame().setSize(width, height);
    }

    public void setCloseOperation(int closeOperation) {
        Main.getGameFrame().setDefaultCloseOperation(closeOperation);
    }

    public void add(JComponent component) {
        Main.getGameFrame().add(component);
    }

    public void remove(JComponent component){
        Main.getGameFrame().remove(component);
    }
}
