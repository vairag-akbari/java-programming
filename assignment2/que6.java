package assignment2;
import java.util.Scanner;
// rupees to dollar 
public class que6 {
	public static void main(String[] args) {
		float rupees,currentprice;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter rupees:");
		rupees = sc.nextLong();
		System.out.print("doller price as compare to rupees: ");
		currentprice = sc.nextLong();
		float dollars = rupees / currentprice;
		System.out.print(dollars + " Dollars");
	}
}