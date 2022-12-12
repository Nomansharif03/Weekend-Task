package WeekendTaskExecution;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import WeekendTaskObject.WeekendTaskObject;


public class WeekendTaskExecution {

		WebDriver driver=new ChromeDriver();
		WeekendTaskObject object =new WeekendTaskObject(driver);
	    
	    @Test(description="Login",priority =1)
		public void Task1Writethename() throws Exception {
	    	PropertyConfigurator.configure("log4j.properties");
			
	   
			driver.get("https://id.atlassian.com/login?application=trello&continue=https%3A%2F%2Ftrello.com%2Fauth%2Fatlassian%2Fcallback%3FreturnUrl%3D%252F%26display%3DeyJ2ZXJpZmljYXRpb25TdHJhdGVneSI6InNvZnQifQ%253D%253D%26aaOnboarding%3D%26updateEmail%3D%26traceId%3D%26ssoVerified%3D&email=nomansharif03%40gmail.com&prompt=true&infoCode=existingUserSignupAttempt&display=eyJ2ZXJpZmljYXRpb25TdHJhdGVneSI6InNvZnQifQ%3D%3D");
			object.Login();
	    }
	    @Test(description="Create Board With Random Number",priority=2)
	    public void CreateBoardWithRandomNumber() throws Exception {
	    object.CreateBoard();

}
	    @Test(description="Creating two Lists",priority=3)
	    public void AddingTwoLists() throws Exception {
	    	object.AddTwoLists();
	    }
	    @Test(description="Add Card To The List",priority=4)
	    public void AddCardToList() throws Exception {
	    	object.AddCardTolist();
	    }
	    @Test(description="Add Card from List 1 to list2",priority=5)
	    public void MoveCardFromList1toList2() throws Exception {
	    	object.MoveCardFromList1toList2();
	    }
	    @Test(description="Edit the Card in the List",priority=6)
	    public void EditTheCard() throws Exception
	    {
	    	object.EditTheCardInList2();
	    }
	    @Test(description="Delete the Card from List",priority=7)
	    public void DeleteCardfromList() throws Exception
	    {
	    	object.DeleteTheCardFromList2();
	    }
}

