package assignment2;
import java.util.Scanner;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class que4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first and the Second number - ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		// selecting the operand for the calculations
		System.out.print("Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
		char op = sc.next().charAt(0);
		solve(a, b, op);
	}

	public static int solve(int a, int b, char op){
		int ans = 0;
		if (op == '+') {
			ans = a + b;
		}
		else if (op == '-') {
			ans = a - b;
		}
		else if (op == '*') {
			ans = a * b;
		}
		else if (op == '%') {
			ans = a % b;
		}
		else if (op == '/') {
			ans = a / b;
		}
		System.out.println("Your answer is - " + ans);
		return ans;
	}
}

