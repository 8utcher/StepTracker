public class Convertor {

    public double convertToKm(int steps){
        return (steps * 0.75) / 1000;
    }

    public int covertToKilocalories(int steps){
        double distanceInKilocalories = (double) (steps * 50) / 1000;
        return (int) distanceInKilocalories;
    }
}
