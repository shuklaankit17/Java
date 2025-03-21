package sample;

class Animal{ // Parent
	
  class Dog extends Animal{
	void bark() {
		  
		  
	  }	
		
	}
}


public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
        System.out.println(a instanceof Animal);
        Dog d = new dog();
        System.out.println(d instanceof Dog)
        
	}
	

}
