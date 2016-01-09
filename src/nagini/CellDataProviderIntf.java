package nagini;

/**
 *
 * @author Katherine
 */

public interface CellDataProviderIntf {
    
    public int getCellWidth();
    public int getCellHeight();
    
    public int getSystemCoordX(int x, int y);
    public int getSystemCoordY(int x, int y);
    
}
