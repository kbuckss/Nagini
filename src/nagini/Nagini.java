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
    
    //where was I last time?
    // 115ish with the locations
    
}

//in paint method, we caould make it game state print screen PAUSED then we could make it say that on the screen
