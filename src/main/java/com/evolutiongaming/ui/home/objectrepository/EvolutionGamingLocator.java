package com.evolutiongaming.ui.home.objectrepository;

import org.openqa.selenium.By;

public class EvolutionGamingLocator {

	/* Russian Language Locator */
	public static final By russianLanguage = By.xpath("//*[@class='menu_lang']/a");

	/* Electrical Engineering section locator */
	public static final By electricalEngg = By.xpath("//a[@class='a1'][contains(@href,'/ru/electronics/')]");

	/* Search button Locator */
	public static final By SearchBtn = By.xpath("//a[contains(@href,'/ru/electronics/search/')]");

	/* Search Input Locator */
	public static final By enterSearch = By.xpath("//input[@id='ptxt']");

	/* Select City From Drop Down Locator */
	public static final By selectCity = By.xpath("//*[@id='s_region_select']");

	/* Search By Period Locator */
	public static final By searchByPeriod = By
			.xpath("//*[@id='page_main']/tbody/tr/td/form/table/tbody/tr[7]/td[2]/select");

	/* Search Item Locator */
	public static final By searchiTemBtn = By.xpath(".//*[@id='sbtn']");

	/* No Add Found Message locator */
	public static final By noAddFound = By.xpath(".//*[@id='page_main']/tbody/tr/td/table[2]/tbody/tr/td");

	/* Price Sort Button Locator */
	public static final By priceSortBtn = By
			.xpath("//*[contains(@href,'/ru/electronics/search-result/fDgSeF4belM=.html')]");

	/* Transaction Type Drop Down Locator */
	public static final By transactionTypeBtn = By.xpath("//*[@id='page_main']/tbody/tr/td/div[2]/span[3]/select");

	/* Advance Search Button Locator */
	public static final By advanceSearch = By
			.xpath("//*[@id='page_main']//*[contains(@href,'/ru/electronics/search/')]");

	/* Enter minimum Amount input box Locator */
	public static final By enterMinAmount = By
			.xpath("//*[@id='page_main']/tbody/tr/td/form/table/tbody/tr[4]/td[2]/input[1]");

	/* Enter maximum Amount input box Locator */
	public static final By enterMaxAmount = By
			.xpath("//*[@id='page_main']/tbody/tr/td/form/table/tbody/tr[4]/td[2]/input[2]");

	/* Choose Adds Check Boxes locator */
	public static final By chooseAddscheckBox = By.xpath("//*[@name='mid[]']");
	
	public static final By checkBoxContent = By.xpath("//*[@class='msg2']/*[@class='d1']/a");
	
	public static final By price = By.xpath("//*[@class='msga2-o pp6']/a");
	
	public static final By chooseAddscheckBox1 = By.xpath("//*[starts-with(@id,'tr_')]");

	/* Check Box Count Locator */
	public static final By checkBoxCount = By.xpath("//*[@id='sel_cnt_obj']");

	/* Add To Mark Locator */
	public static final By addToBookMark = By.xpath("//*[@id='a_fav_sel']");

	/* Add to BookMark alert box Locator */
	public static final By alertBoxAddToBookmark = By.xpath(".//*[@id='alert_ok']");

	/* BookMark Notification Count Locator */
	public static final By bookmarkNotification = By.xpath(".//*[@id='mnu_fav_id']");

	/* BookMark link Locator */
	public static final By bookmarkLink = By.xpath("//*[contains(@href,'/ru/favorites/')]");
	
	/* Items In Book mark Locator */
	public static final By itemsInBookmark = By.xpath("//*[@class='d1']/a");
}
