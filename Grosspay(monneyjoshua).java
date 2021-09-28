import java.util.Scanner;
//The Grosspay application calculates the Gross income of the user
public class Grosspay{
	
public static int hours;
public static int paid;

public static void main(String args[]){
	Grosspay a = new Grosspay();
System.out.println("WAGE CALCULATOR APPLICATION \n");
a.Hours();
a.Paid();
int gross = hours * paid;
System.out.println("Your gross pay is: " + gross + " cedis");

}
//This Hours method asks the user to type the number of hours worked
public void Hours(){
	try{
	Scanner input = new Scanner(System.in);
System.out.println("How many hours do you work:");
int type = input.nextInt();
hours = type;
System.out.println("");
	}catch(Exception InputMismatchException){
		System.out.println("Wrong input,try again \n");
		Hours();
	}
}
//This Paid method asks the user to type the amout of income per the hour
public void Paid(){
	try{
	Scanner input = new Scanner(System.in);
	System.out.println("How much do you get paid per hour:");
	int type = input.nextInt();
	paid = type;
	System.out.println("");
	}catch(Exception InputMismatchException){
		System.out.println("Wrong input,try again \n");
		Paid();
	}
}
}