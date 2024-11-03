public class WeightConverter {
    public static double kilogramToPounds(double kilogram){
        double pounds = kilogram * 2.20462;
        return pounds;
    }
    public static double PoundTokilogram(double pound){
        double kilogram = pound / 2.20462;
        return kilogram;
    }
    public static void main(String[] args) {
        System.out.println(kilogramToPounds(58.25));
        System.out.println(PoundTokilogram(89.265));
    }
}
