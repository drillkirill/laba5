import java.util.Scanner;

public class ex1 {
    public static int Poryadok(double x) {
        int cnt = 0;
        double c = Math.abs(x);
        while ((int) c/10 >0) {
            c /= 10;
            cnt ++;
        }
        return cnt;
    }

    public static int Sum(double x) {
        while ((int) x != x){
            x*=10;
        }
        x = (int) x;
        int sum = 0;
        while (x > 0) {
            sum += x%10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double fst = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double sec = scanner.nextDouble();
        System.out.println("Введите третье число: ");
        double thr = scanner.nextDouble();
        double[] data = {fst,sec,thr};
        int[] data2 = {1,1,1};
        for (int x = 0; x <= 2; x++){
            System.out.println("Порядок числа "+data[x]+" равен "+Poryadok(data[x]));
            data2[x] = Poryadok(data[x]);
            }
        for (int i = 0; i<=2; i++){
            if (data2[i] == Math.max(data2[0],Math.max(data2[1],data2[2]))) {
                System.out.println("Высший порядок имеет "+data[i]+", следовательно "+Sum(data[i]));
            }
        }
    }
}
