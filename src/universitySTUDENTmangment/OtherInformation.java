package universitySTUDENTmangment;
import java.util.Scanner;

public class OtherInformation extends Other
{

	
	public void viewbalance() 
	{
		System.out.println("Your tution fee is =  "+  TotalTutionFee);
		
	}

	
	public void payedTution() { 

	
	System.out.println("Enter your the amount of money you want to pay =  ");
	Scanner in= new Scanner(System.in);
	int payment=in.nextInt();
	TotalTutionFee = TotalTutionFee -payment;
	System.out.println("Till now you have paid = "+ payment);
	viewbalance();
		
	}

}