package sample;
import java .util.Scanner;

abstract class Apps{ // Abstract parent class
	
String user_name;
String pass;

 void user_input() {
	
	Scanner s =new Scanner(System.in);
	System.out.println("Enter user name");
	user_name = s.nextLine();
	System.out.println("Enter user pass");
	pass = s.nextLine();
	
}
	
 void user_login() {
	 System.out.println("Welcome to Instagram");
	 System.out.println("----------------------");
	 System.out.println("Please Login Here...!");
	 
 }
 
 
	abstract void open(); // Abstract method
	
}

class  Instagram extends Apps { // child class
	void app_open() { // normal method
		
		while(true) {
		
		if(user_name.equals("Shivangi") && pass.equals("912@")){
			
			System.out.println(" Successfully Login , App is open...!");
			break;
			
		} else {
			
		System.out.println("Invalid username&pass :Please Try again");
		user_input();
		}
		
		}
		
	}

	@Override
	void open() {
		// TODO Auto-generated method stub
		
	}

}

public class ImplementationofAbstraction {

	public static void main(String[] args) {
		
		Instagram i = new Instagram();
		i.user_login();
		i.user_input();
		i.app_open();
		

	}

}
