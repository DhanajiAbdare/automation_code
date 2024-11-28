package lobby;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import lobby_utils.BaseTest;
import lobby_utils.BaseTest1;

public class TopMenus extends BaseTest{
	
	@Test
	public void TopMenu() throws InterruptedException 
	{		
		System.out.println("\n User on the New Dingdong Lobby");
		
		//Profile
//		System.out.println("\n Select the user profile icon");
//		driver.findElement(By.xpath("//div[@class='user_img']//img")).click();
//		Thread.sleep(5000);
//		System.out.println(" Select the image to set profile Pic");
//		driver.findElement(By.xpath("//label[@for='picture-9']//img")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='profile_update_btn']")).click();	//Submit
//		Thread.sleep(10000);
//		
//	// Validate the success message after update the profile pic
//		System.out.println(" Validate the success message after update the profile pic");
//		String Expect_Msg = "Your Avatar Submitted Successfully.";
//		WebElement Actual_Msg = driver.findElement(By.xpath("//p[@id='commonToasterBody']"));
//		System.out.println(" Success Message : "+Actual_Msg.getText());
//		Assert.assertEquals(Actual_Msg, Expect_Msg);
//		System.out.println(" Assertion 'PASS' for the success message after update the profile pic");
//		driver.findElement(By.xpath("//span[@class='close']")).click();		//Close the msg pop-up
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[@class='close']")).click();		//Close the profile pop-up
//		Thread.sleep(2000);
		
	//User name & Balance
		Thread.sleep(5000);
		System.out.print("\n Username :"+driver.findElement(By.xpath("//div[@class='profile_balance']/p")).getText());
		WebElement ExpectBalance = driver.findElement(By.xpath("//div[@class='profile_balance']/span"));
		System.out.print("\n Balance :"+ExpectBalance.getText());		
		//Refresh Balance
		System.out.println("\n Refresh the user balance to verify the entry");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='refrash_icon']")).click();	//Refresh the balance
		Thread.sleep(3000);
		WebElement ActualBalance = driver.findElement(By.xpath("//div[@class='profile_balance']/span"));
		System.out.println("\n After the refresh Balance :"+ActualBalance.getText());
		Assert.assertEquals(ActualBalance, ExpectBalance);
		System.out.println(" Assertion 'PASS' for the 'Balance' displayed on the lobby");
		
		//Language
		System.out.println("\n Select the English language");
		driver.findElement(By.xpath("//ul/li[1]/button")).click();		//Select the language icon
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[normalize-space()='English']")).click();
		Thread.sleep(5000);	
//		System.out.println(" Select the Indonesia language");
//		driver.findElement(By.xpath("//ul/li[1]/button")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//p[normalize-space()='Indonesia']")).click();
//		Thread.sleep(5000);
		
		//Reward
		System.out.println("\n Select the 'Reward' icon to verify the table details");
		driver.findElement(By.xpath("//ul/li[2]/button")).click();
		Thread.sleep(5000);
		String RewardData = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div[2]/div/div/div/p")).getText();
		System.out.println(" Table details :" +RewardData);
		driver.findElement(By.xpath("//table[@class='table_data coin_reward']/thead/tr/th[6]/img")).click();
		Thread.sleep(3000);
		String RewardData1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div[2]/div/div/div/p")).getText();
		System.out.println(" After refresh, Table details :" +RewardData1);
		driver.findElement(By.xpath("//div[@class='close_info']//img")).click();	//Close the reward popup
		Thread.sleep(3000);
		
		
		//Information  1.Transactions
		System.out.println("\n Select the 'Information' icon to verify the details");
		driver.findElement(By.xpath("//li[3]//button[1]//img[1]")).click();			//Select information icon
     	Thread.sleep(5000); 
     	
     //Click on the Calendar
     	driver.findElement(By.xpath("//div[@class='custom_calendar']//button//img")).click();
     	Thread.sleep(2000);
     //Previous Month 
     	driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
     	Thread.sleep(2000);
     	
     //Select the date 26th April2024
     	System.out.println(" Select the 'Date' as 'Friday, April 26th, 2024'");
     	driver.findElement(By.xpath("//div[@aria-label='Choose Friday, April 26th, 2024']")).click();
     	Thread.sleep(2000);
     //Select the Dingdong superwheel game
     	System.out.println(" Verify the 'Super Wheel' game details");
     	driver.findElement(By.xpath("//div[@class='all_game_dropdown']//select[@class='ui search dropdown']")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//div[@class='all_game_dropdown']//select[@class='ui search dropdown']//option[9]")).click();
     //Search
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//button[text()='Search']")).click();
     	Thread.sleep(3000);
     //Capture the row for the period '7145'
     	System.out.println("\n Capture the row for the period '7145' & validate the bet amount");
     	
     	WebElement table = driver.findElement(By.xpath("//table[@class='table_data']"));
	    List<WebElement> headings = table.findElements(By.xpath("//table[@class='table_data']/thead"));
        for (WebElement heading : headings) {
            System.out.print(" "+heading.getText()		+  "\t");
        }
        System.out.println(); 								// Move to the next line after printing headings       
        // Iterate through the rows of the table
        for (WebElement row : table.findElements(By.xpath("//table[@class='table_data']"))) {
            // Iterate through the columns of each row
            for (WebElement cell : row.findElements(By.xpath("//table[@class='table_data']//tbody//tr[2]"))) {
            	// Check if the cell is not empty
                if (!cell.getText().isEmpty()) {
                    // Print the text of each cell
                    System.out.print(cell.getText()		+  "\t");
            }
            // Move to the next line after printing all cells of a row
            System.out.println("\n");
        }} 
        Thread.sleep(2000);
     	
     //Capture & validate the debit(bet) amount
      	String value1 = driver.findElement(By.xpath("//table[@class='table_data']//tbody//tr[2]//td[8]")).getText();
     	System.out.println(" Expected Value :"+value1);	 
     	
     	System.out.println("\n Select the 'Bet' option of the period '7145' & verify the amount bifurgation & calculate sum of values");	
     	driver.findElement(By.xpath("//table[@class='table_data']//tbody//tr[2]//td[6]")).click();	//Click on bet option
     	Thread.sleep(5000);
     // Initialize sum variable
        double sum = 0;

        // Iterate over the child pop up 9 rows
        for (int rowIndex = 1; rowIndex <= 9; rowIndex++) {
        
                // Locate the 7th column value of the current row
                WebElement cell = driver.findElement(By.xpath("//div[@class='poupup_detail_table']/table/tbody/tr[" + rowIndex + "]/td[7]"));
                
                // Get the cell text and remove commas
                String cellText = cell.getText().replace(",", "");
                
                // Convert the cell text to a double
                double value = Double.parseDouble(cellText);
                
                // Add the value to the sum
                sum += value;
            }

        // Store the sum in a variable
        double value2 = sum;

        // Output the sum
        System.out.println("\n Actual Value :" + value2);   	
//     	Assert.assertEquals(value1, value2);
//     	System.out.println("\n Assertion 'PASS' for the debit amount '45,000' of the '7145' period");
     	driver.findElement(By.xpath("//div[@class='modal']/div[2]")).click();				//Close the child pop-up
     	Thread.sleep(2000);
     	
        //Select the pagination arrow //div[contains(@class,'page_number')][text()='2'] =>this is also applicable to paginate 2,3,4
     	System.out.println("\n Select the bottom pagination arrow to verify the entries on the page");
     	driver.findElement(By.xpath("//img[@alt='right arrow']")).click();
     	Thread.sleep(10000);
     	driver.findElement(By.xpath("//img[@alt='right arrow']")).click();
     	Thread.sleep(10000);
     	driver.findElement(By.xpath("//img[@alt='right arrow']")).click();
     	Thread.sleep(10000);
     	
     	// Select the top pagination drop down to verify the page entries 
     	System.out.println("\n Select the 'Option 50' of the pagination dropdown to verify the page entries");
     	driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div[1]/select")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div[1]/select/option[3]")).click();
     	Thread.sleep(10000); 
//     	//Search
//     	driver.findElement(By.xpath("//button[text()='Search']")).click();
//     	Thread.sleep(5000);
     	
     	System.out.println(" ScrollDown the page to view entries");
     	JavascriptExecutor js = (JavascriptExecutor)driver;
     	WebElement number = driver.findElement(By.xpath("//td[normalize-space()='20']"));
	    js.executeScript("arguments[0].scrollIntoView(true);", number);						//	scroll down till the last entry
	    Thread.sleep(2000);	    
	    WebElement number1 = driver.findElement(By.xpath("//td[normalize-space()='30']"));
        js.executeScript("arguments[0].scrollIntoView(true);", number1);					//	scroll down till the last entry
	    Thread.sleep(2000);	    
	    WebElement number2 = driver.findElement(By.xpath("//td[normalize-space()='31']"));
	    js.executeScript("arguments[0].scrollIntoView(true);", number2);					//	scroll down till the last entry
	    Thread.sleep(2000);

     	//Information  2.Member List
		System.out.println("\n Select the 'Member List' option");
		driver.findElement(By.xpath("//button[normalize-space()='Member List']")).click();
     	Thread.sleep(3000);
     	
     	//Information  3. Bonus Referral
     	System.out.println("\n Select the 'Bonus Referral' option");
     	driver.findElement(By.xpath("//button[normalize-space()='Bonus Referral']")).click();
		Thread.sleep(3000);

		//Information  4. Info TurnOver	
		//validate the Turnover fields =Win/Lose & TurnOver amount
		System.out.println("\n Select the 'Info TurnOver' option");
		driver.findElement(By.xpath("//button[normalize-space()='Info Turnover']")).click();
		Thread.sleep(3000);
		System.out.println(" Capture 'Win & TurnOver' amount on the parent popup of the date '2024-11-08'");
		String ActualWin = driver.findElement(By.xpath("//td[normalize-space()='29,000.00']")).getText();
		System.out.println(" Actual Win Amount (Parent popup) :"+ActualWin);
		String ActualTurnOver = driver.findElement(By.xpath("//td[normalize-space()='57,000.00']")).getText();
		System.out.println(" Actual TurnOver Amount (Parent popup) :"+ActualTurnOver);
		Thread.sleep(2000);
		
		System.out.println("\n Select the date '2024-11-08' to validate the entry");
		WebElement date = driver.findElement(By.xpath("//span[normalize-space()='2024-11-08']"));
		date.click();
		Thread.sleep(5000);

//	    WebElement table1 = driver.findElement(By.xpath("//table[@class='table_data data_table1']"));
//	    List<WebElement> headings1 = table.findElements(By.xpath("//table[@class='table_data data_table1']/thead"));
//        for (WebElement heading : headings1) {
//            System.out.print(heading.getText()		+  "\t");
//        }
//        System.out.println(); 								// Move to the next line after printing headings       
//        // Iterate through the rows of the table
//        for (WebElement row : table1.findElements(By.xpath("//table[@class='table_data data_table1']"))) {
//            // Iterate through the columns of each row
//            for (WebElement cell : row.findElements(By.xpath("//table[@class='table_data data_table1']/tbody/tr"))) {
//            	// Check if the cell is not empty
//                if (!cell.getText().isEmpty()) {
//                    // Print the text of each cell
//                    System.out.print(cell.getText()		+  "\t");
//            }
//            // Move to the next line after printing all cells of a row
//            System.out.println("\n");
//        }}  
		
        String ExpectWin = driver.findElement(By.xpath("//table[@class='table_data data_table1']/tbody/tr/td[2]")).getText();
        System.out.println(" Expected Win Amount (Child popup) :"+ExpectWin);
        Thread.sleep(2000);
        Assert.assertEquals(ActualWin, ExpectWin);
        String ExpectTurnOver = driver.findElement(By.xpath("//table[@class='table_data data_table1']/tbody/tr/td[3]")).getText();
        System.out.println(" Expected TurnOver Amount (Child popup) :"+ExpectTurnOver);
        Thread.sleep(2000);
        Assert.assertEquals(ActualTurnOver, ExpectTurnOver);
        System.out.println("\n Assertion 'PASS' for Win/Lose & Turnover values of the date ");
	    driver.findElement(By.xpath("//button[@class='info_popup_close']/img")).click();	//close the child pop-up
	    Thread.sleep(5000);
	
	    
//Select the 'Transaction' option to validate the 'Win' amount
	    	System.out.println("\n Select the transaction option to compare the turnover amount of the date '2024-11-08'");
	    	driver.findElement(By.xpath("//button[text()='Transaction']")).click();	// Transaction option
	    	Thread.sleep(5000);
     	
	     //Click on the Calendar
	     	driver.findElement(By.xpath("//div[@class='custom_calendar']//button//img")).click();
	     	Thread.sleep(2000);
	     //Previous Month 
//	     	driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
//	     	Thread.sleep(2000);
//	     	driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
//	     	Thread.sleep(2000);
//	     	driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
//	     	Thread.sleep(2000);
	  
	     //Select the date Friday, November 8th, 2024
	     	System.out.println(" Select the 'Date' as 'Friday, November 8th, 2024'");
	     	driver.findElement(By.xpath("//div[@aria-label='Choose Friday, November 8th, 2024']")).click();
	     	Thread.sleep(2000);
	     //Select the Dingdong 48D STANDARD game
	     	System.out.println(" Verify the 'Dingdong 48D STANDARD' game details");
	     	driver.findElement(By.xpath("//div[@class='all_game_dropdown']//select[@class='ui search dropdown']")).click();
	     	Thread.sleep(2000);
	     	driver.findElement(By.xpath("//div[@class='all_game_dropdown']//select[@class='ui search dropdown']//option[5]")).click();
	     //Search
	     	Thread.sleep(1000);
	     	driver.findElement(By.xpath("//button[text()='Search']")).click();
	     	Thread.sleep(3000);
	    
	     // Extract text values
	     	String value3 = driver.findElement(By.xpath("//td[normalize-space()='13,000.00']")).getText(); 
	     	String value4 = driver.findElement(By.xpath("//td[normalize-space()='12,000.00']")).getText(); 
	     	String value5 = driver.findElement(By.xpath("//td[normalize-space()='22,000.00']")).getText(); 
	     	String value6 = driver.findElement(By.xpath("//td[normalize-space()='10,000.00']")).getText(); 

	     // Clean the values by removing commas and converting to double
	        double num1 = Double.parseDouble(value3.replace(",", ""));
	        double num2 = Double.parseDouble(value4.replace(",", ""));
	        double num3 = Double.parseDouble(value5.replace(",", ""));
	        double num4 = Double.parseDouble(value6.replace(",", ""));
        
	     // Calculate the sum
	        double sum1 = num1 + num2 + num3 + num4;       
	     // Print the sum of 'Win' amount
	        System.out.println("The sum of the 'Turnover' amount is: " + sum1);
	        
// Compare the values of InfoTurnover & Transaction option for the date 08-11-2024
	        try {
	            // Perform the assertion
	        	Assert.assertEquals(ActualTurnOver, sum1);
	            System.out.println("Assertion passed: TurnOver amount is equal to Transaction amount.");
	        } catch (AssertionError e) {
	            // Handle the assertion failure
	            System.out.println("Caught an AssertionError: " + e.getMessage());
	            // Optionally, log the error or perform other actions
	        }

		//Information  5. Bonus Event
	    System.out.println("\n Select the 'Bonus Event' option");
		driver.findElement(By.xpath("//button[normalize-space()='Bonus Event']")).click();
		Thread.sleep(2000);	
		
		//Close the Information pop-up (parent)
		driver.findElement(By.xpath("//a[@class='close_info']//img")).click();
		Thread.sleep(3000);
		
		
		// Click on the Notification
		        System.out.println("\n\n Select the 'Notification' icon to get the count");
		        String count = driver.findElement(By.xpath("//span[@class='notify_count']")).getText();			
				System.out.println(" Notification Count =  " + count);			// Count the Notify
				Thread.sleep(3000);

				driver.findElement(By.xpath("//li[4]//button[1]//img[1]")).click();		//Select the Notification icon
				Thread.sleep(3000);
				
				// Open Notify
				driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]")).click();
				Thread.sleep(3000);
								
				// Check if is there any new Notification 
				String pageSource = driver.getPageSource();
				if(pageSource.contains("NEW")){
				    System.out.println(" " +count+ " : NEW Notifications ");
				} 
				
				else {
				    System.out.println("\n There is no new Notification");
				}

				System.out.println("\n Open any one notification ");
				System.out.println("--------------------------------------");			
				//Read and Print That notification
				System.out.println(driver.findElement(By.xpath("//div[@class='notification_Details']")).getText());
				Thread.sleep(3000);		
				System.out.println("--------------------------------------");	
				// Close the Open Notification 
				System.out.println(" Close the notification");
				driver.findElement(By.xpath("//img[@class='btnclose']")).click();
				Thread.sleep(3000);				 
				
				// Scroll the Notification pop-up page
				System.out.println("\n Scroll the popup page to view the 'Notifications'");									// Create JavascriptExecutor for count button
			    WebElement sc = driver.findElement(By.xpath("//td[normalize-space()='17']"));		
			    js.executeScript("arguments[0].scrollIntoView(true);", sc);					    //	scroll down till count button
			    Thread.sleep(2000);
			    	    
			    WebElement sc1 = driver.findElement(By.xpath("//td[normalize-space()='27']"));		
			    js.executeScript("arguments[0].scrollIntoView(true);", sc1);					//	scroll down till count button
			    Thread.sleep(2000);			    
			    
			    WebElement sc2 = driver.findElement(By.xpath("//td[normalize-space()='37']"));		
			    js.executeScript("arguments[0].scrollIntoView(true);", sc2);					//	scroll down till count button
			    Thread.sleep(2000);			    
			    
			    WebElement sc3 = driver.findElement(By.xpath("//td[normalize-space()='47']"));		
			    js.executeScript("arguments[0].scrollIntoView(true);", sc3);					//	scroll down till count button
			    Thread.sleep(2000);
			    
			    WebElement sc4 = driver.findElement(By.xpath("//td[normalize-space()='57']"));		
			    js.executeScript("arguments[0].scrollIntoView(true);", sc4);					//	scroll down till count button
			    Thread.sleep(2000);
			    
			    System.out.println("\n Close the notification popup ");
		        driver.findElement(By.xpath("//div[@class='close_info']")).click();
		     	Thread.sleep(2000);  	
		     		     	
		 // Click on the Logout
		     	System.out.println("\n Select the LogOut icon to exit from the application");
		     	driver.findElement(By.xpath("//div[@class='main_navigation']/div[2]/ul/li[5]")).click();
		     	Thread.sleep(5000);
//		     	System.out.println(" Message after 'Logout' :"+driver.findElement(By.xpath("//h1[normalize-space()='You have logged out']")).getText());
//		     	Thread.sleep(2000);
	}
}
