import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите пройти опросник на знание вселенной вселенной Dark Souls?");
        System.out.println("1 - Да, 2 - Нет");
        int l = scanner.nextInt();

        if (l == 1) {
            int i = 0;
            int x;
            System.out.println("1) Кто убил Гвиндолина Темное Солнце?");
            System.out.println("1 - Святой Покровитель Глубин Олдрик");
            System.out.println("2 - Неутомимый воин");
            System.out.println("3 - Палач Смоуг");
            System.out.println("4 - Ведьма Изолита");
            System.out.println("Ответ: ");
            x = scanner.nextInt();
            if (x == 1) {
                i++;
            }
            switch (x) {
                case 1:
                    System.out.println("Верный Ответ");
                    break;
                case 2:
                    System.out.println("Неверный Ответ");
                    break;
                case 3:
                    System.out.println("Неверный Ответ");
                    break;
                case 4:
                    System.out.println("Неверный Ответ");
                    break;
                default:
                    System.out.println("Такого варианта ответа нет");
            }
            System.out.println("2) Кому Повелитель Гвин отдал части Великой Души?");
            System.out.println("1 - Четырём Королям, Нагому Ситу");
            System.out.println("2 - Гвиневер Принцессе Сета, Безымянному Королю");
            System.out.println("3 - Соколиному Глазу Гоху, Клинку Повелителя Сиарану");
            System.out.println("4 - Рыцарю Арториасу, Орнштейну Драконоборцу");
            System.out.println("Ответ: ");
            x = scanner.nextInt();
            if (x == 1) {
                i++;
            }
            switch (x) {
                case 1:
                    System.out.println("Верный Ответ");
                    break;
                case 2:
                    System.out.println("Неверный Ответ");
                    break;
                case 3:
                    System.out.println("Неверный Ответ");
                    break;
                case 4:
                    System.out.println("Неверный Ответ");
                    break;
                default:
                    System.out.println("Такого варианта ответа нет");
            }
            System.out.println("3) Что искал Шива с Востока?");
            System.out.println("1 - Клинок Хаоса");
            System.out.println("2 - Лунный меч");
            System.out.println("3 - Меч Повелителя Могил");
            System.out.println("4 - Яростный меч Квилег");
            System.out.println("Ответ: ");
            x = scanner.nextInt();
            if (x == 1) {
                i++;
            }
            switch (x) {
                case 1:
                    System.out.println("Верный Ответ");
                    break;
                case 2:
                    System.out.println("Неверный Ответ");
                    break;
                case 3:
                    System.out.println("Неверный Ответ");
                    break;
                case 4:
                    System.out.println("Неверный Ответ");
                    break;
                default:
                    System.out.println("Такого варианта ответа нет");
            }
            System.out.println("4) Кого Повелитель Гвин отправил разобраться с бездной в Олачиль?");
            System.out.println("1 - Клинок Повелителя, Сиарана");
            System.out.println("2 - Хавела Скалу");
            System.out.println("3 - Орнштейна Драконоборца");
            System.out.println("4 - Рыцаря Арториаса");
            System.out.println("Ответ: ");
            x = scanner.nextInt();
            if (x == 4) {
                i++;
            }
            switch (x) {
                case 1:
                    System.out.println("Неверный Ответ");
                    break;
                case 2:
                    System.out.println("Неверный Ответ");
                    break;
                case 3:
                    System.out.println("Неверный Ответ");
                    break;
                case 4:
                    System.out.println("Верный Ответ");
                    break;
                default:
                    System.out.println("Такого варианта ответа нет");
            }
            System.out.println("Вы ответили на " + i + " вопроса из 4");
        } else {
             System.out.println("Спасибо за внимание");
        }
    }
}
