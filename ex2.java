public class ex2 {
    public static double ex2(double x) {
        double c = x;
        while ((int) c != c) {
            c *= 10;
        }
        if (FirstNum(c)%2 != 0 & (c%10)%2 != 0) {
            x = c*c;
        } else if (FirstNum(c)%2 == 0 & c%10 == 0) {
            x = c*c*c;
        }
        return x;
    }

    public static int FirstNum(double x) {
        while ((int) x != x) {
            x*=10;
        }
        int v = 0;
        int c = Math.abs((int)x);
        while (c > 0) {
            v = c % 10;
            c /= 10;
        }
        return v;
    }
}
