public class Tempconverter {
    public static double celsiusTofahrenheit(double celsius){
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("convert successfully!");
        return fahrenheit;
    }
    public static double fahrenheitTocelsius(double fahrenheit ){
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("convert successfully!");
        return celsius ;
    }

    public static void main(String[] args){
       System.out.println(celsiusTofahrenheit(73.5));
       System.out.println(fahrenheitTocelsius(23.2));
    }
}
