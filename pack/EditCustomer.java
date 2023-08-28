import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditCustomer {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PSahani\\eclipse-workspace\\Project_Bank\\chrome1\\chromedriver.exe");

    WebDriver object= new ChromeDriver();
    
    object.get("https://demo.guru99.com/v4/manager/addcustomerpage.php");
    
    WebElement Customer2 = object.findElement(By.xpath("//ul//li[@ a=\"EditCustomer\"]"));
     Customer2.click();
     
     WebElement CustomerID = object.findElement(By.name("cusid "));
	CustomerID.sendKeys("1234");
   
	}

}
