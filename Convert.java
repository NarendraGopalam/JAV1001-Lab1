import java.util.Scanner;
/*
Name: Narendra Gopalam
Student Number: A00245541

Program Description: Unit Conversion - Converts One unit to another unit Ex.Km to Mi
*/

public class Convert { //java converter

	public static void main (String args[]) //Start of the program	
	{
		System.out.println("Welcome to Unit Converter"); //Prints Welcome statement
		System.out.println("The following list are the units can be converted and vice versa"); //Prints List Message
		System.out.println("1)KM to MI \n2)CM to IN \n3)KG to LB \n4)G to OZ \n5)C to F \n6)L to Cups"); // Prints List of units can be converted
		
		Scanner sc=new Scanner(System.in); // Used to read the input from console
		String converted_value=""; // Decalred value for the final result
		
		System.out.print("First enter the numeric value to convert:"); // Prints the message to enter first value
		double value_to_be_converted=sc.nextDouble(); // Reads and stores the numeric value in int variable
		System.out.print("Second enter the current unit of measure:"); // Prints the message to enter second value
		String current_unit=sc.next();// Reads and stores the string value in string variable
		
		current_unit=current_unit.toLowerCase(); // converting the string value to lower case for swtich condition
		
		switch (current_unit) //Switch conditon start and reads the current unit to match with the case value and performs the relavent action
		{
		case "km":converted_value=(value_to_be_converted*0.62)+"mi";break; //checks whether current value matches with the case if matches then the following statement will be executed else it will move to next case
		case "mi":converted_value=(value_to_be_converted*1.61)+"km";break;
		case "cm":converted_value=(value_to_be_converted*0.39)+"in";break;
		case "in":converted_value=(value_to_be_converted*2.54)+"cm";break;
		case "kg":converted_value=(value_to_be_converted*2.2)+"lb";break;
		case "lb":converted_value=(value_to_be_converted*0.45)+"kg";break;
		case "g":converted_value=(value_to_be_converted*0.04)+"oz";break;
		case "oz":converted_value=(value_to_be_converted*28.35)+"g";break;
		case "c":converted_value=(((value_to_be_converted*9)/5)+32)+"f";break;
		case "f":converted_value=(((value_to_be_converted-32)*5)/9)+"c";break;
		case "l":converted_value=(value_to_be_converted*4.17)+"cups";break;
		case "cups":converted_value=(value_to_be_converted*0.24)+"l";break;
		default:System.out.println("Please enter unit type correctly. Ex: km,mi,cm,in,kg,,lb,g,oz,c,f,l,cups etc.,"); //if there are any unknown values the the following statemnet will be printed
		}
		if(!converted_value.equals("")){  //checks the value is converted or not
		if(current_unit.equals("c")||current_unit.equals("f")||current_unit.equals("cups")) //checks for the following values of current unit to convert to upper case
		{
			converted_value=converted_value.toUpperCase(); //converts to upper case
		
			if(!current_unit.equals("cups")) //checks for cups as the intial unit is in lower case so there is no need to convert it
			current_unit=current_unit.toUpperCase();
		}
		System.out.println("Converted value is "+converted_value); //Converted value
		System.out.println(value_to_be_converted+current_unit+" is equal to "+converted_value); //Final result is printed
		}
		else
		{
			System.out.println("Try Again");
		}
	
		
	}
}
