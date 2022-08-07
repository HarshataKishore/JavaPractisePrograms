//2 classes implements 1 interfaces
package interfaces;

interface Canteen
	{
		public void canteen();
	}

class Studnts implements Canteen	
	{
	public void canteen() 	
		{
			System.out.println("Students goes to canteen");
		}
	}
class Staff implements Canteen
	{
	public void canteen()
		{
			System.out.println("Staff gets free meals in canteen");
		}
	}
class Universities
	{
    	public void canteen() 
    		{
    		System.out.println("Staff gets free meals in canteen");
    		}

	    public static void main(String[] args) 
	    	{
	    		Studnts c1 = new Studnts();
	    		c1.canteen();
		
	    		Universities c2 = new Universities();
	    		c2.canteen();	
		    }
	}
