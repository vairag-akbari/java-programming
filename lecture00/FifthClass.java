package lecture00;

import java.util.Scanner;

public class FifthClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if((A>=B) && (A>=C)){
            System.out.println("largest is: " + A );
        }
        else if  (B >= C){
            System.out.println("largest is: " + B );
        }
        else{
            System.out.println("largest is: " + C );
        }
    }
    
}
