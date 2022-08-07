package inheritance;

class Students{
	public void learning()
	{
		System.out.println("Student learning new courses");
	}
}

class Institutions extends Student{
	public void institution()
	{
		System.out.println("Institution allocates seats");
	}
}

class Faculty extends Institutions{
	public void faculty()
	{
		System.out.println("Faculty clarifies doubts");

	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Faculty f = new Faculty();
		f.learning();
		f.institution();
		f.faculty();
		}

}
