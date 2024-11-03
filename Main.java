public class main{
    public static void main(String[] args) {
        System.out.println(MyMethods.greetUser(name: "ABEL"));
    }
}
class MyMethods{
    public static String greetUser(String name) {
        return "Hello, " + name + "!";
}