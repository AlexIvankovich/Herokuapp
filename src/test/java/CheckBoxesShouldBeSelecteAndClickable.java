import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxesShouldBeSelecteAndClickable extends BaseTest {

    @Test
    public void сheckBoxesShouldBeSelecteAndClickable() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));

        assertFalse(checkboxes.get(0).isSelected());
        assertTrue(checkboxes.get(1).isSelected());

        checkboxes.get(0).click();
        checkboxes.get(1).click();

        driver.findElements(By.xpath("//input[@type = 'checkbox']"));

        assertTrue(checkboxes.get(0).isSelected());
        assertFalse(checkboxes.get(1).isSelected());
    }
}