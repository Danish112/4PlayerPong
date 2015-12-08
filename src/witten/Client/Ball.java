package witten.Client;


public class Ball {

    int oldPosX;
    int oldPosY;

    int newPosX;
    int newPosY;

    Ball()
    {

    }

    public void moveInterpolate()
    {
        //some move action

        oldPosX = newPosX;
        oldPosY = newPosY;
    }

    public void setNewPosX(int newPosX) {
        this.newPosX = newPosX;
    }

    public void setNewPosY(int newPosY) {
        this.newPosY = newPosY;
    }
}
