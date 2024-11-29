public class Convertor {

    public int convertToKm(int steps){
        double distanceInKm = (steps * 0.75) / 1000;
        return (int) distanceInKm;
    }

    public int covertToKilocalories(int steps){
        double distanceInKilocalories = (double) (steps * 50) / 1000;
        return (int) distanceInKilocalories;
    }
}
