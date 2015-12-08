package witten.Client;

import javax.swing.*;
import java.awt.*;

public class PongClient extends JFrame{

    PongClient()
    {
        super("Pong Game 4 Friends");
        setSize(1000,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0, 0, 0));
    }

    public void setFPS()
    {

    }

    public void renderGame()
    {

    }

    public void inLobby()
    {

    }

    public void inGame()
    {

    }

    public static void main(String[] args) {

        PongClient game = new PongClient();
        game.setVisible(true);
    }
}
