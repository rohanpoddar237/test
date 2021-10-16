package oops;

public class method_overloading {

	static void add(int a,int b)//add name ki method li hai same
	{
		int c=a+b;
		System.out.println(c);
		
	}
	
	static void add(int a,int b,int d)//same name but diffrent parameter
	{
		int c=a+b+d;
		System.out.println(c);
		
	}
	static void add(int a,float b)
	{
		float c=a+b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {

     add(2,4);      //parameter ki value declare ki hai
     add(3,4,5);
    add(5,4.5f);

	}

}
