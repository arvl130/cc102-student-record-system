import java.io.*;
import java.util.*;

public class CaseStudy1
{
	public static void main (String[] args) throws IOException
	{
		Scanner SC = new Scanner(System.in);
			
		System.out.println ("Please select a number for the operation.");
		System.out.println ();
		System.out.println ("[1] Registration");
		System.out.println ("[2] Grades Entry");
		System.out.println ("[3] Grades Inquiry");
		System.out.println ("[4] Update Information");
		System.out.println ("[5] Exit");
		System.out.println ();
		System.out.print ("Your choice: ");
		String Operation = SC.nextLine();
		
		
		switch(Operation)
		{
			case "1":
			{
				Registration r = new Registration();
				r.promptStudentData();
				break;
			}
			case "2":
			{
				CaseStudyGradesEntry GRD = new CaseStudyGradesEntry();
				GRD.GradesEntryMenu();
				break;
			}
			case "3":
			{
				CaseStudyGradesInquiry INQ = new CaseStudyGradesInquiry();
				INQ.GradesInquiry();				
				break;
			}
			case "4":
			{
				return ;				
			}
		}
	}
}
