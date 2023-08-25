package assignment2;
import java.util.Scanner;
//fibonacci series 
public class que7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("for which number: ");
        int n = sc.nextInt();
        
        int a = 0;
        int b = 1;
        
        for(int i = 0;i<n;i++){
            System.out.print(" "+a);
            System.out.println();
            int c = a+b;
            a = b;
            b = c;
        }
        
    }
}
