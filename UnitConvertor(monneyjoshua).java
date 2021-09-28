import java.util.Scanner;
/*a unit converter to
compare data sizes 
*/
//programmed by Monney Joshua
 class UnitConvertor{
public static void main(String args[]){
UnitConvertor access = new UnitConvertor();
access.Data();
}
//the Data method displays the list of all Data sizes(b - tb)
public void Data(){
	try{
UnitConvertor access = new UnitConvertor();
Scanner input = new Scanner(System.in);
System.out.println();
System.out.println("1:Bit ");
System.out.println("2:Byte(B)");
System.out.println("3:Kilobyte(KB)");
System.out.println("4:Megabyte(MB)");
System.out.println("5:Gigabyte(GB)");
System.out.println("6:Terabyte(TB) \n");
System.out.println("Select(1-6): ");
int select = input.nextInt();
System.out.println();
switch(select){
case 1:
access.Bit();
break;
case 2:
access.Byte();
break;
case 3:
access.Kilobyte();
break;
case 4:
access.Megabyte();
break;
case 5:
access.Gigabyte();
break;
case 6:
access.Terabyte();
break;
default:
System.out.println("Invalid choice \n");
access.Data();
break;
}
	}catch(Exception InputMismatchException){
		System.out.println("Input error \n");
		Data();
	}
}
//All Data Named methods are to ask the user which data type to compare
public void Bit(){
UnitConvertor access = new UnitConvertor();
Scanner input = new Scanner(System.in);
System.out.println("1:to Bit ");
System.out.println("2:to Byte(B)");
System.out.println("3:to Kilobyte(KB)");
System.out.println("4:to Megabyte(MB)");
System.out.println("5:to Gigabyte(GB)");
System.out.println("6:to Terabyte(TB)");
System.out.println("7:Back to list \n");
System.out.println("Select(1-7):");
int select = input.nextInt();
switch(select){
case 1:
access.toBit(select);
break;
case 2:
access.toBit(select);
break;
case 3:
access.toBit(select);
break;
case 4:
access.toBit(select);
break;
case 5:
access.toBit(select);
break;
case 6:
access.toBit(select);
break;
case 7:
access.Data();
break;
default:
System.out.println("Invalid choice \n");
access.Bit();
break;
}
}
public void Byte(){
UnitConvertor access = new UnitConvertor();
Scanner input = new Scanner(System.in);
System.out.println("1:to Bit ");
System.out.println("2:to Byte(B)");
System.out.println("3:to Kilobyte(KB)");
System.out.println("4:to Megabyte(MB)");
System.out.println("5:to Gigabyte(GB)");
System.out.println("6:to Terabyte(TB)");
System.out.println("7:Back to list \n");
System.out.println("Select(1-7):");
int select = input.nextInt();
switch(select){
case 1:
access.toByte(select);
break;
case 2:
access.toByte(select);
break;
case 3:
access.toByte(select);
break;
case 4:
access.toByte(select);
break;
case 5:
access.toByte(select);
break;
case 6:
access.toByte(select);
break;
case 7:
access.Data();
break;
default:
System.out.println("Invalid choice \n");
access.Byte();
break;
}
}
public void Kilobyte(){
UnitConvertor access = new UnitConvertor();
Scanner input = new Scanner(System.in);
System.out.println("1:to Bit ");
System.out.println("2:to Byte(B)");
System.out.println("3:to Kilobyte(KB)");
System.out.println("4:to Megabyte(MB)");
System.out.println("5:to Gigabyte(GB)");
System.out.println("6:to Terabyte(TB)");
System.out.println("7:Back to list \n");
System.out.println("Select");
int select = input.nextInt();
switch(select){
case 1:
access.toKilobyte(select);
break;
case 2:
access.toKilobyte(select);
break;
case 3:
access.toKilobyte(select);
break;
case 4:
access.toKilobyte(select);
break;
case 5:
access.toKilobyte(select);
break;
case 6:
access.toKilobyte(select);
break;
case 7:
access.Data();
break;
default:
System.out.println("Invalid choice \n");
access.Kilobyte();
break;
}
}
public void Megabyte(){
UnitConvertor access = new UnitConvertor();
Scanner input = new Scanner(System.in);
System.out.println("1:to Bit ");
System.out.println("2:to Byte(B)");
System.out.println("3:to Kilobyte(KB)");
System.out.println("4:to Megabyte(MB)");
System.out.println("5:to Gigabyte(GB)");
System.out.println("6:to Terabyte(TB)");
System.out.println("7:Back to list \n");
System.out.println("Select");
int select = input.nextInt();
switch(select){
case 1:
access.toMegabyte(select);
break;
case 2:
access.toMegabyte(select);
break;
case 3:
access.toMegabyte(select);
break;
case 4:
access.toMegabyte(select);
break;
case 5:
access.toMegabyte(select);
break;
case 6:
access.toMegabyte(select);
break;
case 7:
access.Data();
break;
default:
System.out.println("Invalid choice \n");
access.Megabyte();
break;
}
}
public void Gigabyte(){
UnitConvertor access = new UnitConvertor();
Scanner input = new Scanner(System.in);
System.out.println("1:to Bit ");
System.out.println("2:to Byte(B)");
System.out.println("3:to Kilobyte(KB)");
System.out.println("4:to Megabyte(MB)");
System.out.println("5:to Gigabyte(GB)");
System.out.println("6:to Terabyte(TB)");
System.out.println("7:Back to list \n");
System.out.println("Select");
int select = input.nextInt();
switch(select){
case 1:
access.toGigabyte(select);
break;
case 2:
access.toGigabyte(select);
break;
case 3:
access.toGigabyte(select);
break;
case 4:
access.toGigabyte(select);
break;
case 5:
access.toGigabyte(select);
break;
case 6:
access.toGigabyte(select);
break;
case 7:
access.Data();
break;
default:
System.out.println("Invalid choice \n");
access.Gigabyte();
break;
}
}
public void Terabyte(){
UnitConvertor access = new UnitConvertor();
Scanner input = new Scanner(System.in);
System.out.println("1:to Bit ");
System.out.println("2:to Byte(B)");
System.out.println("3:to Kilobyte(KB)");
System.out.println("4:to Megabyte(MB)");
System.out.println("5:to Gigabyte(GB)");
System.out.println("6:to Terabyte(TB)");
System.out.println("7:Back to list \n");
System.out.println("Select");
int select = input.nextInt();
switch(select){
case 1:
access.toTerabyte(select);
break;
case 2:
access.toTerabyte(select);
break;
case 3:
access.toTerabyte(select);
break;
case 4:
access.toTerabyte(select);
break;
case 5:
access.toTerabyte(select);
break;
case 6:
access.toTerabyte(select);
break;
case 7:
access.Data();
break;
default:
System.out.println("Invalid choice \n");
access.Terabyte();
break;
}
}
//All to(Data named) methods converts user inputs to required conversions
public void toBit(int bit){
Scanner access = new Scanner(System.in);
if(bit == 1){

System.out.println();
System.out.print("Bit(s):");
float b = access.nextFloat();
b = b * 1f;
System.out.print(b <= 1 ? b+" Bit \n" : b+" Bits \n");
}else if(bit == 2){

System.out.println();
System.out.print("Bit(s):");
float b = access.nextFloat();
b = b * 0.125f;
System.out.print(b <= 1 ? b+" Byte \n" : b+" Bytes \n");
}else if(bit == 3){

System.out.println();
System.out.print("Bit(s):");
float b = access.nextFloat();
b = b * 0.0001220703f;
System.out.print(b <= 1 ? b+" Kilobyte \n" : b+" Kilobytes \n");
}else if(bit == 4){

System.out.println();
System.out.print("Bit(s):");
float b = access.nextFloat();
b = b * 1.19209290E-7f;
System.out.print(b <= 1 ? b+" Megabyte \n" : b+" Megabytes \n");

}else if(bit == 5){

System.out.println();
System.out.print("Bit(s):");
float b = access.nextFloat();
b = b * 1.16415322E-10f;
System.out.print(b <= 1 ? b+" Gigabyte \n" : b+" Gigabytes \n");
}else if(bit == 6){

System.out.println();
System.out.print("Bit(s):");
float b = access.nextFloat();
b = b * 1.13686838E-13f;
System.out.print(b <= 1 ? b+" Terabyte \n" : b+" Terabytes \n");
}
}
public void toByte(int tobyte){
Scanner access = new Scanner(System.in);
if(tobyte == 1){
	
System.out.println();
System.out.print("Byte(s):");
float b = access.nextFloat();
b = b * 8f;
System.out.print(b <= 1 ? b+" Bit \n" : b+" Bits \n");

}else if(tobyte == 2){
	
System.out.println();
System.out.print("Byte(s):");
float b = access.nextFloat();
b = b * 1f;
System.out.print(b <= 1 ? b+" Byte \n" : b+" Bytes \n");

}else if(tobyte == 3){
	
System.out.println();
System.out.print("Byte(s):");
float b = access.nextFloat();
b = b * 0.0009765625f;
System.out.print(b <= 1 ? b+" Kilobyte \n" : b+" Kilobytes \n");

}else if(tobyte == 4){

System.out.println();
System.out.print("Byte(s):");
float b = access.nextFloat();
b = b * 0.0000009537f;
System.out.print(b <= 1 ? b+" Megabyte \n" : b+" Megabytes \n");	

}else if(tobyte == 5){
	
System.out.println();
System.out.print("Byte(s):");
float b = access.nextFloat();
b = b * 0.0000000009f;
System.out.print(b <= 1 ? b+" Gigabyte \n" : b+" Gigabytes \n");	

}else if(tobyte == 6){
	
System.out.println();
System.out.print("Byte(s):");
float b = access.nextFloat();
b = b * 9.09494702E-13f;
System.out.print(b <= 1 ? b+" Terabyte \n" : b+" Terabytes \n");	
}
}
public void toKilobyte(int tokilo){
Scanner access = new Scanner(System.in);
if(tokilo == 1){
	
System.out.println();
System.out.print("Kilobyte(s):");
float b = access.nextFloat();
b = b * 8192f;
System.out.print(b <= 1 ? b+" Bit \n" : b+" Bits \n");

}else if(tokilo == 2){
	
System.out.println();
System.out.print("Kilobyte(s):");
float b = access.nextFloat();
b = b * 1024f;
System.out.print(b <= 1 ? b+" Byte \n" : b+" Bytes \n");

}else if(tokilo == 3){
	
System.out.println();
System.out.print("Kilobyte(s):");
float b = access.nextFloat();
b = b * 1f;
System.out.print(b <= 1 ? b+" Kilobyte \n" : b+" Kilobytes \n");

}else if(tokilo == 4){
	
System.out.println();
System.out.print("Kilobyte(s):");
float b = access.nextFloat();
b = b * 0.0009765625f;
System.out.print(b <= 1 ? b+" Megabyte \n" : b+" Megabytes \n");

}else if(tokilo == 5){
	
System.out.println();
System.out.print("Kilobyte(s):");
float b = access.nextFloat();
b = b * 0.0000009537f;
System.out.print(b <= 1 ? b+" Gigabyte \n" : b+" Gigabytes \n");

}else if(tokilo == 6){
	
System.out.println();
System.out.print("Kilobyte(s):");
float b = access.nextFloat();
b = b * 0.0000000009f;
System.out.print(b <= 1 ? b+" Terabyte \n" : b+" Terabytes \n");
}
}
public void toMegabyte(int tomega){
Scanner access = new Scanner(System.in);
if(tomega == 1){

System.out.println();
System.out.print("Megabyte(s):");
float b = access.nextFloat();
b = b * 8388608f;
System.out.print(b <= 1 ? b+" Bit \n" : b+" Bits \n");

}else if(tomega == 2){
	
System.out.println();
System.out.print("Megabyte(s):");
float b = access.nextFloat();
b = b * 1048576f;
System.out.print(b <= 1 ? b+" Byte \n" : b+" Bytes \n");

}else if(tomega == 3){
	
System.out.println();
System.out.print("Megabyte(s):");
float b = access.nextFloat();
b = b * 1024f;
System.out.print(b <= 1 ? b+" Kilobyte \n" : b+" Kilobytes \n");

}else if(tomega == 4){
	
System.out.println();
System.out.print("Megabyte(s):");
float b = access.nextFloat();
b = b * 1f;
System.out.print(b <= 1 ? b+" Megabyte \n" : b+" Megabytes \n");

}else if(tomega == 5){
	
System.out.println();
System.out.print("Megabyte(s):");
float b = access.nextFloat();
b = b * 0.0009765625f;
System.out.print(b <= 1 ? b+" Gigabyte \n" : b+" Gigabytes \n");

}else if(tomega == 6){
	
System.out.println();
System.out.print("Megabyte(s):");
float b = access.nextFloat();
b = b * 0.0000009537f;
System.out.print(b <= 1 ? b+" Terabyte \n" : b+" Terabytes \n");

}
}
public void toGigabyte(int togiga){
Scanner access = new Scanner(System.in);
if(togiga == 1){
	
System.out.println();
System.out.print("Gigabyte(s):");
float b = access.nextFloat();
b = b * 8589934592f;
System.out.print(b <= 1 ? b+" Bit \n" : b+" Bits \n");

}else if(togiga == 2){
	
System.out.println();
System.out.print("Gigabyte(s):");
double b = access.nextDouble();
b = b * 1073741824;
System.out.print(b <= 1 ? b+" Byte \n" : b+" Bytes \n");

}else if(togiga == 3){
	
System.out.println();
System.out.print("Gigabyte(s):");
float b = access.nextFloat();
b = b * 1048576f;
System.out.print(b <= 1 ? b+" Kilobyte \n" : b+" Kilobytes \n");

}else if(togiga == 4){
	
System.out.println();
System.out.print("Gigabyte(s):");
float b = access.nextFloat();
b = b * 1024f;
System.out.print(b <= 1 ? b+" Megabyte \n" : b+" Megabytes \n");

}else if(togiga == 5){
	
System.out.println();
System.out.print("Gigabyte(s):");
float b = access.nextFloat();
b = b * 1f;
System.out.print(b <= 1 ? b+" Gigabyte \n" : b+" Gigabytes \n");

}else if(togiga == 6){
	
System.out.println();
System.out.print("Gigabyte(s):");
float b = access.nextFloat();
b = b * 0.0009765625f;
System.out.print(b <= 1 ? b+" Terabyte \n" : b+" Terabytes \n");

}
}
public void toTerabyte(int totera){
Scanner access = new Scanner(System.in);
if(totera == 1){
	
System.out.println();
System.out.print("Terabyte(s):");
float b = access.nextFloat();
b = b * 8796093022208f;
System.out.print(b <= 1 ? b+" Bit \n" : b+" Bits \n");

}else if(totera == 2){
	
System.out.println();
System.out.print("Terabyte(s):");
float b = access.nextFloat();
b = b * 1099511627776f;
System.out.print(b <= 1 ? b+" Byte \n" : b+" Bytes \n");

}else if(totera == 3){
	
System.out.println();
System.out.print("Terabyte(s):");
float b = access.nextFloat();
b = b * 1073741824f;
System.out.print(b <= 1 ? b+" Kilobyte \n" : b+" Kilobytes \n");

}else if(totera == 4){
	
System.out.println();
System.out.print("Terabyte(s):");
float b = access.nextFloat();
b = b * 1048576f;
System.out.print(b <= 1 ? b+" Megabyte \n" : b+" Megabytes \n");

}else if(totera == 5){
	
System.out.println();
System.out.print("Terabyte(s):");
float b = access.nextFloat();
b = b * 1024f;
System.out.print(b <= 1 ? b+" Gigabyte \n" : b+" Gigabytes \n");

}else if(totera == 6){
	
System.out.println();
System.out.print("Terabyte(s):");
float b = access.nextFloat();
b = b * 1f;
System.out.print(b <= 1 ? b+" Terabyte \n" : b+" Terabytes \n");

}
}
}