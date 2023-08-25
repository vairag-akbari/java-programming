package lecture0;

import java.util.Scanner;

// Java program to calculate the area of the circle
public class area {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float radius = sc.nextFloat();
		float area = 3.14f * radius * radius;
		System.out.println("Area of circle is :" + area);
	}
}
