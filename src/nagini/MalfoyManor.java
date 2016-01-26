package nagini;

import audio.AudioPlayer;
import environment.Environment;
import grid.Grid;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Katherine
 */
class MalfoyManor extends Environment implements CellDataProviderIntf {

    private Grid grid;
    private Snake snake;
    private ArrayList<Barrier> barriers;
    private ArrayList<Item> items;

    public MalfoyManor() {
        //this is my constructor, method that creates the class, named the same as the class
        this.setBackground(Color.white);

        //this is where I'm telling the grid what I want it to do
        grid = new Grid(42, 24, 20, 20, new Point(20, 50), Color.black);
        snake = new Snake(Direction.LEFT, grid);

        //internal barriers
        barriers = new ArrayList<>();
        barriers.add(new Barrier(10, 15, Color.GREEN, this, false));
        barriers.add(new Barrier(10, 16, Color.GREEN, this, false));
        barriers.add(new Barrier(10, 17, Color.GREEN, this, false));
        barriers.add(new Barrier(10, 18, Color.GREEN, this, false));
        barriers.add(new Barrier(10, 19, Color.GREEN, this, false));
        barriers.add(new Barrier(10, 20, Color.GREEN, this, false));

        //left side
        barriers.add(new Barrier(0, 0,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 1,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 2,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 3,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 4,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 5,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 6,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 7,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 8,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 9,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 10,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 11,  Color.BLACK, this, false));

        //internal barriers
        barriers = new ArrayList<>();
        barriers.add(new Barrier(10, 15, Color.GREEN, this, false));
        barriers.add(new Barrier(10, 16, Color.GREEN, this, false));
        barriers.add(new Barrier(10, 17, Color.GREEN, this, false));
        barriers.add(new Barrier(10, 18, Color.GREEN, this, false));
        barriers.add(new Barrier(10, 19, Color.GREEN, this, false));
        barriers.add(new Barrier(10, 20, Color.GREEN, this, false));

        //left side
        barriers.add(new Barrier(0, 0,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 1,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 2,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 3,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 4,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 5,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 6,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 7,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 8,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 9,   Color.BLACK, this, false));
        barriers.add(new Barrier(0, 10,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 11,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 12,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 13,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 14,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 15,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 16,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 17,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 18,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 19,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 20,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 21,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 22,  Color.BLACK, this, false));
        barriers.add(new Barrier(0, 23,  Color.BLACK, this, false));

        //right side
        barriers.add(new Barrier(41, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(41, 1,  Color.BLACK, this, false));
        barriers.add(new Barrier(41, 2,  Color.BLACK, this, false));
        barriers.add(new Barrier(41, 3,  Color.BLACK, this, false));
        barriers.add(new Barrier(41, 4,  Color.BLACK, this, false));
        barriers.add(new Barrier(41, 5,  Color.BLACK, this, false));
        barriers.add(new Barrier(41, 6,  Color.BLACK, this, false));
        barriers.add(new Barrier(41, 7,  Color.BLACK, this, false));
        barriers.add(new Barrier(41, 8,  Color.BLACK, this, false));
        barriers.add(new Barrier(41, 9,  Color.BLACK, this, false));
        barriers.add(new Barrier(41, 10, Color.BLACK, this, false));
        barriers.add(new Barrier(41, 11, Color.BLACK, this, false));
        barriers.add(new Barrier(41, 12, Color.BLACK, this, false));
        barriers.add(new Barrier(41, 13, Color.BLACK, this, false));
        barriers.add(new Barrier(41, 14, Color.BLACK, this, false));
        barriers.add(new Barrier(41, 15, Color.BLACK, this, false));
        barriers.add(new Barrier(41, 16, Color.BLACK, this, false));
        barriers.add(new Barrier(41, 17, Color.BLACK, this, false));
        barriers.add(new Barrier(41, 18, Color.BLACK, this, false));
        barriers.add(new Barrier(41, 19, Color.BLACK, this, false));
        barriers.add(new Barrier(41, 20, Color.BLACK, this, false));
        barriers.add(new Barrier(41, 21, Color.BLACK, this, false));
        barriers.add(new Barrier(41, 22, Color.BLACK, this, false));
        barriers.add(new Barrier(41, 23, Color.BLACK, this, false));

        //top
        barriers.add(new Barrier(1, 0,   Color.BLACK, this, false));
        barriers.add(new Barrier(2, 0,   Color.BLACK, this, false));
        barriers.add(new Barrier(3, 0,   Color.BLACK, this, false));
        barriers.add(new Barrier(4, 0,   Color.BLACK, this, false));
        barriers.add(new Barrier(5, 0,   Color.BLACK, this, false));
        barriers.add(new Barrier(6, 0,   Color.BLACK, this, false));
        barriers.add(new Barrier(7, 0,   Color.BLACK, this, false));
        barriers.add(new Barrier(8, 0,   Color.BLACK, this, false));
        barriers.add(new Barrier(9, 0,   Color.BLACK, this, false));
        barriers.add(new Barrier(10, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(11, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(12, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(13, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(14, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(15, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(16, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(17, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(18, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(19, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(20, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(21, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(22, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(23, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(24, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(25, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(26, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(27, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(28, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(29, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(30, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(31, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(32, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(33, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(34, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(35, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(36, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(37, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(38, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(39, 0,  Color.BLACK, this, false));
        barriers.add(new Barrier(40, 0,  Color.BLACK, this, false));

        //bottom
        barriers.add(new Barrier(41, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(40, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(39, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(38, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(37, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(36, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(35, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(34, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(33, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(32, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(31, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(30, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(29, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(28, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(27, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(26, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(25, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(24, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(23, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(22, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(21, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(20, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(19, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(18, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(17, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(16, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(15, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(14, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(13, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(12, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(11, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(10, 23, Color.BLACK, this, false));
        barriers.add(new Barrier(9,  23, Color.BLACK, this, false));
        barriers.add(new Barrier(8,  23, Color.BLACK, this, false));
        barriers.add(new Barrier(7,  23, Color.BLACK, this, false));
        barriers.add(new Barrier(6,  23, Color.BLACK, this, false));
        barriers.add(new Barrier(5,  23, Color.BLACK, this, false));
        barriers.add(new Barrier(4,  23, Color.BLACK, this, false));
        barriers.add(new Barrier(3,  23, Color.BLACK, this, false));
        barriers.add(new Barrier(2,  23, Color.BLACK, this, false));
        barriers.add(new Barrier(1,  23, Color.BLACK, this, false));

        //putting items in places
        items = new ArrayList<>();
        items.add(new Item(10,  5, "POWER_UP", ResourceTools.loadImageFromResource("nagini/sparkle.jpg"), this));
        items.add(new Item(12, 13,  "POISON",  ResourceTools.loadImageFromResource("nagini/poisonbottle.jpg"), this));
        items.add(new Item(20, 17,  "PORTAL",  ResourceTools.loadImageFromResource("nagini/portal.jpg"), this));
    }

    @Override
    public void initializeEnvironment() {

    }

    int counter;
    int moveDelay = 0;
    int moveDelayLimit = 5;
    //the move delay limit is basically how slow it's gonna go
    //smaller = faster

    @Override
    public void timerTaskHandler() {
        //DON'T PUT COMPUTATIONALLY HEAVY STUFF HERE because it fires really quickly and will slow the program
        //this thing fires 20 times a second

        if (snake != null) {
            //if counted to the limit, then move snake
            if (moveDelay >= moveDelayLimit) {
                moveDelay = 0;
                snake.move();
            } else {
                //else keep counting
                moveDelay++;
            }

            //make a new delay called grwoth delay
            // don't tell the thing to move when the variable happens tell it to move')
            try {
                checkIntersections();
            } catch (InterruptedException ex) {
                Logger.getLogger(MalfoyManor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void checkIntersections() throws InterruptedException {
        //check if the snake's head is inside a wall
        for (Barrier barrier : barriers) {
            if (barrier.getLocation().equals(snake.getHead())) {
                //put own logic here
                //right now when the snake head is in a barrier, health goes down
                snake.addHealth(-1000000);
                AudioPlayer.play("/nagini/LaserCannonNoise.wav");
                JOptionPane.showMessageDialog(null, "HAHA YOU'RE DEAD");
                Thread.sleep(2000);
                //will make the thing stop for 2000 milliseconds or 2 secs
                System.exit(0);
                //^that system exit thing ends the program immediately
            }
        }

        
//            if (snake.getHead().equals(snake.getBody())) {
//                snake.addHealth(-1000);
//                AudioPlayer.play("/nagini/LaserCannonNoise.wav");
//                JOptionPane.showMessageDialog(null, "HAHA YOU'RE DEAD");
//                Thread.sleep(2000);
//                //will make the thing stop for 2000 milliseconds or 2 secs
//                System.exit(0);
//                //^that system exit thing ends the program immediately
//            }
        

        for (Item item : items) {
            if (item.getLocation().equals(snake.getHead())) {
                //if the item is s POISON, the subtract health
                if (item.getType().equals("POISON")) {
                    snake.addHealth(-200);
                    System.out.println("POISON");
                }
                if (item.getType().equals("POWER_UP")) {
                    snake.addHealth(300);
                    System.out.println("POWER_UP");
                }
                if (item.getType().equals("PORTAL")) {
                    //make the snake jump to somewhere else
                    System.out.println("PORTAL");
                }

            }
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
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            AudioPlayer.play("/nagini/LaserCannonNoise.wav");
        } else if (e.getKeyCode() == KeyEvent.VK_G) {
            snake.addGrowthCounter(3);
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

        if (barriers != null) {
            for (int i = 0; i < barriers.size(); i++) {
                barriers.get(i).draw(graphics);
            }
//            for (int i = 0, i < myBarriers.size(); i++) {
//            myBarriers.get(i).draw(graphics);
//            }
        }

        if (items != null) {
            for (int i = 0; i < items.size(); i++) {
                items.get(i).draw(graphics);
            }
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
