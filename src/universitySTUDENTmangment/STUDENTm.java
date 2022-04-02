package universitySTUDENTmangment;

import java.util.*;

public class STUDENTm extends PERSONinfo {
	
	//---------------
	public String getname() {             //ENCAPSULATION(8-28)
	    return firstName;
	}
	public void setName(Scanner scan) {
	    
	    this. firstName = scan.nextLine();
	}
	public String getname1() {
	    return lastName;
	}
	public void setName1(Scanner scan) {
	    
	    this.lastName = scan.nextLine();
	}
	public double getid() {
	    return id;
	}
	public void setid(Scanner scan) {
	   
	    this.id = scan.nextInt();
	}
	
	
//--------------------
	
	{int count=1;	
	
	while (count==1) {
	try {
		Scanner scan=new Scanner(System.in);
		
		  System.out.print("ENTER YOUR FIRSTNAME = " );
		  String firstName=scan.nextLine();
		 //this.firstName=in.nextLine();
		  
		  
		  
		 

		  System.out.print("ENTER YOUR LASTNAME =");
		  String lastName =scan.nextLine();
		  
		  
		 
		  System.out.print("Enter YOUR ID: ");
		  int id = scan.nextInt();

		  
		  System.out.println("WELCOME  "+firstName+"   "+lastName+"  "+"ID NUMBER: "+id);
		 
		  count = 2;
		 
	}   
		  
				
			
	catch(Exception e)
	{

		System.out.println("EXCEPTION " + e);
		System.out.println("WRONG INPUT TRY AGAIN");
	}
	
	}
	
}}