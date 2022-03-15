/**
 * @author Robin Johnson
 * 
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionExample{
	public static int quotient(int numerator, int denominator)throws ArithmeticException{
		return numerator / denominator;
	}

	public static void main(String[] args){
		Scanner in_scanner = new Scanner(System.in);
		boolean contLoop = true;
		do{
			try{
				System.out.println("Enter interger numerator");
				int numerator = in_scanner.nextInt();
				System.out.println("Enter interger demoninator");
				int denominator = in_scanner.nextInt();

				int result = quotient(numerator,denominator);

				System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
			}
			catch (InputMismatchException errorInputMismatchException){
				System.err.printf("\nException: %s\n", errorInputMismatchException);
				in_scanner.nextLine();
				System.out.println("You must enter interger values. Please try again!");
			}
			catch(ArithmeticException errorArithmeticException){
				System.err.printf("\nException: %s\n", errorArithmeticException);
				in_scanner.nextLine();
				System.out.println("Denominator can't be zero, undefined result. Please try again!");
			}
		}while(contLoop);
	}
}