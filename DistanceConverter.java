public class DistanceConverter {
    public static double kilometersToMiles(double kilometers){
        return kilometers * 0.621371;
    }
    public static double MilesToKilometers(double Miles){
        return Miles * 1.60934;
    }
    public static void main(String[] args) {
        System.out.println(kilometersToMiles(789));
        System.out.println(MilesToKilometers(589));
    }
}
