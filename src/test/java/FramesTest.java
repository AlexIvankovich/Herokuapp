import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTest {

    @Test
    public void testIFrameContent() {
        driver.get("https://the-internet.herokuapp.com/frames");

        driver.findElement(By.linkText("iFrame")).click();

        driver.switchTo().frame("mce_0_ifr");

        WebElement paragraph = driver.findElement(By.xpath("//body/p"));

        assertEquals("Your content goes here.", paragraph.getText());

        driver.switchTo().defaultContent();
    }

}
