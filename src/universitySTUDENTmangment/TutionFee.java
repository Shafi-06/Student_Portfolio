package universitySTUDENTmangment;
import java.util.Scanner;

public class TutionFee extends STUDENTm 
{
	
	public String courses=" ";
	public double TotalTutionFee=0;
	final double  CostOfCourse=600; //(FINAL KEYWORD USED)
	
	
	
	
	
	
	public void enroll() 
	{
		
		 
		
		
		
		int count=1;
		while( count==1 ) {
			
		
		System.out.println("ENTER THE COURSES YOU WANT TO ENROLL");
		System.out.println("IF YOU WANT TO QUIT PRESS Q \n ");
		Scanner in =new Scanner(System.in);
		String course=in.nextLine();
		if(!course.equals("Q")) {
			courses= courses + "  "+ course;
			TotalTutionFee=TotalTutionFee+CostOfCourse;}
			
			else {
				
				break;
			}
			}		
		
		System.out.println("COURSE ENROLLED  IN=    COURSE NO:" + courses);
		//System.out.println("YOUR TOTAL TUTION FEE =  "+ TotalTutionFee);
		
		}
	
	
		
		}


