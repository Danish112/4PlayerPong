package witten.Client;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel{

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        PongClient.client.render();
    }


}
