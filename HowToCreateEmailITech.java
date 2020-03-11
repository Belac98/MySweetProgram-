import java.util.Scanner;

public class emailapp {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordlength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	//Constructor to recieve the first name and last name
	public emailapp(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//call a method asking for the department = return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordlength);
		System.out.println("Your password is: " + this.password);
	
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." +  companySuffix;
		//System.out.println("Your email is: " + email);
	}
	// ask for the department
	private String setDepartment() {
		System.out.print("New worker: " + firstName + ". Department Codes: \n1 for Sales\n2 for Developement\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales"; }
		else if (depChoice == 2) { return "dev" ; }
		else if (depChoice == 3) { return "acct"; }
		else { return ""; }
			
	}
	
	//generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char [] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
		}
		return new String(password);
	}
	//set the mailbox capacity
	public void setmailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		
	}
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	
	}
	// change the password
	public void changePassword(String password) { 
		this.password = password;
	}
	public int getmailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword( ) { return password; }
	
	public String showInfo() {
		return " DISPLAY NAME: " + firstName + " " + lastName +
				" \nCOMPANY EMAIL: " + email +
				" \nMAILBOX CAPACITY: " + mailboxCapacity + "ab";
		
	}
}
