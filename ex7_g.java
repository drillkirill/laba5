import java.util.Scanner;
import static java.lang.Math.*;

public class ex7_g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите х в диапазоне [-4,4]");
        double x = scanner.nextDouble();
        if (x > 4 || x < -4) {
            System.out.println("Неверный х");
        } else if (x <= 0) {
            System.out.println("g = " + ((3*x*x + tan(2*x+3))/(1 + 4*x*x + E)));
        } else {
            System.out.println("g = " + ((2*x + pow(cos(x),3) - pow(sin(x),2))/
                    (1+x*x)));
        }
    }
}