import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello World");

        int iterator;
        for (iterator = 0; iterator < 5; iterator++) {
            System.out.println(iterator);
        }

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//
//        String name= sc.nextLine();
//        System.out.println("hello  " + name);


        System.out.println("Day1 of coding again with a Simple Calculator");
//        while (true) {
            System.out.println("enter first number: ");
            double i = sc.nextDouble();
            System.out.println("enter second number: ");
            double j = sc.nextDouble();
            double result = 0;
            System.out.println("choose an operation (+, -, *, %, /");
            char operator = sc.next().charAt(0);

            if (operator == '+') {
                result = i + j;
            } else if (operator == '-') {
                result = i - j;
            } else if (operator == '*') {
                result = i * j;
            } else if (operator == '/') {
                result = j / i;
            } else if (operator == '%') {
                result = j % i;
            } else {
                System.out.println("Not able to recognize operator");
            }

            System.out.println("Result: " + result);
//        }

        car mycar = new car("tata", "red", 0);
        mycar.start();
        mycar.accelerate(20);
        mycar.displayInfo();
        mycar.brake();

    }
}