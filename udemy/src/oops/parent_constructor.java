package oops;

public class parent_constructor {
	
	parent_constructor(int a) {
		System.out.println("parent constructor");
	}
	
	
     {
  System.out.println("parent non static block");
	}
     static
     {
    	  System.out.println("parent static constructor");  //sabse pehle static block execute hota hai
    		}
}
