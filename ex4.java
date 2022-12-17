import static java.lang.Math.*;

public class ex4 {
    public static void y(double x) {
        if (x < 0) {
            System.out.println("При х = "+x+": " + (cos(x)-sin(x)));
        } else if (x > 0 & x < 2) {
            System.out.println("При х = "+x+": " + cos(sin(x*x+5)));
        } else if (x == 2 || x == 0){
            System.out.println("При х = "+x+": " + sin(1));
        } else {
            System.out.println("При х = "+x+": " + (2*pow(cos(x),2) - 1));
        }
    }
}

