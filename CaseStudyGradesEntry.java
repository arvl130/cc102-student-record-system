
import java.io.*;
import java.util.*;

public class CaseStudyGradesEntry
{
	public static void main (String[] args) throws IOException
	{
		GradesEntryMenu();
	}
	public static void GradesEntryMenu() throws IOException
	{
		Scanner SC = new Scanner(System.in);
		
		System.out.println ();
		System.out.println ("[1] Individual Grades Entry");
		System.out.println ("[2] Grades Entry per Class");
		System.out.println ("[3] Back");
		System.out.println ();
		System.out.println ("Please enter your choice: ");
		String Response = SC.nextLine();
		switch(Response)
		{
			case "1":
			{
				CaseStudyIndividualGradesentry GRD = new CaseStudyIndividualGradesentry();
				GRD.IndividualGradeEntry();
				break;
			}
			case "2":
			{
				
				break;
			}
			case "3":
			{
				
				break;
			}
		}
	}
}