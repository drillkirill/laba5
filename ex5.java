import java.util.Scanner;
import static java.lang.Math.*;

public class ex5 {
    public static boolean fst(double x, double y) {
        if (4 >= pow(x+1,2) + pow(y-1,2) & x <= -1) {
            return true;
        }
        return false;
    }
    public static boolean sec(double x, double y) {
        if (y <= -3/2 * x  + 3.5 & y >= -2 * x  -1  &
                x >= -1 & y >= 3*x -1) {
            return true;
        }
        return false;
    }
    public static boolean thr(double x, double y) {
        if (y >= abs(x-3) & y <= 1)  {
            return true;
        }
        return false;
    }
    public static boolean foh(double x, double y) {
        if (4 >= pow(x-4,2) + pow(y+1,2) & y <= x-3 & y >= x -7){
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
        if (fst(x,y) || sec(x,y)) {
            System.out.println("Попадание в левую фигуру");
        } else if(thr(x,y) || foh(x,y)){
            System.out.println("Попадание в правую фигуру");
        } else {
            System.out.println("Не попала");
        }
    }
}

