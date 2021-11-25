package com.bridgelabz.userregistrationjunittest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class UserRegistrationTest {
	 UserRegistration userRegistration;
	    @Before
	    public void before() {
	        userRegistration = new UserRegistration();
	    }

	    @Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.firstName("Sachin");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
	        boolean result = userRegistration.firstName("Sachin");
	        Assert.assertEquals(false, result);
	    }

}