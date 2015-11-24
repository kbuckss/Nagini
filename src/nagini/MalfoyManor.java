package nagini;

import environment.Environment;
import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Katherine
 */

class MalfoyManor extends Environment implements CellDataProviderIntf {
    
    private Grid grid;
    private Snake snake;

    public MalfoyManor() {
        //this is my constructor, method that creates the class, named the same as the class
        this.setBackground(Color.white);
        
        //this is where I'm telling the grid what I want it to do
        grid = new Grid(60, 30, 20, 20, new Point(20, 50), Color.black);
        snake = new Snake(Direction.LEFT, grid);
               
    }

    @Override
    public void initializeEnvironment() {

    }

    int counter;

    @Override
    public void timerTaskHandler() {
        //DON'T PUT COMPUTATIONALLY HEAVY STUFF HERE because it fires really quickly and will slow the program
//        System.out.println("hey there amigo");
//        System.out.println("hola amigo " + --counter);
        
        if (snake != null) {
            snake.move();
        }
        
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
//        System.out.println("Key Press " + e.getKeyChar());
//        System.out.println("Key Press " + e.getKeyCode());

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("UP");
            snake.setDirection(Direction.UP);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("DOWN");
            snake.setDirection(Direction.DOWN);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("LEFT");
            snake.setDirection(Direction.LEFT);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("RIGHT");
            snake.setDirection(Direction.RIGHT);
        }

        //you can use the numbers associated with the keys to command things
        //VK_UP means virtual key up arrow
        //that if statement means that if it's true, it will run whatever's in the brackets
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        //drawing the grid yay
        if (grid != null) {
            grid.paintComponent(graphics);
        }
        
        if (snake != null) {
            snake.draw(graphics);
        }
        
    }
    
    public int getCellWidth() {
        return grid.getCellWidth();
        
    }

    public int getCellHeight() {
        return grid.getCellHeight();        
    }
    
    public int getSystemCoordX(int x, int y) {
        return grid.getCellSystemCoordinate(x, y).x;
    }

    public int getSystemCoordY(int x, int y) {
        return grid.getCellSystemCoordinate(x, y).y;
    }

}
