import java.util.Scanner;
import static java.lang.Math.*;

public class ex7_z {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите х в диапазоне [-4,4]");
        double x = scanner.nextDouble();
        if (x > 4 || x < -4) {
            System.out.println("Неверный х");
        } else {
            if (x < 0) {
                System.out.println("z = " + (3*x + pow(E+x*x,(1/4))/2*abs(x-2)));
            } else if (x >= 0 & x <= 1) {
                System.out.println("z = " + (2*cos(x)*exp(-2*x) + 2*PI*x));
            } else {
                System.out.println("z = " + (2*sin(3*x) - tan(x*x*x - x*x)));
            }
        }
    }
}