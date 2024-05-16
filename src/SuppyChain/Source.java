package SuppyChain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Source {


	// TODO Auto-generated method stub
	public void test()
	{
		String baseurl="https://amazon.in";
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(baseurl);
		
				
			try{
				Boolean Logo = driver.findElement(By.xpath("//a[contains(@id,'logo')]")).isDisplayed(); 
				if(Logo ==true)
				{
					System.out.println("Logo is displayed");
				}
				
				else {
					System.out.println("Logo is not displayed");
			}
			}
			catch(Exception e)
			{
				System.out.println("An exception occurred please check Xpath:");
				
			}
		


	
			}
	public static void main(String[] args) {
		
		
		Source Call= new Source();
		Call.test();
		
	}
	

	}

