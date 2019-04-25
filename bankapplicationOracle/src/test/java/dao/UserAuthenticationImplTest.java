package dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dto.CustomerDetails;
import junit.framework.Assert;

class UserAuthenticationImplTest {
	CustomerDetails obj=new CustomerDetails();
	UserAuthenticationImpl object=new UserAuthenticationImpl();

	
	 @Test
	 void testRegistration() { 
	 obj.setFirstName("ravi");
	 obj.setLastName("teja");
	 obj.setAadharNumber("099000000000");
	 obj.setAddress("hyd");
	 obj.setBalance(00); 
	 obj.setEmailId("kjsx");
	 obj.setPancardNo("555");
	 obj.setPassword("111");
	 obj.setMobileNumber("6655665566");
	 
	 Assert.assertEquals(101,object.registration(obj));
	 
	 }
	

	@Test
	void testLogin() {
		Assert.assertEquals(true,object.login(100,"11"));
	}

}
