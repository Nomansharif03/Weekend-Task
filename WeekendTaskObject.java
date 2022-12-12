package WeekendTaskObject;

import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WeekendTaskObject {
	//All Locators
	   @FindBy(xpath="//input[@id='username']")
    	WebElement WriteYourEmail;
	
		@FindBy(xpath="//*[text()='Continue']")
		WebElement ClickContinoueButton;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement WriteYourPassword;
		
		@FindBy(xpath="//span[text()='Log in']")
		WebElement ClickSignUpButton;
		
		@FindBy(xpath="(//span[@style='--icon-primary-color:currentColor; --icon-secondary-color: inherit;'])[1]")
    	WebElement ClickCreateButton;
		
		@FindBy(xpath="//span[text()='Create board']")
    	WebElement ClickCreate;
		
		@FindBy(xpath="//input[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']")
    	WebElement WriteTheTitleBoard;
		
		@FindBy(xpath="//button[@class='G2lWjDVJsvar3H Ts+YceGnvTbKoG HPCwi137Em5EYI JIXQq8gDYY04N6']")
    	WebElement ClickCreateButton1;
		
		@FindBy(xpath="//input[@class='list-name-input']")
    	WebElement WriteFirstList;
		
		@FindBy(xpath="//input[@class='list-name-input']")
    	WebElement WriteSeconedList;
		
		
		@FindBy(xpath="(//span[@class='js-add-a-card'])[2]")
		WebElement AddCardToList;
		
		@FindBy(xpath="//textarea[@class='list-card-composer-textarea js-card-title']")
		WebElement AddCardTitleList;
		
		@FindBy(xpath="//div[@class='list-card-details js-card-details']")
		WebElement ClickCardTitleList;
		
		@FindBy(xpath="//a[@class='button-link js-move-card']")
		WebElement ClickMoveButton;
		
		@FindBy(xpath="//select[@class='js-select-list']")
		WebElement ClickTheButton;
		
		@FindBy(xpath="//textarea[@class='list-card-edit-title js-edit-card-title']")
		WebElement ClickTheCardTitleButton;
		
		@FindBy(xpath="//a[@class='button-link js-archive-card']")
		WebElement ClickArchieveButton;
		
		@FindBy(xpath="//a[@class='button-link js-delete-card negate']")
		WebElement ClickDeleteButton;
		
		@FindBy(xpath="//a[@class='icon-lg icon-close dark-hover js-cancel']")
		WebElement ClickCloseButton;
		
		@FindBy(xpath="//span[@class='icon-sm icon-edit list-card-operation dark-hover js-open-quick-card-editor js-card-menu']")
		WebElement ClickThePencilButton;
		
		
		@FindBy(xpath="//input[@class='nch-button nch-button--primary wide js-save-edits']")
		WebElement ClickToSave;
		
		@FindBy(xpath="//a[@class='quick-card-editor-buttons-item']")
		WebElement ClickToOpen;
		
		@FindBy(xpath="//input[@class='js-confirm full nch-button nch-button--danger']")
		WebElement ClickDelete;
		
			@FindBy(xpath="//span[@class='list-card-title js-card-name']")
		WebElement ClickCard;	
			
		//ALL Methods
		WebDriver driver;
		Random random;
		Logger logger = Logger.getLogger("WeekendTaskObject");

		
		public WeekendTaskObject(WebDriver driver1){
			driver=driver1;
			PageFactory.initElements(driver1,this);}
		
        public void Login() throws Exception {
        	WriteYourEmail.sendKeys("");
        	logger.info("Email is Typed");
        	Thread.sleep(2000);
        	ClickContinoueButton.click();
        	logger.info("Continue Button is Clicked");
        	Thread.sleep(2000);
        	WriteYourPassword.sendKeys("Pakistan@031");
        	logger.info("Password Button is Clicked");
        	Thread.sleep(2000);
        	ClickSignUpButton.click();
        	logger.info("Sign Up Button is Clicked");
        	Thread.sleep(2000);
        }
        public void CreateBoard() throws Exception {
        	Thread.sleep(3000);
        	ClickCreateButton.click();
        	logger.info("Create Button Button is Clicked");
        	Thread.sleep(3000);
        	ClickCreate.click();
        	logger.info("Create Button is Clicked");
        	Thread.sleep(2000);
        	random = new Random();
        	String string = RandomStringUtils.randomAlphabetic(8); 
        	WriteTheTitleBoard.sendKeys(string);
        	//Assert.assertEquals(WriteTheTitleBoard.getAttribute("value"),string);
        	logger.info("Title Board Button is Clicked");
        	Thread.sleep(2000);
        	ClickCreateButton1.click();
        	logger.info("Email is Typed");
        	Thread.sleep(3000);
        }
        	public void AddTwoLists() throws Exception {
        	Thread.sleep(3000);
        	String string1 = RandomStringUtils.randomAlphabetic(6);
        	WriteFirstList.sendKeys(string1 + Keys.ENTER);
        	logger.info("First List Button is Typed");
        	//Assert.assertEquals(WriteFirstList.getAttribute("value"),string1);
        	Thread.sleep(3000);
        	String string2 = RandomStringUtils.randomAlphabetic(6);
        	WriteSeconedList.sendKeys(string2 + Keys.ENTER);
        	//Assert.assertEquals(WriteSeconedList.getAttribute("value"),string2);
        	logger.info("Seconed List Button is Typed");
        	

        }
        	public void AddCardTolist() throws Exception {
        		String string3 = RandomStringUtils.randomAlphabetic(6);
        		Thread.sleep(3000);
        		//Assert.assertEquals(ClickTheCardTitleButton.getAttribute("value"),string3);
        		AddCardToList.click();
        		logger.info("Add list Button is Clicked");
        		AddCardTitleList.sendKeys(string3 + Keys.ENTER);
        		logger.info("Add Card Button is Clicked");
        		Thread.sleep(2000);
            	ClickCloseButton.click();
            	logger.info("Close Button is Clicked");
        	}
        	public void MoveCardFromList1toList2() throws Exception {
        		Actions builder = new Actions(driver);
        		WebElement from = driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
        		WebElement to = driver.findElement(By.xpath("(//a[@class='open-card-composer js-open-card-composer'])[1]"));	
        		builder.dragAndDrop(from, to).perform();
        		logger.info("Draga and drop is done ");
        		Thread.sleep(3000);
        	}
        	public void EditTheCardInList2() throws Exception
        	{   Thread.sleep(3000);
        	WebElement element = driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
        	logger.info("Hovered");

        	//Creating object of an Actions class
        	Actions action = new Actions(driver);

        	//Performing the mouse hover action on the target element.
        	action.moveToElement(element).perform();
        		ClickThePencilButton.click();
        		logger.info("Pencil Button is Clicked");
        		ClickTheCardTitleButton.sendKeys("Hyehye");
        		//Assert.assertEquals(ClickTheCardTitleButton.getAttribute("value"),"Hyehye");
        		logger.info("CardTitle Button is Cleceked");
        		Thread.sleep(2000);
        		ClickToSave.click();
        		logger.info("Save Button is Clicked");
        		Thread.sleep(2000);
        		
        	}
        	public void DeleteTheCardFromList2() throws Exception
        	{
        		ClickCard.click();
        		Thread.sleep(2000);
            	Actions a = new Actions(driver);
            	//scroll down a page
            	a.sendKeys(Keys.PAGE_DOWN).build().perform();
        		ClickArchieveButton.click();
        		logger.info("Archeive Button is Clicked");
        		Thread.sleep(2000);
        		ClickDeleteButton.click();
        		logger.info("Delete Button is Clicked");
        		Thread.sleep(2000);
        		ClickDelete.click();
        		Thread.sleep(2000);
        	}
        	}

