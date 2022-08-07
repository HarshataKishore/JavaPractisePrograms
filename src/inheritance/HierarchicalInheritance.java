package inheritance;

class Stud{
	public void learning()
	{
		System.out.println("Student learning new courses");
	}
}

class College extends Stud{
	public void college()
	{
		System.out.println("Institution allocates seats");
	}
}

class Exam extends Stud{
	public void exam()
	{
		System.out.println("Students writes exams");

	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
	Exam e = new Exam();
		e.learning();
		e.exam(); 
		
		College c = new College();
		c.learning();
		c.college(); 
		
		

	}

}
