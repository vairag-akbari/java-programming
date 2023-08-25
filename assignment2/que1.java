package assignment2;
import java.util.Scanner;
//even or odd
public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number: ");
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.println(a + " is even");
        }
        else{
            System.out.println(a +" is odd");
        }

        // solution 2( ternory operator)
        // String evenOdd = (a % 2 == 0) ? "even" : "odd";
        // System.out.println(a + " is " + evenOdd);

    }
}
