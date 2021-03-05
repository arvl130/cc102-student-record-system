import java.util.Scanner;
import java.io.*;

public class Registration 
{
    public static void promptStudentData() throws IOException
    {
        Scanner SC = new Scanner(System.in);
        
        // Assume answer yes for empty input.
        String response = "";
                        
        do {
            System.out.print("Data from the student need to be entered. Continue? [Y/n] ");
            response = SC.nextLine();

            // Sanitize input from the user.
            response = response.trim();
            response = response.toLowerCase();
        } while (!response.isEmpty() &&     // Keep asking the user for input
                 !response.equals("y") &&   // until the response is either:
                 !response.equals("n"));    // y, n, or empty.
            
        while (response.equals("y"))
        {                                           
            System.out.print ("Enter Student ID: ");
            String StudentID = SC.nextLine();
            
            PrintStream OutputValue = new PrintStream(new FileOutputStream(StudentID + ".txt"));        
            
            System.out.print ("Enter Last Name: ");
            String LastName = SC.nextLine();
            
            System.out.print ("Enter First Name: ");
            String FirstName = SC.nextLine();
            
            System.out.print ("Enter Middle Name: ");
            String MiddleName = SC.nextLine();          
            
            System.out.print ("Enter Address: ");
            String Address = SC.nextLine();         
            
            System.out.print ("Enter Gender: ");
            String Gender = SC.nextLine();          
            
            System.out.print ("Enter Grade/Year level: ");
            String GradeLevel = SC.nextLine();              
            
            OutputValue.println(StudentID + ";" + LastName + ";" + FirstName + ";" + MiddleName + ";" + Address + ";" + Gender + ";" + GradeLevel + ";");           
            System.out.println ("\nRecord has been Saved. Continue! y/n?"); 
            response = SC.nextLine();
            
            if(response.equals("n"))
            {
                return;
            }
        }
    }
}
