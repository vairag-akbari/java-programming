package lecture00;

import java.util.Scanner;

public class TenClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if(A >= B){
            System.out.println(A + " is grater than " + B);
        }
        else{
            System.out.println(A + " is less than " + B );
        }
    }
}
