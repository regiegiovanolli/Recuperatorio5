import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateMyAddresses {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void updateMyAddress() {
        Login.login1("reginagiova@gmail.com", "12345");

        MiDireccion.midireccion1();

        DatosPersonales.datosPersonales("1234567890", "0987654321", "1st street 36110", "casa", "UTN AUTOMATION");



        /*Se valida el cambio realizado. Se compara el valor del alias actualizado*/
        assertEquals("UTN AUTOMATION", driver.findElement(By.cssSelector(".page-subheading")).getText());

    }
}
