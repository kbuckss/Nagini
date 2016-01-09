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
    
}