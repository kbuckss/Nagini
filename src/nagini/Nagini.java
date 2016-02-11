package nagini;

import environment.ApplicationStarter;

/**
 *
 * @author Katherine
 */
public class Nagini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassCastException {
        ApplicationStarter.run("Nagini Run", new MalfoyManor());
    }

    //things I want to add to my game:
    // - a health counter in the corner - that's text and a live number
    // - some kind of scoring system
    // - snake adds length (YAY FINALLY) and speeds up with time (can't figure that out)
    // - a pause game option, complete with screen allowing you to continue or restart
    // - portals?? that would be the coolest
    // - powerup/poison items randomly generate (DID IT)`, then disappear after you run into them
    
    //where was I last time?
    // - line 241 in MalfoyManor - trying to figure out how to make the snake get longer with time
    
}
