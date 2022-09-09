package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void checkFirstNameTest() {
        Assert.assertTrue(userRegistration.checkFirstName("Nayana"));
        Assert.assertFalse(userRegistration.checkFirstName("nAYana"));
    }
	
	@Test
    public void checkLastNameTest() {
        Assert.assertTrue(userRegistration.checkLastName("Suresh"));
        Assert.assertFalse(userRegistration.checkLastName("suREsh"));
    }

    @Test
    public void checkEmailTest() {
        Assert.assertTrue(userRegistration.checkEmail("abc111@abc.com"));
        Assert.assertFalse(userRegistration.checkEmail(".abc@abc.com"));
    }

    @Test
    public void checkPhoneNoTest() {
        Assert.assertTrue(userRegistration.checkPhoneNo("91 9588201873"));
        Assert.assertFalse(userRegistration.checkPhoneNo("213 456734248"));
    }

    @Test
    public void checkPasswordTest() {
        Assert.assertTrue(userRegistration.checkPassword("Abc89@123"));
        Assert.assertFalse(userRegistration.checkPassword("Abc"));
    }


}
