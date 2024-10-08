import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {
    private WebDriver driver;

    @Test
    public void testContextMenu() {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.id("hot-spot"))).perform();

        Alert alert = driver.switchTo().alert();
        assertEquals("You selected a context menu", alert.getText());
        alert.accept();
    }

}
