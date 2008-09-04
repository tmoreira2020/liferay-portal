package com.liferay.portalweb.portal.theme;

import com.liferay.portalweb.portal.BaseTestCase;


/**
  * @author Prajna
 */


public class VerifyDropDownItemsTest extends BaseTestCase {
	public void sleep(int millis){
		try{
			Thread.sleep(millis);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
	public void testVerifyDropDownItems(){
		
		assertTrue(selenium.isElementPresent("//a[. = 'Home']"));
        assertTrue(selenium.isElementPresent("//a[. = 'My Account']"));
        assertTrue(selenium.isElementPresent("//a[. = 'Sign Out']"));
        assertTrue(selenium.isElementPresent("//a[. = 'Add Application']"));
        assertTrue(selenium.isElementPresent("//a[. = 'Layout Template']"));
        assertTrue(selenium.isElementPresent("//a[. = 'Manage Pages']"));
        assertTrue(selenium.isElementPresent("//a[. = 'Toggle Edit Controls']"));
        assertTrue(selenium.isElementPresent("//a[. = 'My Places']"));
    }
}