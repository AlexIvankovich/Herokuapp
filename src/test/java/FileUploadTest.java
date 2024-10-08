import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.nio.file.Paths;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload() {
        String filePath = Paths.get("src/test/resources/testfile.txt").toAbsolutePath().toString();
        driver.findElement(By.id("file-upload")).sendKeys(filePath);
        driver.findElement(By.id("file-submit")).click();

        WebElement uploadedFile = driver.findElement(By.id("uploaded-files"));
        assertEquals("testfile.txt", uploadedFile.getText());
    }

}
