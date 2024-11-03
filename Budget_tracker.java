import java.util.Scanner;

public class Budget_tracker {
    static int budget = 1000;
    static int addExpense(int Num){
        return budget - Num;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter expense : ");
        int Num = scan.nextInt();
        int result = addExpense(Num);
        System.out.println(result);
    }
}
