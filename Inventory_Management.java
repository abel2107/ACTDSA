import java.util.Scanner;

public class Inventory_Management {
    static void addstock(int num, int quantity) {
        int total_quantity = quantity + num;
        if (total_quantity > 100){
            System.out.println("SAFE");
        }
        else {
            System.out.println("NOT SAFE");
        }
    }
    static void sell_item(int quantity, int sell_item){
       
       if (quantity - sell_item < 10){
        System.out.println("Can not sell");
       }
       else {
        int sell_item_instock = quantity - sell_item;
       }

    }
    public static void main(String[] args) {
        addstock(10, 100);
        sell_item(100, 50);

    }
}
