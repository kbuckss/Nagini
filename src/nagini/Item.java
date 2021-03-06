package nagini;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

/**
 *
 * @author Katherine
 */
public class Item {

    public void draw(Graphics graphics) {
        graphics.drawImage(image,
                cellData.getSystemCoordX(x, y),
                cellData.getSystemCoordY(x, y),
                cellData.getCellWidth(),
                cellData.getCellHeight(), null);
    }

    public Item(int x, int y, String type, Image image, CellDataProviderIntf cellData) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.image = image;
        this.cellData = cellData;
    }

    public Item(Point location, String type, Image image, CellDataProviderIntf cellData) {
        this.x = location.x;
        this.y = location.y;
        this.type = type;
        this.image = image;
        this.cellData = cellData;
    }

    public static final String ITEM_TYPE_POWER_UP = "POWER_UP";
    public static final String ITEM_TYPE_POISON = "POISON";

    //<editor-fold defaultstate="collapsed" desc="Properties">
    private int x, y;
    private String type;
    private Image image;
    private CellDataProviderIntf cellData;

    /**
     * @return the x
     */
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

    public void setLocation(Point location) {
        this.x = location.x;
        this.y = location.y;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }
//</editor-fold>

//    public void setLocation(Point randomGridLocation) {
//        this.x = location.x;
//        this.y = location.y;
//    }
}
