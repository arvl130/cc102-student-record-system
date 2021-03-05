import java.io.*;
import java.util.*;

public class CaseStudyIndividualGradesentry
{
	public static void IndividualGradeEntry() throws IOException
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
		
		
		//Scanner SC = new Scanner(System.in);
		
		System.out.print ("\nPlease Enter a Subject: ");
		String SBJ= SC.nextLine();
		
		PrintStream OutputValue = new PrintStream(new FileOutputStream(STUID + "-" + SBJ + ".txt"));
		//PrintStream OutputValue2 = new PrintStream(new FileOutputStream(StudentID + "-Grade.txt", true));
		
		System.out.print ("Prelim Grade: ");
		String PG = SC.nextLine();		
		
		System.out.print ("Midterm Grade: ");
		String MG = SC.nextLine();			

		System.out.print ("Pre-Final Grade: ");
		String PFG = SC.nextLine();				

		System.out.print ("Final Grade: ");
		String FG = SC.nextLine();				
		
		double Prelim = Float.parseFloat(PG);
		double Midterm =Float.parseFloat(MG);
		double Prefinal = Float.parseFloat(PFG);
		double Final = Float.parseFloat(FG);
		
		double SubjectGrade = (int)Math.round((Prelim * 0.20) + (Midterm * 0.20) + (Prefinal * 0.20) + (Final * 0.40)); 
		String Equivalent = "0.00";
		String Remarks="";
		
		if(SubjectGrade <= 74)
		{
			Equivalent = "5.00";
		}
		else if (SubjectGrade >= 75 && SubjectGrade <= 76)
		{
			Equivalent = "3.00";
		}
		else if (SubjectGrade >= 77 && SubjectGrade <= 79)
		{
			Equivalent = "2.75";
		}			
		else if (SubjectGrade >= 80 && SubjectGrade <= 82)
		{
			Equivalent = "2.50";
		}
		else if (SubjectGrade >= 83 && SubjectGrade <= 85)
		{
			Equivalent = "2.25";
		}		
		else if (SubjectGrade >= 86 && SubjectGrade <= 88)
		{
			Equivalent = "2.00";
		}
		else if (SubjectGrade >= 89 && SubjectGrade <= 91)
		{
			Equivalent = "1.75";
		}
		else if (SubjectGrade >= 92 && SubjectGrade <= 94)
		{
			Equivalent = "1.50";
		}
		else if (SubjectGrade >= 95 && SubjectGrade <= 97)
		{
			Equivalent = "1.25";
		}
		else if (SubjectGrade >= 98 && SubjectGrade <= 99)
		{
			Equivalent = "1.00";
		}	
		else
		{
			Equivalent = "0";	
		}	

		if (SubjectGrade <= 74)
		{
			Remarks = "FAILED";
		}
		else
		{
			Remarks = "PASSED";
		}
		
		File FLE = new File(STUID + "-" + SBJ + ".txt");
		
		if(FLE.exists()==true)
		{
			
			if(FLE.length() == 0)
			{
				OutputValue.print(PG + "," + MG + "," + PFG + "," + FG + "," + SubjectGrade + "," + Equivalent + "," + Remarks);
			}
			else
			{
				OutputValue.print("\n" + PG + "," + MG + "," + PFG + "," + FG + "," + SubjectGrade + "," + Equivalent + "," + Remarks);	
			}
				
		}
		else
		{
			
		}
		
		//OutputValue2.println("SubjectName," + PG + "," + MG + "," + PFG + "," + FG + "," + SubjectGrade + "," + Equivalent + "," + Remarks);
					
	}
	
	public static void main (String[] args) throws IOException
	{

		
	}
}