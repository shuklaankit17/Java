package oop;

		// Parent class (Superclass)
		class Animal {
		    String name;

		    void eat() {
		        System.out.println(name + " is eating.");
		    }

		    void sleep() {
		        System.out.println(name + " is sleeping.");
		    }
		}

		// Child class (Subclass) inheriting from Animal
		class Dog extends Animal {
		    void bark() {
		        System.out.println(name + " is barking.");
		    }
		}

		public class Inheritance {
		    public static void main(String[] args) {
		        Dog myDog = new Dog();  // Creating object of subclass
		        myDog.name = "Buddy";   // Accessing inherited property
		        myDog.eat();            // Calling inherited method
		        myDog.sleep();          // Calling inherited method
		        myDog.bark();           // Calling subclass method
		    }
		}

	


