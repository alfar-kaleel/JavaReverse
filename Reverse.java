import java.util.*;

public class Reverse{
	
	
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int reverse = 0;
	
	int lastdigit = 0;
	
	System.out.print("Please Enter Your Number : ");
	
	int number = input.nextInt();
	
	while (number > 0){
		
		lastdigit = number % 10;
		
		reverse = (reverse * 10) + lastdigit;
		
		number = number / 10;
		
		
		
		
	}
	
	System.out.println("The Reversed Number is : " + reverse);
	
	
	
	
	
	}
	
}