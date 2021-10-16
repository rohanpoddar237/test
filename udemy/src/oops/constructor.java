package oops;

public class constructor extends parent_constructor
{
	constructor()
	{
       super(14);
       System.out.println("child cons");

	}
	
	constructor(int a)
	{
       this();
       System.out.println("child cons 1 parameter");

	}
	{
		System.out.println("child non static block");  //non static block constructor ke pehle execute hota hai
	}
	
	static
	{
		System.out.println("child static block");   //sabse pehle static block execute hota hai
	}
	
	public static void main(String[] args) {
	
          new constructor(14);
	}

}
