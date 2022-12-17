import java.util.Scanner;
import static java.lang.Math.*;

public class ex6 {
    public static boolean okr(double x, double y) {
        if (36 >= x*x + y*y & y <= 0) {
            return true;
        }
        return false;
    }
    public static boolean notDirHit(double x, double y) {
        if (4 > pow(x-3,2) + pow(y+2,2) || (y > 5*x - 5
                & y > -5/2*(x+5) & y > -5 & y < 0)) {
            return true;
        }
        return false;
    }
    public static boolean DirHit(double x, double y) {
        if (1 >= pow(x-3,2) + pow(y+2,2) ||
                1 >= pow(x+1,2) + pow(y+3,2) ||
                1 >= pow(x+3,2) + pow(y+1,2)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x");
        double x = scanner.nextDouble();
        System.out.println("Введите y");
        double y = scanner.nextDouble();
        if (okr(x,y)) {
            if (notDirHit(x,y)) {
                if (DirHit(x,y)) {
                    System.out.println("Попадание в фигуру");
                } else {
                    System.out.println("Не попала");
                }
            } else {
                System.out.println("Попадание в фигуру");
            }
        } else {
            System.out.println("Не попала");
        }
    }
}