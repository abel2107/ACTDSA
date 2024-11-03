public class simpleCal {
    public static double add (double num1, double num2){
        double addition = num1 + num2;
        return addition;
    }
    public static double substract (double num1, double num2){
        double substract = num1 - num2;
        return substract;
    }
    public static double multiple (double num1, double num2){
        double multiple = num1 * num2;
        return multiple;
    }
    public static double division (double num1, double num2){
        double division = num1 / num2;
        return division;
    }
    public static void main(String[] args) {
        System.out.println(add(30, 45));
        System.out.println(substract(78, 10));
        System.out.println(multiple(15, 45));
        System.out.println(division(569, 789));
    }
}
