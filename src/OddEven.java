import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int number,remainder ;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an interger number");
		number=input.nextInt();
		input.close();
	/*	remainder=number%2;
		if(remainder==0)
			System.out.printf("%d is Even number",number);
		else
			System.out.printf("%d is Odd number",number);
*/
		
		if(number%2==0)
			System.out.printf("%d is Even number",number);
		else
			System.out.printf("%d is Odd number",number);

	}
	
}
