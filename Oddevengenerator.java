import java.util.*;
/*
Odd even generator tells user the number typed is an odd or even number
*/
class Oddevengen{
	public static void main(String args[]){
		int x = 1;
		do{
		try{
		Scanner input = new Scanner(System.in);
		System.out.println("ODD & EVEN NUMBER GENERATOR");
		System.out.println("Type any number:");
		int number = input.nextInt();
		x = 2;
		if(number / 2 == 0){
			System.out.println("The number typed is an even number");
		}else{
			System.out.println("The number typed is an odd number");
		}
		}catch(Exception InputMismatchException){
			System.out.println("There's an error in the input typed,try again\n");
		}
		}while(x == 1 );
	}
	/*
	User should type a number for the program to test if it's odd or even
	if the user doesn't type a number
	the error  is caught by an InputMismatchException
	the do while loops allows user to type a number before it exits
	else it keeps looping
	*/
}