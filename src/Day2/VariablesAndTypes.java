package Day2;

// by convention (not a strict rule)
// class names in Java are capitalized
// camel case
public class VariablesAndTypes {


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

    public static void main(String[] args) {
        int x = 7;
        System.out.println(x * 7);
        x = 8;

        System.out.println(f2c(212));

        // floating-point numbers

        // floats are stored in 32 bits
        // byte is 8 bits 4 bytes
        float e = 2.71828F;  // don't use

        // doubles are stored in 64 bits
        // 8 bytes
        double pi = 3.14159;

        // double electron_mass = .00000000000000000000000000000091093837105;
        final double electron_mass = 9.1093837105e-31;
        // electron_mass = 7;  syntax error

        // final double avagadro = 602214085700000000000000.0;
        final double avagadro = 6.022e23;

        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.pow(Math.PI, Math.E));

        // casting a double to an int
        System.out.println(investment(1,1,1,1e9));

    }

}
