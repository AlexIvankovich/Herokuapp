import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void firsttest() {
        driver.get("https://www.onliner.by/");
    }
}