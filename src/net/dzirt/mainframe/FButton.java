package net.dzirt.mainframe;

import javax.swing.*;

/**
 * Created by Dzirt on 25.05.2016.
 */
public class FButton extends JButton {
    /**
     * (x,y) - coordinates in grid NxN (3x3 - 6x6), starts by (0,0)
     */
    private Integer x;
    private Integer y;

    /**
     *
     * @param x
     * @param y
     * @param num
     * Constructor with coordinates in grid and number of button
     */
    FButton(Integer x, Integer y, Integer num){
        super("" +num);
        this.x = x;
        this.y = y;
        //this.setText("" + num);
    }

    public int getXCoord() {
        return x;
    }

    public int getYCoord() {
        return y;
    }

    /**
     * moving button method - right
     */
    public void moveRight(){}

    /**
     * moving button method - left
     */
    public void moveLeft(){}

    /**
     * moving button method - up
     */
    public void moveUp(){}

    /**
     * moving button method - down
     */
    public void moveDown(){}
}
