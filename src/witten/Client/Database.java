package witten.Client;


public class Database{

    Paddle topPaddle;
    Paddle leftPaddle;
    Paddle rightPaddle;
    Paddle bottomPaddle;

    Ball ball;

    Database()
    {

    }

    /** Setters **/

    public void updateTopPaddle(int xpos, int ypos)
    {
        topPaddle.setNewPosX(xpos);
        topPaddle.setNewPosY(ypos);
    }

    public void updateLeftPaddle(int xpos, int ypos)
    {
        leftPaddle.setNewPosX(xpos);
        leftPaddle.setNewPosY(ypos);
    }

    public void updateRigtPaddle(int xpos, int ypos)
    {
        rightPaddle.setNewPosX(xpos);
        rightPaddle.setNewPosY(ypos);
    }

    public void updateBottomPaddle(int xpos, int ypos)
    {
        bottomPaddle.setNewPosX(xpos);
        bottomPaddle.setNewPosY(ypos);
    }

    public void updateBall(int xpos, int ypos)
    {
        ball.setNewPosX(xpos);
        ball.setNewPosY(ypos);
    }


    /** Getters **/

}
