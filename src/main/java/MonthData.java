public class MonthData {

    public int[] days = new int[30];

    public MonthData() {
        for (int i = 0; i < 30; i++) {
            days[i] = 0;
        }
    }

    public void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++)
            System.out.println((i+1) + " день: " + days[i]);
    }

    public int sumStepsFromMonth() {
        int sum = 0;
        for (int i = 0; i < days.length; i++)
            sum += days[i];
        return sum;
    }

    public int maxSteps() {
        int max = days[0];
        for (int step : days)
            if (step > max) max = step;
        return max;
    }

    public int bestSeries(int goalByStepsPerDay) {
        int bestSeries = 0;
        int currentSeries = 0;

        for (int step : days) {
            if (step > goalByStepsPerDay) {
                currentSeries++;
                if (currentSeries > bestSeries) {
                    bestSeries = currentSeries;
                } else {
                    currentSeries = 0;
                }
            }
        }
        return bestSeries;
    }
}
