package oops;

public class method_overriding {

	class Animal {

	    public void printSound() {
	        System.out.println("Sound method of parent class");
	    }
	}

	class Dog extends Animal {

	    public void printSound() {
	        System.out.println("Dogs bark");
	    }
	}

	class Test {

	    public void main(String[] args) {
	        Dog d = new Dog();
	        d.printSound();
	    }
	}
	
}