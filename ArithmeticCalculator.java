package java_basics;
import java.util.Scanner;
public class ArithmeticCalculator {
	
        public static void main(String[] args)
		{
			double num1, num2;
			Scanner s = new Scanner(System.in);

			System.out.println("Enter the numbers");

			num1 = s.nextDouble();
			num2 = s.nextDouble();

			System.out.println("Enter the operator + or - or * or / :");

			char op = s.next().charAt(0);

			double o = 0;

			switch (op) {

			case '+':

				o = num1 + num2;

				break;

			case '-':

				o = num1 - num2;

				break;

			case '*':

				o = num1 * num2;

				break;

			case '/':

				o = num1 / num2;

				break;

			default:

				System.out.println("You enter wrong input");

				break;
			}

			System.out.println("The final result:");

			System.out.println();

			System.out.println(num1 + " " + op + " " + num2 + " = " + o);
		}
	}


