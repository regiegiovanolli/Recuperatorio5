import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

public class Login {
    /*se inicia sesion en la aplicacion*/
    public static void login1(String email, String password) {
        WebDriver driver = WebDriverSupliter.getChromeDriver();

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();


    }

}
