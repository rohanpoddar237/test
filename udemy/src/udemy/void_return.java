package udemy;

public class void_return {

	//for non static return type
	int add()
	{
		int a=2313;
		return a;

	}
	
	//static return type
	static String b()
	{
		String name="Rohan";
		return name;
		
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		void_return ref=new void_return();
		ref.add();
		System.out.println("non static return type is > "+ref.add());
		
		//for printing
		System.out.println("static return  > "+b());
		
		
	}

}
