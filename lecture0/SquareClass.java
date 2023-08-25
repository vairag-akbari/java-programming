package lecture0;

import java.util.Scanner;

public class SquareClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("area of the squre is:" + area );
    }
    
}
