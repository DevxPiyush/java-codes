import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {
        sum(); 
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = sc.nextInt();
        System.out.println("enter number 2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is " + sum);
    }
}
