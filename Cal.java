import java.util.Scanner;

public class Cal {

    void add (int num1, int num2){
      int sum = num1 + num2;
      System.out.println(+ sum);

    }
    public static void main(String[] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1 ");
         num1 = scan.nextInt();
        System.out.println("Enter number2 ");
        num2 = scan.nextInt();
        Cal myCal = new Cal();
        myCal.add(num1, num2);
        
    }
}
