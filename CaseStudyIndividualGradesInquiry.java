import java.io.*;
import java.util.*;

public class CaseStudyIndividualGradesInquiry
{
	public static void main (String[] args) throws IOException
	{
		IndividualGradeInquiry();
	}
	
	public static void IndividualGradeInquiry() throws IOException
	{
		Scanner SC = new Scanner(System.in);
		
		System.out.println ("Find a Record: ");
		String STUID = SC.nextLine();
			
		BufferedReader ReadStudentRecord = new BufferedReader(new FileReader(STUID + ".txt"));	
		String Recs = "";

				
			while(Recs != null)
			{
				try
				{
					Recs = ReadStudentRecord.readLine();//Per Line Reading
					if (Recs.contains(STUID) == true)
					{
						//System.out.println (Recs);
						String []StudentRecord;
						StudentRecord = Recs.split(";");
						
						System.out.println ("\nStudent ID: \t\t\t" + StudentRecord[0]);
						System.out.println ("Student Name: \t\t\t" + StudentRecord[1] + ", " + StudentRecord[2] + " " + StudentRecord[3].substring(0,1) + ".");
						System.out.println ("Address: \t\t\t\t" + StudentRecord[4]);
						System.out.println ("Gender: \t\t\t\t" + StudentRecord[5]);
						System.out.println ("Grade/Year Level: \t\t" + StudentRecord[6]);
						
						break;
						
					}
					else
					{
																				
					}
					
				}
				catch(Exception ex)
				{
					//System.out.println ("Error!");
					return ;
				}				
			}
			
		System.out.print ("\nPlease Enter a Subject: ");
		String SBJ= SC.nextLine();		
		
		BufferedReader ReadStudentSubject = new BufferedReader(new FileReader( STUID + "-" + SBJ + ".txt"));	
		String SubjectRecs = "";
		
			while(SubjectRecs != null)
			{
				try
				{
						//System.out.println (Recs);
						SubjectRecs = ReadStudentSubject.readLine();
						String []StudentSubject;
						StudentSubject = SubjectRecs.split(",");
						
						System.out.println ("Prelim Grade: \t\t\t" + StudentSubject[0]);
						System.out.println ("Midterm Grade: \t\t\t" + StudentSubject[1]);
						System.out.println ("Prefinal Grade: \t\t" + StudentSubject[2]);
						System.out.println ("Final Grade: \t\t\t" + StudentSubject[3]);
						System.out.println ("Subject Grade: \t\t\t" + StudentSubject[4]);
						System.out.println ("Equivalent Grade: \t\t" + StudentSubject[5]);
						System.out.println ("Remarks: \t\t\t\t" + StudentSubject[6]);
																																										
						break;
					
				}
				catch(Exception ex)
				{
					//System.out.println ("Error!");
					return ;
				}		
		
		}
	}
}