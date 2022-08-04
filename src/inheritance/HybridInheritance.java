package inheritance;
		class Studnt{
			public void learning()
				{
					System.out.println("Student learning new courses");
				}
		}

		   class Clg extends Studnt{
				public void clg()
				{
					System.out.println("University allocates seats");
				}
		}
		   class Exams extends Studnt{
				public void exam()
				{
					System.out.println("Students writes exams");

				}
		}
		  class Facult extends Clg{
				public void faculty()
				{
					System.out.println("Faculty clarifie doubts");

				}  
	    }

		  public class HybridInheritance {

				public static void main(String[] args) {
					
					Clg c = new Clg();
				    c.learning();  
				     
				    Facult f = new Facult();
				     f.clg();
				     f.faculty();
				     
				    Exams e = new Exams();
				     e.exam();
				}
}
