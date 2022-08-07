//One class implements One interface

package interfaces;

interface Exam
	{
		public void exams();
	}

public class Student implements Exam
	{
		public void exams() 	
			{
				System.out.println("Student writes exams");
			}

		public static void main(String[] args) 
			{
				Student s = new Student();
				s.exams();
			}
}
