import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;


public class Bank{
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\PSahani\\eclipse-workspace\\Hello\\gecko\\geckodriver.exe");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\PSahani\\eclipse-workspace\\Project_Bank\\chrome1\\chromedriver.exe");
		
			ChromeOptions opt = new ChromeOptions();
	        opt.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
	        driver = new ChromeDriver(opt);
			
			driver.get("https://demo.guru99.com/v4/manager/addcustomerpage.php");
			
			//WebElement Manager =driver.findElement(By.xpath("//td[contains(text(),'Manger Id :')]"));
			//Manager.sendKeys("mngr488659");
			
			WebElement NewCustomer = driver.findElement(By.xpath("//a[contains(text(),'New Customer')]"));
			NewCustomer.click();
		    
			WebElement Customer =driver.findElement(By.name("name"));
			Customer.sendKeys("Pawan");  //customer Name
			
			  List<WebElement> radio1 = driver.findElements(By.name("rad1"));  //radio button call
			
			System.out.print("total number of radio button : "+ radio1.size()); // how many raido bustton avilable 
			
			for(WebElement e:radio1)
			{
				if(e.getAttribute("value").equalsIgnoreCase("F"))
	            {
					e.click(); // female than call
				}
			
			}
			
		 WebElement date =driver.findElement(By.name("dob"));  // date call
			
			date.sendKeys("02022022");  // date value Enter
			
		  WebElement Address=driver.findElement(By.name("addr"));
		 Address.sendKeys("SHAKTI PROPERTY DEVELOPERS  403 SHAKTI  SRA"); // address dateal files
			
		  WebElement City=driver.findElement(By.name("city"));
			City.sendKeys("kandivali");
			
		 WebElement State= driver.findElement(By.name("state"));
		 State.sendKeys("Maharahtra");
		 
		 WebElement Pin =driver.findElement(By.name("pinno"));
		 Pin.sendKeys("400102");
		 
		 WebElement Mobile =driver.findElement(By.name("telephoneno"));
		 Mobile.sendKeys("9867739179");
		 
		 WebElement EMail =driver.findElement(By.name("emailid"));
		 EMail.sendKeys("pawansahani019@gmail.com");
		 
		 WebElement pass =driver.findElement(By.name("password"));
		 pass.sendKeys("emYdehe");
		 
		//driver.findElement(By.name("sub")).click();
		 
		//WebElement home= driver.findElement(By.linkText("Home"));
		 //home.click();
		
		 Thread.sleep(10000);        
        WebElement Customer2 = driver.findElement(By.xpath("//a[contains(text(),'Edit Customer')]"));
        Customer2.click();
        WebElement custome =driver.findElement(By.name("cusid"));
        custome.sendKeys("mngr488659");
        
        driver.findElement(By.name("sub")).click();
        
        
        //WebElement Customer3 = driver.findElement(By.xpath("//a[contains(text(),'Edit Customer')]"));
       // Customer3.click();
	}

}
