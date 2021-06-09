package semproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.Date;

public class Control2 {
	public static void login() {
		System.out.println("*** Enter Details for Login:   ***\n \n ");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter User name");
		String uname,pwrd;
		uname=scan.next();
		System.out.println("Enter Password:");
		pwrd=scan.next();
		String line="";
		int login=0;
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\patan\\Documents\\Semester\\Semester 5\\oop Java\\semproject\\UserInfo.txt");
			Scanner s= new Scanner(fin);
			while(s.hasNextLine()) {
				line=s.nextLine();
				//System.out.println(line);
				if(line.startsWith(uname) &&(line.endsWith(pwrd))) {
					Date date=new Date();
					System.out.println("Login was Success");
					FileOutputStream fout=new FileOutputStream("C:\\Users\\patan\\Documents\\Semester\\Semester 5\\oop Java\\semproject\\LoginInfo.txt",true);
					String f="\n"+uname+"\t"+date;
					login=1;
					byte[] b=f.getBytes();
					fout.write(b);
					fout.close();
					System.out.println("To goto Quiz......Press 1");
					int press;
					press=scan.nextInt();
					if(press==1) {
						System.out.println("\n\n Quiz Loading..............\n\n");
						Control3 g = new Control3();
						  g.start(uname);
						
					}
					
					
				}
				
				
				
			}
			s.close();
		}
		catch(Exception ioe) {
			ioe.printStackTrace();
		}
		if(login==0) {
			System.out.println("Login was Unsuccessful\n For registration Press 1  else press any key");
			int ch;
			ch=scan.nextInt();
			if(ch==1) {
				Control2.main(null);
			}
		}
		scan.close();
		
		
	}
	
      
    public static void main(String args[]) 
    { 
    	Scanner scan=new Scanner(System.in);
    	System.out.println("*** Enter Details For Registration ***\n");
    	String username,pwrd,mailid;
    	int phno;
    	System.out.println("Enter User name");
    	username=scan.next();
    	System.out.println("Enter Password");
    	pwrd=scan.next();
    	System.out.println("Enter User Mail Id:");
    	mailid=scan.next();
    	System.out.println("Enter User Phone No:");
    	phno=scan.nextInt();
    	String f="\n"+username+"\t"+mailid+"\t"+phno+"\t"+pwrd;
    	byte[] b=f.getBytes();
    	try {
    		FileOutputStream fout=new FileOutputStream("C:\\Users\\patan\\Documents\\Semester\\Semester 5\\oop Java\\semproject\\UserInfo.txt",true);
    		fout.write(b);
    		System.out.println(username+" Registered successfully");
    		fout.close();
    	}
    	catch(Exception ex) {
    		ex.printStackTrace();
    	}
    	System.out.println("To login Press 1 else Press any Key");
    	int ch;
    	ch=scan.nextInt();
    	if(ch==1) {
    		Control2.login();
    	}
    	else {
    		System.exit(0);
    	}
    	
    	scan.close();
    	
    } 

}
