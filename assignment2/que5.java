package assignment2;
import java.util.Scanner;
// largest number
public class que5 {
    public static void main(String[] args) {
        int num1,num2,largest;
       Scanner sc = new Scanner(System.in);
       System.out.print("enter num1: ");
       num1 = sc.nextInt();
       System.out.print("enter num2: ");
       num2 = sc.nextInt();

       if(num1>num2){
        largest = num1;
       }
       else{
        largest = num2;
       }
       System.out.println("largest: "+largest);

    }
}
