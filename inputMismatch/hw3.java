package hw3;
import java.util.*;


public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isDone = false;
		Scanner scan = new Scanner(System.in);
		
		while (!isDone)
		{
		try
		{

			System.out.println("Input two numbers");
			int firstInput = scan.nextInt();
			int secInput = scan.nextInt();
			System.out.println("The sum is: "+ (firstInput + secInput) );
		 
		isDone = true;
		}
		
		
		catch (InputMismatchException e){
			System.out.println("Uh...try again and choose numbers!!");
			scan.nextLine();
		}
				
		}
		
		
		
		
		
	}

}
