package inheritance;
	class Student{
	public void learning()
		{
			System.out.println("Student learning new courses");
		}
}

   class Institution extends Student{
		public void institution()
		{
			System.out.println("Institution allocates seats");
		}
	}
	class SingleInheritance {
		
		public static void main(String[] args) {
			Institution i = new Institution();
			i.learning();
			i.institution();
			
		}

}
