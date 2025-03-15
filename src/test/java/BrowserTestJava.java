import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTestJava {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath :" + projectPath);

        System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // driver.get("http://www.google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("abcd");
        WebElement textBox = driver.findElement(By.id("lst-ib"));
        textBox.sendKeys("Automation Step by Step");
        System.out.println("POST JIRA01");
        System.out.println("New push0");
        System.out.println("New push01");
        System.out.println("New push03");
        System.out.println("New push04");
        driver.close();
        //	 driver.quit();
    }
}
