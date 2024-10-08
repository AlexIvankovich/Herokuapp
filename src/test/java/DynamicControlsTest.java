import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

import static org.testng.Assert.*;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void testDynamicControls() {
        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        WebElement message = driver.findElement(By.id("message"));
        assertTrue(message.isDisplayed());
        assertEquals("It’s gone!", message.getText());

        assertFalse(isElementPresent(By.id("checkbox")));

        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        assertFalse(input.isEnabled());

        driver.findElement(By.xpath("//button[text()='Enable']")).click();
        WebElement enableMessage = driver.findElement(By.id("message"));
        assertTrue(enableMessage.isDisplayed());
        assertEquals("It's enabled!", enableMessage.getText());
        assertTrue(input.isEnabled());
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
