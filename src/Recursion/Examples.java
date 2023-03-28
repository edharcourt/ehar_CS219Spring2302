package Recursion;

public class Examples {

    public static int sod(int n) {
        if (n == 0)
            return 0;
        else
            return sod(n/10) + n % 10;
    }

    public static long pow(int x, int y) {
        if (y == 0)
            return 1;
        else
            return pow(x, y - 1) * x;
    }

    // Study: modify to be more general
    // to count the number of times the
    // digit d appears in n
    public static int count7s(int n) {
        if (n == 0)
            return 0;
        else if (n % 10 == 7)
            return 1 + count7s(n / 10);
        else
            return count7s(n / 10);
    }

    public static String reverse(String s) {
        if (s.isEmpty())
            return "";
        else
            return reverse(s.substring(1)) +
                   s.charAt(0);
    }

    // return a copy of s with all of the spaces
    // removed.
    // removeSpaces("able was I") is "ablewasI"
    // Study: draw the runtime stack (call stack)
    // for removeSpace("able was I")
    public static String removeSpaces(String s) {
        if (s.isEmpty())
            return "";
        else if (s.charAt(0) != ' ')
            return s.charAt(0) + removeSpaces(s.substring(1));
        else
            return removeSpaces(s.substring(1));
    }

    public static String toBinary(int n) {
        if (n == 0)
            return "0";
        else
            return toBinary(n/2) + (n % 2);
    }

    public static void main(String[] args) {
      System.out.println(sod(45193) == 22);
      System.out.println(pow(2,10) == 1024);
      System.out.println(pow(10,63));
      System.out.println(count7s(773772) == 4);
      System.out.println(reverse("abcde").equals("edcba"));
      System.out.println(toBinary(31));
      System.out.println(toBinary(417997));
    }
}
