package fit2099;

import java.util.Random;

/**
 * @author vedes
 * @version 1.0
 * @see "generates random numbers"
 */
public class Utils {

    public static int nextID() {
        Random r = new Random();
        int low = 10000;
        int high = 99999;
        return (r.nextInt(high - low) + low);
    }
}
