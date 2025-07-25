package Contact;

import org.testng.annotations.Test;

@Test
public class ContactTest {
	public void contactwithPhoneTest() {
		System.out.println("Contact with phone number");
	String user=	System.getProperty("username");
	String pass=	System.getProperty("password");
	System.out.println(user);
	System.out.println(pass);
	
	}
	public void deletecontact() {
		System.out.println("delete Contact with phone number");
	
	
	}
	public void contactwithaddress() {
		System.out.println("contactwithaddress  with phone number");
	

	}
	public void contactwithaddress1() {
		System.out.println("contactwithaddress1  with phone number");
	

	}
}
