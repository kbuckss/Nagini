/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagini;

import java.awt.Color;

/**
 *
 * @author Katherine
 */
public class Barrier {
    
    public Barrier(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.breakable = false;
    }
    
    private int x;
    private int y;
    private Color color;
    private boolean breakable = false;

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the breakable
     */
    public boolean isBreakable() {
        return breakable;
    }

    /**
     * @param breakable the breakable to set
     */
    public void setBreakable(boolean breakable) {
        this.breakable = breakable;
    }
    
}
