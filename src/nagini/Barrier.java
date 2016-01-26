package nagini;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Katherine
 */

public class Barrier {

    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fill3DRect(cellData.getSystemCoordX(x, y),
                            cellData.getSystemCoordY(x, y),
                            cellData.getCellWidth(),
                            cellData.getCellHeight(),
                            true);
    }
    
    public Barrier(int x, int y, Color color, CellDataProviderIntf cellData, boolean breakable) {
        this.x = x;
        this.y = y;
        this.cellData = cellData;
        this.color = color;
        this.breakable = false;
    }
    
    private int x;
    private int y;
    private Color color;
    private boolean breakable = false;
    private CellDataProviderIntf cellData;
    
    public Point getLocation() {
        return new Point(x, y);
    }

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
