package Lab2;

import java.awt.*;

public class Q10GridBagLayout {
    Q10GridBagLayout(){
        Frame f = new Frame("GridBag Layout");
        Label l1 = new Label("Testing Flow Layout Manager");
        Button b1 = new Button("Flow");
        TextField t1 = new TextField();
        f.setLayout(new GridBagLayout());
        f.add(l1);
        f.add(b1);
        f.add(t1);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Q10GridBagLayout();
    }
}
