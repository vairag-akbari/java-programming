package assignment2;
// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // take input from users
        System.out.print("Enter the principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time: ");
        double time = sc.nextDouble();

        double interest = (principal * time * rate) / 100;

        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Time Duration: " + time);
        System.out.println("Simple Interest: " + interest);

        sc.close();
  }
}

