import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число отвечающее за номер в топе 8 быстрых земноводных");
        int x = scanner.nextInt();
        switch (x){
            case 1:
                System.out.println("Сапсан, скорость равна 389 км/ч");
                break;
            case 2:
                System.out.println("Беркут, скорость равна 241 км/ч");
                break;
            case 3:
                System.out.println("Бразильский складчатогуб, скорость равна 160 км/ч");
                break;
            case 4:
                System.out.println("Сероголовый альбатрос, скорость равна 127 км/ч");
                break;
            case 5:
                System.out.println("Гепард, скорость равна 120 км/ч");
                break;
            case 6:
                System.out.println("Черный Марлин, скорость равна 105 км/ч");
                break;
            case 7:
                System.out.println("Калипта Анны, скорость равна 98,2 км/ч");
                break;
            case 8:
                System.out.println("Вилорог, скорость равна 88,5 км/ч");
                break;
            default:
                System.out.println("Ошибка данных");
        }
    }
}
