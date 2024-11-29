import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            printMenu();
            System.out.println("Введи команду: ");
            int n = scanner.nextInt();
            if (n == 1) {
                stepTracker.addNewNumberStepsPerDay();
            }else if (n == 2) {
                stepTracker.changeStepGoal();
            }else if (n == 3) {
                stepTracker.printStatistics();
            }else if(n == 4) {
                break;
            } else if (n>4 || n<1) {
                System.out.println("Неверное значение");
            }
        }
    }
    public static void printMenu() {
        System.out.println("Меню: ");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Изменить цель по количеству шагов в день");
        System.out.println("3. Напечатать статистику за определённый месяц");
        System.out.println("4. Выйти из приложения");
    }
}
