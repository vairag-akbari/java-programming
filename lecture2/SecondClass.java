package lecture2;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class SecondClass {
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
