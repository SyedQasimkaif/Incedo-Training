package day2Assignments;
import java.util.Scanner;
/*  Create a ReportCard class that abstracts the concept of school report. It must have
the following information:
• name, surname and class of the student;
• a table of votes that you associate for each subject, the vote and the judgment
• It must also declare a method that reads the report data legibly.
• Also create an class that prints one or more report cards.
*/

abstract class ReportCard {
	private String name;
	private String surname;
	private String Studentclass;
	private String [][] grades;
	private int GradeCount;
	public ReportCard (String name,String surname,String Studentclass,int maxSubjects) {
		this.name=name;
		this.surname=surname;
		this.Studentclass=Studentclass;
		this.grades=new String[maxSubjects][3];
		this.GradeCount=0;	
	}
	public void addGrades(String subject, int vote, String judgement) {
		if(GradeCount< grades.length) {
			grades[GradeCount][0]=subject;
			grades[GradeCount][1]=String.valueOf(vote);
			grades[GradeCount][2]=judgement;
			GradeCount++;
		}
		else {
			System.out.println("The maximum subject limit is reached");
		}
		
	}
	public String getName() {
		return name;
		
	}
	public String getSurname() {
		return surname;
	}
	public String getStudentclass(){
		return Studentclass;
		
	}
	public String[][] getGrades() {
		return grades;
	}
	public int getgradeCount() {
		return GradeCount;
	}
	public abstract void displayReport();
	
}
class PrintableReport extends ReportCard{
	public PrintableReport(String name,String surname, String Studentclass, int maxSubjects) {
		super(name,surname,Studentclass,maxSubjects);
	}
	public void displayReport() {
		System.out.println("student name" +getName() + " " + getSurname());
		System.out.println("student class" + getStudentclass());
		System.out.println("Grades: ");
		String [][] grades=getGrades();
		for(int i=0;i<getgradeCount();i++) {
			System.out.println("Subject :" +grades[i][0] + 
					", vote :" + grades[i][1] + 
					", judgement:" +grades[i][2]);
		}
		System.out.println();
	}
}
public class ReportDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student");
		String name=sc.nextLine();
		System.out.println("Enter the surname of the student");
		String surname=sc.nextLine();
		System.out.println("Enter the class");
		String studentclass=sc.nextLine();
		System.out.println("enter the number of subjects");
		int numsubjects=sc.nextInt();
		sc.nextLine();
		PrintableReport report =new PrintableReport(name,surname,studentclass,numsubjects);
		for(int i=0;i<numsubjects;i++) {
			System.out.println("enter the subject name");
			String subject=sc.nextLine();
			System.out.println("Enter the vote of the student:");
			int vote=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the judgement of the student:");
			String judgement=sc.nextLine();
			report.addGrades(subject, vote, judgement);	
			
		}
		report.displayReport();
		sc.close();
	}
}


