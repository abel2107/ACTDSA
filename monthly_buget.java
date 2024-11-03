public class monthly_buget {
    static int budget = 1000;
    public static double addExpense (double budget, double expense_amount){
        budget -= expense_amount;
        System.out.println("Expense succussfully added!");
        return budget;
    }

    public static double addIncome (double budget, double income_amount){
        budget += income_amount;
        System.out.println("Income_amount succussfully added!");
        return budget;
    }
    public static void main (String[] args){
        addExpense(890, 560);
        addIncome(56, 500);
    }
}
