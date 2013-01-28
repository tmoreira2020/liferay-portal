/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portlet.wiki.wikipage.deletewikipagechildpage;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class DeleteWikiPageChildPageTest extends BaseTestCase {
	public void testDeleteWikiPageChildPage() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.clickAt("link=Wiki Test Page",
			RuntimeVariables.replace("Wiki Test Page"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=All Pages", RuntimeVariables.replace("All Pages"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Wiki Page Title"),
			selenium.getText("//tr[5]/td[contains(.,'Wiki Page Title')]/a"));
		selenium.clickAt("//tr[5]/td[contains(.,'Wiki Page Title')]/a",
			RuntimeVariables.replace("Wiki Page Title"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("//div[@class='child-pages']/ul/li/a",
			RuntimeVariables.replace("Wiki Page ChildPage Title"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Details"),
			selenium.getText("//div[3]/span[contains(.,'Details')]/a/span"));
		selenium.clickAt("//div[3]/span[contains(.,'Details')]/a/span",
			RuntimeVariables.replace("Details"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Delete"),
			selenium.getText("//td/ul/li[contains(.,'Delete')]/a/span"));
		selenium.click(RuntimeVariables.replace(
				"//td/ul/li[contains(.,'Delete')]/a/span"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace(
				"Your request completed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
		assertFalse(selenium.isTextPresent("Wiki Page Child Page Title"));
		assertTrue(selenium.getConfirmation()
						   .matches("^Are you sure you want to delete this[\\s\\S] It will be deleted immediately.$"));
		selenium.clickAt("//ul[@class='top-links-navigation']/li[3]/span/a/span",
			RuntimeVariables.replace("All Pages"));
		selenium.waitForPageToLoad("30000");
		assertFalse(selenium.isTextPresent("Wiki Page Child Page Title"));
	}
}