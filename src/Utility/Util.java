package Utility;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Util {
    /**
     *
     * @param c - initial deposit
     * @param r - yearly interest rate
     * @param t - number of years
     * @param n - number of time to compound
     * @return Returns the value of the investment
     */
    public static double investment(double c, double r, double t, double n) {
        return c*Math.pow(1 + r/n, t*n);
    }

    public static double f2c(double f) {
        return 5/9.0*(f - 32);
    }

    /**
     *
     * @param t - temperature in F
     * @param v - wind velocity in MPH
     * @return - Windchill in F
     */
    public static double windchill(
         double t, double v) {

        return 35.74 + 0.6215*t +
               (0.4275*t -35.75)*Math.pow(v,.16);
    }

    public static Scanner openSite(String path) {
        try {
            URL url = new URL(path);
            return new Scanner(
               url.openConnection().
                   getInputStream()
            );
        } catch (MalformedURLException e) {
            System.out.println("Error: malformed URL");

            // null is the empty object
            return null;
            //throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error: cannot access site.");
            return null;
            //throw new RuntimeException(e);
        }
    } // openSite

}  // class Util
