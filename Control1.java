package semproject;

import java.util.Scanner;

public class Control1 {
	

	public static void main(String[] args) {
		System.out.println("*****    Welcome To Quiz Contest Simulator   *****\n \n ");
		Scanner scan=new Scanner(System.in);
		System.out.println("Press 1 For Registration\nPress 2 To Login\nPress 3 to Exit");
		int i;
		i=scan.nextInt();
		switch(i) {
		case 1:System.out.println("Registration Process");
		
		Control2.main(null);
		break;
		case 2: System.out.println("User Login ");
		
		Control2.login();
		break;
		default:System.out.println("Exiting...................");
		System.exit(0);
		
		}
		
		scan.close();
		

	}

}
