package com.evolutiongaming.ui.home.page;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.evolutiongaming.common.pages.BasePage;
import com.evolutiongaming.ui.home.bean.EvolutionGamingBean;
import com.evolutiongaming.ui.home.objectrepository.EvolutionGamingLocator;

public class EvolutionGamingPage extends BasePage {

	public EvolutionGamingPage(WebDriver driver) {
		super(driver);
	}

	static WebDriverWait wait;
	Logger logger = LoggerFactory.getLogger(EvolutionGamingPage.class);

	// Method created to switch to Russian language
	public boolean switchToRussian() {
		try {
			if (findElement(EvolutionGamingLocator.russianLanguage, 5).getText().equalsIgnoreCase("RU")) {
				findElement(EvolutionGamingLocator.russianLanguage, 5).click();
			}
			return true;
		} catch (Exception e) {
			logger.error("Error in switching language :" + e);
			return false;
		}
	}

	// Method created to select electrical engg
	public boolean selectEngg() {
		try {
			if (isElementPresent(EvolutionGamingLocator.electricalEngg, 5)) {
				findElement(EvolutionGamingLocator.electricalEngg, 5).click();
			}
			return true;
		} catch (Exception e) {
			logger.error("Error in selecting electrical engg :" + e);
			return false;
		}
	}

	// Method created to search item
	public boolean searchItem(String item) {
		try {
			findElement(EvolutionGamingLocator.SearchBtn, 5).click();
			Thread.sleep(500);
			if (isElementPresent(EvolutionGamingLocator.enterSearch, 5)) {
				findElement(EvolutionGamingLocator.enterSearch, 5).sendKeys(item);
				Thread.sleep(500);
				findElement(EvolutionGamingLocator.searchiTemBtn, 5).click();
			}
			return true;
		} catch (Exception e) {
			logger.error("Error in searching item :" + e);
			return false;
		}
	}

	// Method created to sort price
	public boolean sortAndSelect(String option) {
		try {
			findElement(EvolutionGamingLocator.priceSortBtn, 5).click();
			if (isElementPresent(EvolutionGamingLocator.transactionTypeBtn, 5)) {
				Select qty = new Select(findElement(EvolutionGamingLocator.transactionTypeBtn, 5));
				qty.selectByVisibleText(option);
			}

		} catch (Exception e) {
			logger.error("Error in sorting item :" + e);
			return false;
		}
		return true;
	}

	// Method created for advance search
	public boolean advanceSearch(String min, String max) {
		try {
			findElement(EvolutionGamingLocator.advanceSearch, 5).click();
			if (isElementPresent(EvolutionGamingLocator.enterMinAmount, 5)) {
				findElement(EvolutionGamingLocator.enterMinAmount, 5).sendKeys(min);
				findElement(EvolutionGamingLocator.enterMaxAmount, 5).sendKeys(max);

				findElement(EvolutionGamingLocator.searchiTemBtn, 5).click();
			}

		} catch (Exception e) {
			logger.error("Error in advance search :" + e);
			return false;
		}
		return true;
	}
	
	// Method created for selecting check box and storing data in bean
	public boolean selectCheckbox(int add) {
		try {
			List<WebElement> checkBox = driver.findElements(EvolutionGamingLocator.chooseAddscheckBox);
			int checkSize = checkBox.size();
			List<WebElement> checkBoxContent = driver.findElements(EvolutionGamingLocator.checkBoxContent);
			List<String> checkBoxData = new ArrayList<String>();
	
			List<Integer> randomNumbers = randomNumber(1, checkSize-1, add);
			for (int val : randomNumbers) {
				Thread.sleep(500);
				checkBox.get(val).click();
				checkBoxData.add(checkBoxContent.get(val).getText());
			}
			EvolutionGamingBean.setcheckBoxData(checkBoxData);
			return true;
		} catch (Exception e) {
			logger.error("Error in selecting check box item :" + e);
			return false;
		}
	}
	
	// Method created for adding data to book mark
	public boolean addToBookmark() {
		try {
			if (isElementPresent(EvolutionGamingLocator.addToBookMark, 5)) {
				findElement(EvolutionGamingLocator.addToBookMark, 5).click();
				findElement(EvolutionGamingLocator.alertBoxAddToBookmark, 5).click();
			}
		} catch (Exception e) {
			logger.error("Error in adding item in memo :" + e);
			return false;
		}
		return true;
	}
	
	// Method created for verifying bookmark
	public boolean varifyBookmark() {
		try {
			if (isElementPresent(EvolutionGamingLocator.bookmarkLink, 5)) {
				findElement(EvolutionGamingLocator.bookmarkLink, 5).click();
				
			}
			List<WebElement> checkBoxContent = driver.findElements(EvolutionGamingLocator.checkBoxContent);
			List<String> webUIData = new ArrayList<String>();
			List<String> previousUIData = EvolutionGamingBean.getcheckBoxData();
			
			for(WebElement e: checkBoxContent)
				webUIData.add(e.getText());
			System.out.println("WebUI data:"+webUIData);
			System.out.println("previousUIData:"+previousUIData);
			int count = 0;
			if(webUIData.size() == previousUIData.size()){
					for(String prev: previousUIData)
						for(String webData : webUIData)
					if(prev.contains(webData)){
						count++;
					break;
					}
					if(count == webUIData.size())
					return true;	
			}else 
				return false;
			
		} catch (Exception e) {
			logger.error("Items did not metch with bookmark :" + e);
			return false;
		}
		return true;
	}
	
	// Method created for creating random numbers
	public static List<Integer> randomNumber(int lowerbound, int upperbound, int numcount) {
		List<Integer> random = new ArrayList<Integer>();
		final int[] ints = new Random().ints(lowerbound, upperbound + 1).distinct().limit(numcount).toArray();
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
			random.add(ints[i]);
		}
		System.out.println(random);
		return random;
	}
	
	// Method created for converting integer to string
	public static List<String> convertIntegerListToString(List<Integer> list) {
		List<String> temp = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 10) {
				temp.add("0" + list.get(i));
			} else {
				temp.add(String.valueOf(list.get(i)));
			}

		}
		return temp;

	}
}
