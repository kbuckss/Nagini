package nagini;

import java.util.Timer;
import java.lang.*;
import audio.AudioPlayer;
import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import static javax.management.Query.times;
import javax.swing.JOptionPane;

/**
 *
 * @author Katherine
 */
public class Snake {

    //this is a constructor. we pass in direction and a grid reference so the snake has somewhere to generate
    public Snake(Direction direction, Grid grid) {
        this.direction = direction;
        this.grid = grid;

        //create the snake body
        body = new ArrayList<>();
//        body.add(new Point(5, 5));
//        body.add(new Point(5, 4));
//        body.add(new Point(5, 3));
        body.add(new Point(10, 10));
        body.add(new Point(10, 11));
        body.add(new Point(10, 12));
        body.add(new Point(10, 13));

    }

    private Direction direction = Direction.LEFT;
    //direction default is left
    private ArrayList<Point> body;
    //contains an x and y value inside the point, this is a list of x and y
    private Grid grid;
    //how big to draw the snake, lets you know where the top left corner of the cell you're in is
    private Color bodyColor = Color.MAGENTA;
    private Color deadColor = Color.RED;
    private int health = 1000;
    private int growthCounter;

    public void draw(Graphics graphics) {
        graphics.setColor(bodyColor);

        if (isAlive()) {
            graphics.setColor(bodyColor);
        }

        if (!isAlive()) {
            graphics.setColor(deadColor);
        }

        for (int i = 0; i < body.size(); i++) {
//            System.out.println("body location = " + body.get(i).toString());
            graphics.fillOval(grid.getCellSystemCoordinate(body.get(i)).x,
                    grid.getCellSystemCoordinate(body.get(i)).y,
                    grid.getCellWidth(),
                    grid.getCellHeight());
        }
    }

    public void death() throws InterruptedException {
        if (!isAlive()) {
            AudioPlayer.play("/nagini/LaserCannonNoise.wav");
            JOptionPane.showMessageDialog(null, "HAHA YOU'RE DEAD");
            Thread.sleep(2000);
            //will make the thing stop for 2000 milliseconds or 2 secs
            System.exit(0);
            //^that system exit thing ends the program immediately

        }
    }

    public void move() {

        if (isAlive()) {
            //if the snake is alive, THEN it will move.
            //if it's not, it won't
            //it's not alive if the health is <0

            //make a copy of the current head location
            Point newHead = new Point(getHead());

            if (direction == Direction.RIGHT) {
                newHead.x++;
            } else if (direction == Direction.LEFT) {
                newHead.x--;
            } else if (direction == Direction.DOWN) {
                newHead.y++;
            } else if (direction == Direction.UP) {
                newHead.y--;
            }

            //add new head
            getBody().add(0, newHead);

            //delete tail
            //if the growthCounter is greater than 0
            //  - do NOT remove the tail
            //  - subtract one from the growthCounter
            //else (the growthCOunter is less than or equal to zero
            //  - delete the tail
            if (growthCounter > 0) {
                growthCounter--;
                // -- means subtract 1
            } else {
                getBody().remove(body.size() - 1);
            }

        }
    }

    public Point getHead() {
        return getBody().get(0);
    }

    public ArrayList<Point> getBody() {
        return body;
    }

    public void setBody(ArrayList<Point> body) {
        this.body = body;
    }

    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @param health the health to set
     */
    public void addHealth(int health) {
        this.health += health;
    }

    public boolean isAlive() {
        return (health > 0);
    }

    /**
     * @return the growthCounter
     */
    public int getGrowthCounter() {
        return growthCounter;
    }

    /**
     * @param growthCounter the growthCounter to set
     */
    public void setGrowthCounter(int growthCounter) {
        this.growthCounter = growthCounter;
    }

    /**
     * @param growthCounter the growth to add
     */
    public void addGrowthCounter(int growth) {
        this.growthCounter += growth;
    }

}
