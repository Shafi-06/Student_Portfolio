package universitySTUDENTmangment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.InputMismatchException;
public class TeSt {

	public static void main(String[] args)
	{
		
		
	//Scanner input =new Scanner(System.in);

		final String PASSWORD = "admin";     //final keyword is used
	    Scanner scan = new Scanner(System.in);
	    int attempts = 3;
	    String password = "";
	    while (attempts-- > 0 && !PASSWORD.equals(password)) //compares and then decrements
	    {
	        System.out.print("Enter your password: ");
	        password = scan.nextLine();
	        if (password.equals(PASSWORD)) 
	            System.out.println("LOGIN SUCCESSFUL !");
	        else 
	            System.out.println("Incorrect Password. PLEASE TRY AGAIN: " );        
	    }
			
		 OtherInformation stu1 = new OtherInformation();                                                       
		 
		
		
		System.out.println("\n******CHOOSE YOUR DEPARTMENT******  ");
		System.out.println("/t/t >> DEPARTMENT OF EEE ");
		System.out.println("/t/t >> DEPARTMENT OF LAW ");
		
		
		boolean Choice=true;
		
while(Choice==true) {if(Choice=true) {
		
		
		int UserChoice;
		System.out.println("Enter your choice (1/2) =");
		Scanner scanner =new Scanner(System.in);
		
		
	 UserChoice = scanner.nextInt();
			
		 switch(UserChoice) {
		  case 1:
			  showSUB1();
		    break;
		  case 2:
			  showSUB2();
		    break;
		    
		  
		    
		  default:}     Choice=false;   }


else {System.out.println("Invalid input try again");}}
//----------------------------------------------------1
String choice1 = "y";

System.out.print("Do you want enroll in course? (y/n): ");
choice1 = scan.next();
 if (choice1.equalsIgnoreCase("y")) {

	 
	 stu1.enroll();
	 String choice2 = "y";

	 System.out.print("Do you want to pay your tution fee ? (y/n): ");
	 choice2 = scan.next();
	  if (choice2.equalsIgnoreCase("y")) {  //--------------2
 //-----------------------------------------------------2
		  stu1.viewbalance();
		  stu1.payedTution();
	  }//2
	  else {System.out.println("Thank you for staying with us ");
	       System.out.println("If you want to continue,Please give your password again ");
	       main(args);
	  }//2
	 
	 }//1
 
 else {System.out.println("Thank you for staying with us ");}//1
//--------------------------------------------------------1         
		 
		
		
		 
		 
		 
		 
		 String choice = "y";
		 
		 System.out.print("Do you want to get an idea about your overall cost? (y/n): ");
         choice = scan.next();
	      if (choice.equalsIgnoreCase("y")) {		 
		 
	      //}
	
 //-----------------------------------------------------------------------------------
		  try {
				File file =new File("C:/Users/Sk. ShaFi/eclipse-workspace/GROUP_ASSIGNMENT/src/FileIo/TotalCost.txt");
				Scanner scanner =new Scanner(file);
				while(scanner.hasNext()) {
					String sub=scanner.next();
					
					String OverAllCost=scanner.next();
					System.out.println("Subject Name  = "+sub+" "+"        Subject OverAllCost  =  "+OverAllCost);
					
				}	
				scanner.close();
		 }
		 catch(Exception e) {}				
//-----------------------------------------------------------------------------------		
	        } 
		 
	
	
		
		
		
	
		
	
		
		
	
	}
		        static void showSUB1() {
				  DepEEE a1=new DepEEE();
				  a1.Disp("1)Electronic 101  ,","2) CIRCUIT 101  ","3) MATH 22   ","4) PHYSIC 321   ",") CAD 441  ");
				  }
			

			  static void showSUB2() {
				  DepLAW a1=new DepLAW();
			  a1.Disp("1) BANGLADESH LAW 103," , "2)CASE STUDY 201  ","3) LAND LAW 521  ","4) Equity and Trusts 721  ","5)Law of Torts 941  " );}
			  
			  
			  
			  }


	   
