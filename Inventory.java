import java.util.Scanner;

public class Inventory {
    int item_quantity = 100;
    void addstock(int num ){
        System.out.println(item_quantity += num); 
    }

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num ");
        int num = scan.nextInt();
        
    }
}
