package assignment3;
import java.util.Scanner;
//area of circle 
public class que1 {
    public static void main(String[] args) 
    {
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle: "+area);
    }            
}

//area of Triangle 
/*
 Scanner s = new Scanner(System.in);

    System.out.print("Enter the base of the Triangle:");
    double b = s.nextDouble();

    System.out.print("Enter the height of the Triangle:");
    double h = s.nextDouble();
    s.close();

    double area = (b * h) / 2;
    System.out.println("The area of Triangle is: " + area);
*/

//area of Rectangle
/*
 * 
 */
