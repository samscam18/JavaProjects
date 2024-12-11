package emailapp;
import java.util.Scanner;



public class Email {
		
		private String firstName;
		private String lastName;
		private String password;
		private int  defaultPasswordLength =10;
		private String department;
		private int mailBoxCapacity = 500;
		private String email;
		private String alternateEmail;
		private String companySuffix = "samscam18company.com";
		
		public Email(String firstName , String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
			System.out.println("EMAIL CREATED:" + this.firstName + " " + this.lastName);
			
			this.department = setDepartment();
			
			
			this.password = randomPassword(defaultPasswordLength);
			System.out.println("Your password is:" + this.password);
			
			email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "."+ companySuffix;
			
		}
		
		private String setDepartment() {
			System.out.print("New worker: " + firstName + "DEPARTMENT CODES\n1 for Sales\n2 for Developent\n3 for Accuting\n0 for none\nEnter department code: ");
			Scanner sc = new Scanner(System.in);
			int depChoice = sc.nextInt();
			if(depChoice == 1) { return "sales"; }
			else if(depChoice == 2) {return "dev";}
			else if(depChoice ==3) {return "acct";}
			else { return ""; }
	
		}	
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
			char[] password = new char[length];
			for( int i =0; i<length; i++) {
				int rand = (int)(Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
			return new String(password);
		}
		public void setMailBoxCapacity(int capacity) {
			this.mailBoxCapacity = capacity;
		}
		
		public void setAlternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
		public void changePassword(String password) {
			this.password = password;	
		}
		public int getMailBoxCapacity() {return mailBoxCapacity;}
		public String getAlternateEmail() { return alternateEmail;}
		public String getPassword() { return password; }
		
		public String showInfo() {
			return "DISPLAY NAME: " + firstName + " " + lastName + "\n COMPANY EMAIL:" +  email + "\n MAILBOX CAPACITY:" + mailBoxCapacity + "mb";
			
		}
}


