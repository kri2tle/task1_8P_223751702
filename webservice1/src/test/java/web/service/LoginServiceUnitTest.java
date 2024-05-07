package web.service;

import org.junit.Assert;
import org.junit.Test;

public class LoginServiceUnitTest {
	// Unit testing using decision table
	
	public String invalid_username = "invalid_username", invalid_password = "invalid_password", invalid_dob = "2002-02-02", valid_username = "krishna", valid_password = "krishna_pass", valid_dob = "2002-12-21";
	
	@Test
	public void testT1() {
		boolean result = LoginService.login("", "", "");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT2() {
		boolean result = LoginService.login("", "", invalid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT3() {
		boolean result = LoginService.login("", "", valid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT4() {
		boolean result = LoginService.login("", invalid_password, "");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT5() {
		boolean result = LoginService.login("", invalid_password, invalid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT6() {
		boolean result = LoginService.login("", invalid_password, valid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT7() {
		boolean result = LoginService.login("", valid_password, "");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT8() {
		boolean result = LoginService.login("", valid_password, invalid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT9() {
		boolean result = LoginService.login("", valid_password, valid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT10() {
		boolean result = LoginService.login(invalid_username, "", "");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT11() {
		boolean result = LoginService.login(invalid_username, "", invalid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT12() {
		boolean result = LoginService.login(invalid_username, "", valid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT13() {
		boolean result = LoginService.login(invalid_username, invalid_password, "");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT14() {
		boolean result = LoginService.login(invalid_username, invalid_password, invalid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT15() {
		boolean result = LoginService.login(invalid_username, invalid_password, valid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT16() {
		boolean result = LoginService.login(invalid_username, valid_password, "");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT17() {
		boolean result = LoginService.login(invalid_username, valid_password, invalid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT18() {
		boolean result = LoginService.login(invalid_username, valid_password, valid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT19() {
		boolean result = LoginService.login(valid_username, "", "");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT20() {
		boolean result = LoginService.login(valid_username, "", invalid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT21() {
		boolean result = LoginService.login(valid_username, "", valid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT22() {
		boolean result = LoginService.login(valid_username, invalid_password, "");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT23() {
		boolean result = LoginService.login(valid_username, invalid_password, invalid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT24() {
		boolean result = LoginService.login(valid_username, invalid_password, valid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT25() {
		boolean result = LoginService.login(valid_username, valid_password, "");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT26() {
		boolean result = LoginService.login(valid_username, valid_password, invalid_dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testT27() {
		LoginService l1 = new LoginService();
		boolean result = l1.login(valid_username, valid_password, valid_dob);
		Assert.assertTrue(result);
	}
}
