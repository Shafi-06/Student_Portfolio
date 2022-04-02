package universitySTUDENTmangment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIo 
{
	 FileIo()
	 {
		  try {
				File file =new File("C:/Users/Sk. ShaFi/eclipse-workspace/GROUP_ASSIGNMENT/src/FileIo/TotalCost");
				Scanner scanner =new Scanner(file);
				while(scanner.hasNext()) {
					String sub=scanner.nextLine();
					String OverAllCost=scanner.nextLine();
					System.out.println("Subject Name = "+sub+" "+"Subject OverAllCost = "+OverAllCost);
					scanner.close();
				}		
				
				
			} 
		  catch (Exception e) {
				
				System.out.println("The Topic You Searched not found");
			}
			
		  
	  }
	 }
	
 
	

