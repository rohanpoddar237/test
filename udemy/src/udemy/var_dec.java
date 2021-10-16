package udemy;

public class var_dec {

	static int d=323;
	//local variable for ko bas issi method me access kar sakte hai
	static void method1()
	{
		int c=10;
		System.out.println(c);
		
	}
	
	
	
	public static void main(String[] args) {
	
		//global variable
		int b=20;
		System.out.println(b);

		System.out.println(d);
	}

}
