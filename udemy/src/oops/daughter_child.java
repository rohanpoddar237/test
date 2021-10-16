package oops;

public class daughter_child extends child_inherit
// child ko einherit kiya
{

	public void seat()
	{
	 System.out.println("6 seat");	
	}
	
	public static void main(String[] args) {
		
		daughter_child f=new daughter_child();
		
		//child or parent ki value ko call liya
		         f.tyre();     
				f.colour();
				f.name();
				f.rank();
				f.seat();

	}

}
