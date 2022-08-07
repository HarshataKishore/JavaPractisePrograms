//
package interfaces;

interface Studnt
	{
	public void name();
	public void section();
	public void rollno();
	}

public class StudentInfo implements Studnt
{
	public void name() {
		System.out.println("Name is Harshata");
	}
	public void section() {
		System.out.println("CSE-B Section");
	}
	public void rollno() {
		System.out.println("Roll no is 15ME1A0591");
	}

	public static void main(String[] args) 
	{
		StudentInfo si = new StudentInfo();
		si.name();
		si.section();
		si.rollno();
	}

}
