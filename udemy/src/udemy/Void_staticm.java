package udemy;

public class Void_staticm {

	//non-static    method declare kiya non-static
	void login()
	{
	System.out.println("login succefull");
	}
	
	//static method me o
	static void button()
	{
		System.out.println("button clicked");    //sirf ek bar execute hoga
	}
	
	
	public static void main(String[] args) {
		//non static ko main me call karna padta hai obj ke sath
		//obj create kiya 
		Void_staticm ref=new Void_staticm();
		ref.login();     //jitni bar obj create karenge utni bar execute hoga
		ref.login();
		ref.login();
		
		
		
		//obj call nhi karte bas method call karte hai
		button();

	}

}
