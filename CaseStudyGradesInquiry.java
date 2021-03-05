
import java.io.*;
import java.util.*;

public class CaseStudyGradesInquiry
{
	public static void main (String[] args) throws IOException
	{
		
	}
	
	public static void GradesInquiry() throws IOException
	{
		Scanner SC = new Scanner(System.in);
		
		System.out.println ("\n[A. Individual Grade]: ");
		System.out.println ("[B. Per Class Grade]: ");
		System.out.println ("[C. Individual and Subject Grade]: ");
		System.out.println ("[D. Go Back]: ");
		System.out.println ();
		System.out.print ("Enter Choice: ");
		String Response = SC.nextLine();
		//Retrieve Data from a text Files
		switch(Response)
		{
			case "A":
			{
				CaseStudyIndividualGradesInquiry GRI = new CaseStudyIndividualGradesInquiry();
				GRI.IndividualGradeInquiry();
				break;
			}
			case "B":
			{
				
				break;
			}
			case "C":
			{
				
				break;
			}
		}
	}
	
}