package automation.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestCases {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		 
		
		 //Open the link
		 driver.navigate().to("https://www.amazon.com/");
		 driver.manage().window().maximize();
		 String title = driver.getTitle();
		 
		 System.out.println(title);
		 
		 //web element
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		 Thread.sleep(2000);
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("add-to-cart-button")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("/html/body/div[1]/div[2]/div/div[1]/div[2]/div/div[1]/form/span/span/span/input")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("ap_email")).sendKeys("00000111111");
		 Thread.sleep(2000);
		 driver.findElement(By.className("a-button-input")).click();
		 Thread.sleep(2000);
		driver.findElement(By.id("createAccountSubmit")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("ap_customer_name")).sendKeys("mahin");
		 Thread.sleep(2000);
		 driver.findElement(By.id("ap_email")).sendKeys("mahin@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.id("ap_password")).sendKeys("11111111");
		 Thread.sleep(2000);
		 driver.findElement(By.id("ap_password_check")).sendKeys("11111111");
		 Thread.sleep(2000);
		 driver.findElement(By.id("continue")).click();
		 Thread.sleep(2000);

	}

}
