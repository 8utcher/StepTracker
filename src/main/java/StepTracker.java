import java.util.Scanner;

public class StepTracker {

    private MonthData[] monthToData = new MonthData[12];
    Scanner scanner = new Scanner(System.in);
    private int goalByStepsPerDay = 10000;
    private Convertor convertor = new Convertor();

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }


    public void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Не верное значение ");
            return;
        }

        System.out.println("Введите число месяца: ");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Не верное значение");
            return;
        }

        System.out.println("Введите количество шагов зa день: ");
        int steps = scanner.nextInt();

        if (steps <= 0) {
            System.out.println("Количеств шагов должно быть больше 0");
            return;
        }

        int monthIndex = month-1;
        int dayIndex = day-1;

        monthToData[monthIndex].days[dayIndex] = steps;
    }
    public void changeStepGoal() {
        System.out.println("Введите цель по шагам на день: ");
        int steps = scanner.nextInt();
        if (steps > 0){
            System.out.println("Цель по шагам на день изменена на " + steps);
        }
        if (steps <= 0) {
            System.out.println("Количество шагов должно быть больше 0");
        }
    }
    public void printStatistics() {
        System.out.println("Введите номер месяца (1-12): ");
        int month = scanner.nextInt() ;
        if (month < 1 || month > 12) {
            System.out.println("Неверное значение");
            return;
        }
        MonthData currentMonthData = monthToData[month-1];

        System.out.println("Шаги по дням: ");
        currentMonthData.printDaysAndStepsFromMonth();

        int totalSteps = currentMonthData.maxSteps();
        System.out.println("Самое большое количество шагов за месяц: " + totalSteps);

        int averageSteps = totalSteps / 30;
        System.out.println("Среднее количество шагов за месяц: " + averageSteps);

        int distanceKm = convertor.convertToKm(totalSteps);
        System.out.println("Пройденная дистанция в км: " + distanceKm);

        int kilocalories = convertor.covertToKilocalories(totalSteps);
        System.out.println("Количество сожженных калорий: " + kilocalories);

        int bestSeries = currentMonthData.bestSeries(distanceKm);
        System.out.println("Лучшая серия: " + bestSeries + " дня");

        int sumStepsForMonth = currentMonthData.sumStepsFromMonth();
        System.out.println("Сумма шагов за месяц: " + sumStepsForMonth);
    }

}
