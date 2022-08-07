//Class implements an interfaces and interface extends another interface

package interfaces;

interface Colleges 
 	{
		public void colleges();
 	}
interface Faculty extends Colleges 
	{
		public void faculty();
	}

public class University implements Faculty 
	{
		public void colleges()
			{
				System.out.println("College admissions are open ");
			}
		public void faculty()
			{
				System.out.println("College pays salaries to faculty");
			}
		public static void main(String[] args) 
			{
				University u = new University();
				u.colleges();
				u.faculty();				
			}
	}
