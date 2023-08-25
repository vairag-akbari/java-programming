package lecture00;

import java.util.Scanner;

public class NineClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("you are elegible to vote and drive");
        }
        else if(age>13 && age<18){
            System.out.println("you are teenager");
        }
        else{
            System.out.println("you are no eligible for vote and drive");
        }
    }
}
