package witten.Client;

import javax.swing.*;
import java.awt.*;

public class PongClient{

    public static PongClient client;

    Renderer render;

    boolean gameRunning, lobbyRunning;

    Paddle topP;
    Paddle leftP;
    Paddle rightP;
    Paddle bottomP;

    Ball ball;

    PongClient()
    {
        render = new Renderer();

        JFrame frame = new JFrame("Pong 4 Friends");
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(render);
        frame.getContentPane().setBackground(new Color(0, 0, 0));

        frame.setVisible(true);

        topP = new Paddle(0);
    }

    public void update()
    {

    }

    public void render()
    {

    }

    public void inLobby()
    {

    }

    public void inGame()
    {
        while(gameRunning)
        {


            update();
            render.repaint();
        }

    }

    public static void main(String[] args) {

        client = new PongClient();
    }
}
