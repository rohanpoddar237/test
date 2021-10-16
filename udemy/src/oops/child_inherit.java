package oops;

public class child_inherit extends parent_inherit
//ab child parent ko accses kar sakta hai -extend keyword hota hai
{
	//child class parent ki property ya method inherit karta hai- 
	public void tyre()
	{
	 System.out.println("4 tyre mrf company");	
	}
	
	public static void main(String[] args) {
		
		
		child_inherit c=new child_inherit();
		c.tyre();
				//baki parent ki method ko call karta hai obj bana kar
		c.colour();
		c.name();
		c.rank();
		
		
		parent_inherit p=new parent_inherit();//parent obj created
		
		//p.typre       parent child ki property access nhi kar sakta 
		p.colour();
		p.name();
		p.rank();
		
		
        parent_inherit d=new child_inherit();//parent obj created and child called
		
		//p.typre       parent child ki property access nhi kar sakta 
		p.colour();
		p.name();
		p.rank();
		
		

		

	}

}
