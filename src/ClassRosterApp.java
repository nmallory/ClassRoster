
import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ClassRosterApp {
	
    //Public class console
	private static Scanner sc = new Scanner(System.in);
	
	public static void displayLine(){
		System.out.println();
	}
	
	public static void displayLine(String s){
		System.out.println(s);
	}
	
	public static String getString(String s){
		System.out.println(s);
		String console = sc.nextLine();
		return s;
	}

	
	public static int getInt(String prompt){
		int i =0;
		while(true){
			System.out.println(prompt);
			try{
				i = Integer.parseInt(sc.nextLine());
				break;
			}catch (InputMismatchException e){
				System.out.println("error! Enter another number");
			}
		}
		 return i; 
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
	
		 //Allocates memory for 20 strings
		String[] studentArray = new String[20];
		
		studentArray[0] = "Nicole";
		studentArray[1] = "Armani";
		studentArray[2] = "Yasmine";
		studentArray[3] = "Tyler";
		studentArray[4] = "Daniel";
		studentArray[5] = "Dominique B";
		studentArray[6] = "David";
		studentArray[7] = "Dominique E";
		studentArray[8] = "Zalika";
		studentArray[9] = "Jennifer";
		studentArray[10] = "Johnny";
		studentArray[11] = "Kevin";
		studentArray[12] = "Mikhil";
		studentArray[13] = "Elle";
		studentArray[14] = "Clark";
		studentArray[15] = "Seth";
		studentArray[16] = "Kim D";
		studentArray[17] = "Ryan";
		studentArray[18] = "Jeseekia";
		studentArray[19] = "Tricia";
	
		
		String[] studentHometown = new String[20];
		
		studentHometown[0] = "Detroit";
		studentHometown[1] = "Detroit";
		studentHometown[2] = "Detroit";
		studentHometown[3] = "Monroe";
		studentHometown[4] = "Hamtramck";
		studentHometown[5] = "Detroit";
		studentHometown[6] = "Detroit";
		studentHometown[7] = "Detroit";
		studentHometown[8] = "Detroit";
		studentHometown[9] = "Detroit";
		studentHometown[10] = "Detroit";
		studentHometown[11] = "Detroit";
		studentHometown[12] = "Detroit";
		studentHometown[13] = "Detroit";
		studentHometown[14] = "Detroit";
		studentHometown[15] = "Detroit";
		studentHometown[16] = "Detroit";
		studentHometown[16] = "Detroit";
		studentHometown[18] = "Detroit";
		studentHometown[19] = "Detroit";
	
		 
		String[] studentFood = new String[20];
		
		studentFood[0] = "Mexican";
		studentFood[1] = "Salmon";
		studentFood[2] = "Pizza";
		studentFood[3] = "Tacos";
		studentFood[4] = "Daniel";
		studentFood[5] = "Pizza";
		studentFood[6] = "Steak";
		studentFood[7] = "Shrimp";
		studentFood[8] = "Pasta";
		studentFood[9] = "Italian";
		studentFood[10] = "Thai";
		studentFood[11] = "Tacos";
		studentFood[12] = "Chicken";
		studentFood[13] = "Salmon";
		studentFood[14] = "Pizza";
		studentFood[15] = "Salad";
		studentFood[16] = "Ice Cream";
		studentFood[17] = "Cheeseburgers";
		studentFood[18] = "Lasagna";
		studentFood[19] = "Mashed Potatoes";
		
		String food = "";
		String choice ="yes";
		
		//Welcome message
		System.out.println("Welcome to our Java Class");
	
		
		// Prompt user to ask about a particular user
		System.out.println("Which student would you like to learn more about? (enter a number 1-20):");
		int name  = console.nextInt( );
		
	
		for (int i=0; i < studentArray.length; i++ ) {
			System.out.println("Student"  + " is " + studentArray[name]);
			break;
		
		}
		
		for (int i=0; i < studentHometown.length; i++ ) {
			System.out.println("What would you like to know about " + studentArray[name] + "? (enter 'hometown' or 'favorite food'):");
			String hometown = sc.nextLine();

			if(hometown.equalsIgnoreCase(hometown)){
				System.out.println(studentArray[name] + " is from " + studentHometown[name]);
				
				System.out.println("Would you like to know more? (enter 'y' or 'n'):");
				
				//System.out.println(studentArray[name] + " loves " + studentFood[name]);
				
				//Clears out scanner
				sc.nextLine();
				
			}while(choice.equalsIgnoreCase("y")){
				
			}
			}
			
	}	
		}	
	//}	
//}			
				
		
			
			
		
	
		//}
			
		//}
		
	
			
		//}//end while


	
		//Validate input
	
	
	

