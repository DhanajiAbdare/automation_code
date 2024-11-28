package lobby;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import lobby_utils.BaseTest;

public class LeftsideMenus extends BaseTest {
	
	@Test
	public void LeftMenu() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("\n User on the New Dingdong Lobby to access 'ALL Games' ");
		
	//Language
		System.out.println("\n Select the English language");
		driver.findElement(By.xpath("//ul/li[1]/button")).click();		//Select the language icon
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[normalize-space()='English']")).click();
		Thread.sleep(3000);
		
		System.out.println("\n Select the hamberg menu to change the view of 'ALL Games'of the page");
		
	//Select the hamburger menu
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dashboard_gird_list_button']//img")).click();
		Thread.sleep(2000);
		
	//MouseOver on the games to verify the limits	
		System.out.println("\n MouseOver on the 'Dingdong' games to check the game appearance & limits "
				+ "\n\n Verify the 'First' game :"+driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[1]//p[@class='game_item_title']")).getText());
		WebElement GameOption1 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']/div[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(GameOption1).perform();
		Thread.sleep(2000);
		String limit1 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[1]//div[@class='game_item_footer']")).getText();
		System.out.print(" Limit & Users :"+" \n " +limit1);
		//Print the limits
//				List<WebElement> limit1 = driver.findElements(By.xpath("//*[@id=\"root\"]/div[5]/div/div[2]/div[1]/div[1]/div/p"));
//		        // Iterate through the elements and print their text
//		        for (WebElement limit : limit1) {
//		        	System.out.println(" "+limit.getText());
//		        }
		
		System.out.println("\n\n Verify the 'Second' game :"+driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[2]//p[@class='game_item_title']")).getText());
		WebElement GameOption2 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']/div[2]"));
		act.moveToElement(GameOption2).perform();
		Thread.sleep(2000);
		String limit2 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[2]//div[@class='game_item_footer']")).getText();
		System.out.print(" Limit & Users :"+" \n " +limit2);
		//Print the limits
//				List<WebElement> limit2 = driver.findElements(By.xpath("//*[@id=\"root\"]/div[5]/div/div[2]/div[2]/div[1]/div/p"));
//		        // Iterate through the elements and print their text
//		        for (WebElement limit : limit2) {
//		        	System.out.println(" "+limit.getText());
//		        }
		
		System.out.println("\n\n Verify the 'Third' game :"+driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[3]//p[@class='game_item_title']")).getText());
		WebElement GameOption3 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']/div[3]"));
		act.moveToElement(GameOption3).perform();
		Thread.sleep(2000);
		String limit3 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[3]//div[@class='game_item_footer']")).getText();
		System.out.print(" Limit & Users :"+" \n " +limit3);
		//Print the limits
//				List<WebElement> limit3 = driver.findElements(By.xpath("//*[@id=\"root\"]/div[5]/div/div[2]/div[3]/div[1]/div/p"));
//		        // Iterate through the elements and print their text
//		        for (WebElement limit : limit3) {
//		        	System.out.println(" "+limit.getText());
//		        }
		
		System.out.println("\n\n Verify the 'Fourth' game :"+driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[4]//p[@class='game_item_title']")).getText());
		WebElement GameOption4 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']/div[4]"));
		act.moveToElement(GameOption4).perform();
		Thread.sleep(2000);
		String limit4 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[4]//div[@class='game_item_footer']")).getText();
		System.out.print(" Limit & Users :"+" \n " +limit4);
		//Print the limits
//				List<WebElement> limit4 = driver.findElements(By.xpath("//*[@id=\"root\"]/div[5]/div/div[2]/div[4]/div[1]/div/p"));
//		        // Iterate through the elements and print their text
//		        for (WebElement limit : limit4) {
//		        	System.out.println(" "+limit.getText());
//		        }
		
		System.out.println("\n\n Verify the 'Fifth' game :"+driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[5]//p[@class='game_item_title']")).getText());
		WebElement GameOption5 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']/div[5]"));
		act.moveToElement(GameOption5).perform();
		Thread.sleep(2000);
		String limit5 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[5]//div[@class='game_item_footer']")).getText();
		System.out.print(" Limit & Users :"+" \n " +limit5);
		//Print the limits
//				List<WebElement> limit5 = driver.findElements(By.xpath("//*[@id=\"root\"]/div[5]/div/div[2]/div[5]/div[1]/div/p"));
//		        // Iterate through the elements and print their text
//		        for (WebElement limit : limit5) {
//		        	System.out.println(" "+limit.getText());
//		        }
		
		System.out.println("\n\n Verify the 'Sixth' game :"+driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[6]//p[@class='game_item_title']")).getText());
		WebElement GameOption6 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']/div[6]"));
		act.moveToElement(GameOption6).perform();
		Thread.sleep(2000);
		String limit6 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[6]//div[@class='game_item_footer']")).getText();
		System.out.print(" Limit & Users :"+" \n " +limit6);
		//Print the limits
//				List<WebElement> limit6 = driver.findElements(By.xpath("//*[@id=\"root\"]/div[5]/div/div[2]/div[6]/div[1]/div/p"));
//		        // Iterate through the elements and print their text
//		        for (WebElement limit : limit6) {
//		        	System.out.println(" "+limit.getText());
//		        }
		
		System.out.println("\n\n Verify the 'Seventh' game :"+driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[7]//p[@class='game_item_title']")).getText());
		WebElement GameOption7 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']/div[7]"));
		act.moveToElement(GameOption7).perform();
		Thread.sleep(2000);
		String limit7 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[7]//div[@class='game_item_footer']")).getText();
		System.out.print(" Limit & Users :"+" \n " +limit7);
		//Print the limits
//				List<WebElement> limit7 = driver.findElements(By.xpath("//*[@id=\"root\"]/div[5]/div/div[2]/div[7]/div[1]/div/p"));
//		        // Iterate through the elements and print their text
//		        for (WebElement limit : limit7) {
//		        	System.out.println(" "+limit.getText());
//		        }
		
		System.out.println("\n\n Verify the 'Eight' game :"+driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[8]//p[@class='game_item_title']")).getText());
		WebElement GameOption8 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']/div[8]"));
		act.moveToElement(GameOption8).perform();
		Thread.sleep(2000);
		String limit8 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[8]//div[@class='game_item_footer']")).getText();
		System.out.print(" Limit & Users :"+" \n " +limit8);
		//Print the limits
//				List<WebElement> limit8 = driver.findElements(By.xpath("//*[@id=\"root\"]/div[5]/div/div[2]/div[8]/div[1]/div/p"));
//		        // Iterate through the elements and print their text
//		        for (WebElement limit : limit8) {
//		            System.out.println(" "+limit.getText());
//		        }
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		System.out.println("\n\n Verify the 'Nineth' game :"+driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[9]//p[@class='game_item_title']")).getText());
		WebElement GameOption9 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']/div[9]"));
		act.moveToElement(GameOption9).perform();
		Thread.sleep(2000);
		String limit9 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[9]//div[@class='game_item_footer']")).getText();
		System.out.print(" Limit & Users :"+" \n " +limit9);
		
		System.out.println("\n\n Verify the 'Tenth' game :"+driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[10]//p[@class='game_item_title']")).getText());
		WebElement GameOption10 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']/div[10]"));
		act.moveToElement(GameOption10).perform();
		Thread.sleep(2000);
		String limit10 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[10]//div[@class='game_item_footer']")).getText();
		System.out.print(" Limit & Users :"+" \n " +limit10);
		
		System.out.println("\n\n Verify the 'Eleventh' game :"+driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[11]//p[@class='game_item_title']")).getText());
		WebElement GameOption11 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']/div[11]"));
		act.moveToElement(GameOption11).perform();
		Thread.sleep(2000);
		String limit11 = driver.findElement(By.xpath("//div[@class='game_lists grid_view']//div[11]//div[@class='game_item_footer']")).getText();
		System.out.print(" Limit & Users :"+" \n " +limit11);
		
	//Select the hamburger menu
		driver.findElement(By.xpath("//div[@class='dashboard_gird_list_button']//img")).click();
		Thread.sleep(3000);
//		System.out.println("\n Scroll the page upto 'Super Wheel' game");
//		WebElement Super_Wheel = driver.findElement(By.xpath("//*[@class='game_lists null']/div[8]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", Super_Wheel);
//		Thread.sleep(3000);
		
	//Access left side menus of the lobby : 48D
		System.out.println("\n\n Select the '48D' category to play the games");
		driver.findElement(By.xpath("//div[@class='left_section']/ul/li[2]")).click();
		Thread.sleep(5000);
		
		//36D
		System.out.println(" Select the '36D' category to play the games");
		driver.findElement(By.xpath("//div[@class='left_section']/ul/li[3]")).click();
		Thread.sleep(5000);
		
		//24D
		System.out.println(" Select the '24D' category to play the games");
		driver.findElement(By.xpath("//div[@class='left_section']/ul/li[4]")).click();
		Thread.sleep(5000);
		
		//12D
		System.out.println(" Select the '12D' category to play the games");
		driver.findElement(By.xpath("//div[@class='left_section']/ul/li[5]")).click();
		Thread.sleep(5000);
		
		//Multibet- Scroll the page up to the multibet option
		System.out.println("\n Scroll the left side menu upto the multibet option");
		WebElement multiBet = driver.findElement(By.xpath("//div[@class='left_section']/ul/li[10]"));
		js.executeScript("arguments[0].scrollIntoView(true);", multiBet);
		
		//Sicbo
		System.out.println("\n Select the 'Sicbo' category to play the games");
		driver.findElement(By.xpath("//div[@class='left_section']/ul/li[6]")).click();
		Thread.sleep(5000);
		
		//Dragon Tiger		
		System.out.println(" Select the 'Dragon Tiger' category to play the games");
		driver.findElement(By.xpath("//div[@class='left_section']/ul/li[7]")).click();
		Thread.sleep(5000);
		
		//Poker Dice
		System.out.println(" Select the 'Poker Dice' category to play the games");
		driver.findElement(By.xpath("//div[@class='left_section']/ul/li[8]")).click();
		Thread.sleep(5000);
		
		//Super Wheel
		System.out.println(" Select the 'Super Wheel' category to play the games");
		driver.findElement(By.xpath("//div[@class='left_section']/ul/li[9]")).click();
		Thread.sleep(5000);
		
	//Access the multibet option
				System.out.println("\n\n Select the multibet option ");
				js.executeScript("arguments[0].scrollIntoView(true);", multiBet);
				multiBet.click();
				Thread.sleep(5000);
		
				//Add 1st game
				System.out.println("\n Select the 1st game to place the multiBets");
				driver.findElement(By.xpath("//div[@class='multibet_cards']/div[1]/button[1]")).click();
				Thread.sleep(5000);			
				//Choose Game 
			    driver.findElement(By.xpath("//div[@class='multipopup_game_conainer']/div[1]")).click();	    
//			    Thread.sleep(2000);
//			    WebElement Game1_limit1 = driver.findElement(By.xpath("//div[@class='multipopup_game_conainer']/div[1]/div[1]/ul[1]/li[1]"));
//			    act.moveToElement(Game1_limit1).perform();
//			    Thread.sleep(2000);
//			    System.out.println(" 'Limit 1' of the 48D :" +driver.findElement(By.xpath("//div[@class='multipopup_game_conainer']/div[1]/div[1]/ul[1]/li[1]/p[2]")).getText());
//			    Game1_limit1.click();				//select the limit1
			    Thread.sleep(3000);
			    
			    //Again add 1st game 
			    System.out.println("\n Select the same game(1st) to place the multibets");
				driver.findElement(By.xpath("//div[@class='multibet_cards']/div[2]/button[1]")).click();
				Thread.sleep(5000);
				//Choose Game 
			    driver.findElement(By.xpath("//div[@class='multipopup_game_conainer']/div[1]")).click();	    
//			    Thread.sleep(2000);
//			    WebElement Game1_limit = driver.findElement(By.xpath("//div[@class='multipopup_game_conainer']/div[1]/div[1]/ul[1]/li[1]"));
//			    act.moveToElement(Game1_limit).perform();
//			    Thread.sleep(2000);
//			    System.out.println(" 'Limit 1' of the 48D :" +driver.findElement(By.xpath("//div[@class='multipopup_game_conainer']/div[1]/div[1]/ul[1]/li[1]/p[2]")).getText());
//			    Game1_limit.click();				//select the same limit1
			    Thread.sleep(5000);		    
			    //Capture error message(After the same game selection)
			    System.out.println("\n Message after the same game selection :"+driver.findElement(By.xpath("//div[@class='conn_lost_inner']/span")).getText());
			    driver.findElement(By.xpath("//div[@class='conn_lost_inner']/div/button")).click();	//Close the pop-up
			    Thread.sleep(3000);
			    
			    //Choose 2nd Game
//			    System.out.println("\n Select the 2nd game to place the multibets");
//			    driver.findElement(By.xpath("//div[@class='multibet_cards']/div[2]/button[1]")).click();	    
//			    Thread.sleep(3000);
			    System.out.println("\n Select the 2nd game to place the multibets");
			    driver.findElement(By.xpath("//div[@class='multipopup_game_conainer']/div[2]")).click();
//			    WebElement Game2_limit1 = driver.findElement(By.xpath("//div[@class='modal']//div[2]/div[1]/ul[1]/li[1]"));
//			    act.moveToElement(Game2_limit1).perform();
//			    Thread.sleep(2000);
//			    System.out.println(" 'Limit 1' of the 36D :" +driver.findElement(By.xpath("//div[@class='modal']//div[2]/div[1]/ul[1]/li[1]/p[2]")).getText());
//			    Game2_limit1.click();				//Select the limit1
			    Thread.sleep(3000);
			    
			    //Add 3rd game
			    System.out.println("\n Select the 3rd game to place the multibets");
			    driver.findElement(By.xpath("//div[@class='multibet_cards']/div[3]/button[1]")).click();
				Thread.sleep(5000);
				//Choose Game 
			    driver.findElement(By.xpath("//div[@class='multipopup_game_conainer']/div[4]")).click();	    
//			    WebElement Game7_limit1 = driver.findElement(By.xpath("//div[@class='multipopup_game_conainer']/div[7]/div/ul/li[1]"));
//			    act.moveToElement(Game7_limit1).perform();
//			    Thread.sleep(2000);
//			    System.out.println(" 'Limit 1' of the Poker Dice :" +driver.findElement(By.xpath("//div[@class='multipopup_game_conainer']/div[7]/div/ul/li[1]/p[2]")).getText());
//			    Game7_limit1.click();				//Select the limit1
			    Thread.sleep(3000);
			    
			    //Clear 2nd Game
			    System.out.println("\n Clear the 2nd game of the multibets");
			    driver.findElement(By.xpath("//div[@class='multibet_cards']/div[2]/button[2]")).click();
				Thread.sleep(3000);
				
				//Play Game
				js.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(2000);
				System.out.println(" Select the 'Play Now' option to place the bets");
				driver.findElement(By.xpath("//div[@class='text-center']/button")).click();
				Thread.sleep(15000);								// Opened the game in a new Tab
		
				System.out.println("\n Handling of the 2 opened windows");
				Set<String> AllIDs = driver.getWindowHandles();		// Create an object to get all Tab_ID and access them
				Iterator<String> itr = AllIDs.iterator();
				String lobby = itr.next();
						
				System.out.println("\n Move on previous page of Dingdong lobby to validate the 'Search' field");
				driver.switchTo().window(lobby);											
				Thread.sleep(5000);
				
		//Search field validation
				WebElement AllGames = driver.findElement(By.xpath("//div[@class='left_section']//img[@alt='AllGames']"));
				js.executeScript("arguments[0].scrollIntoView(true);", AllGames);
				AllGames.click();
				Thread.sleep(5000);
				
				System.out.println("\n Validate the search option : '48D'");
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("48D");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@type='text']")).clear();
				System.out.println(" Validate the search option : '36D'");
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("36D");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@type='text']")).clear();
				System.out.println(" Validate the search option : '24D'");
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("24D");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@type='text']")).clear();
				System.out.println(" Validate the search option : '12D'");
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12D");
				Thread.sleep(3000);
				
//				System.out.println(" Validate the search option : 'Standard'");
//				driver.findElement(By.xpath("//input[@type='text']")).clear();
//				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Standard");
//				Thread.sleep(3000);
				
//				System.out.println(" Validate the search option : 'VIP'");
//				driver.findElement(By.xpath("//input[@type='text']")).clear();
//				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("VIP");
//				Thread.sleep(3000);
				
//				System.out.println(" Validate the search option : 'President'");
//				driver.findElement(By.xpath("//input[@type='text']")).clear();
//				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("President");
//				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@type='text']")).clear();
				System.out.println(" Validate the search option : 'Sicbo'");
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sicbo");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@type='text']")).clear();
				System.out.println(" Validate the search option : 'Dragon Tiger'");
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dragon Tiger");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@type='text']")).clear();
				System.out.println(" Validate the search option : 'Poker Dice'");
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Poker Dice");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@type='text']")).clear();
				System.out.println(" Validate the search option : 'Super Wheel'");
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Super Wheel");
				Thread.sleep(3000);
	}
}
