//Multiple inheritance 
//One class implements two interfaces

package interfaces;

interface Students
	{
		public void students();
	}

interface Exams
	{
		public void exams();
	}

public class College implements Students, Exams
	{
		public void students() 	
			{
				System.out.println("Students learning courses");
			}
    
		public void exams() 
			{
				System.out.println("Students writes exams");
			}
		public static void main(String[] args) 
			{
				College c = new College();
				c.students();
				c.exams();
			}
	}
