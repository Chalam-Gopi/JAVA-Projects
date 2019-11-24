package Auto.Selenium;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class Selenium 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
        
    	
    	//System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "D:\\wedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com/");
		Thread.sleep(5000);
		
		
		//FINDING WEB ELEMENTS ON DROPDOWN
		//---------------------------------------------
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='adults']"));
		Select slc=new Select(dropdown);
		slc.selectByValue("2");
		slc.selectByIndex(2);
		slc.selectByVisibleText("6");
		
		WebElement e=slc.getFirstSelectedOption();
		System.out.println(e.getText());
		
     
		//Taking Screenshot
		//---------------------------------------
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(source, new File("D:\\wedriver\\chromedriver_win32\\Test1.png"));
    
		
		
		
		
		
		
    
    }
}
