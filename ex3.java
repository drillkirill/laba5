import static java.lang.Math.*;

public class ex3 {
    public static void main(String[] args) {
        for (double x = -3; x <= 3; x += 0.5){
            if (x >= 0){
                System.out.println("При х = "+x+": " + (sin(2*PI*x)-cos(2*PI*x)));
            } else {
                System.out.println("При х = "+x+": " + (3*PI*x));
            }
        }
    }
}