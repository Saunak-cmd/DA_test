package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePageTest {

    @Test
    void shouldOpenGoogleHomepage() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.google.com");
            String title = driver.getTitle();
            assert title != null && !title.isEmpty();
        } finally {
            driver.quit(); // Ensure the browser is closed after the test
        }
    }
}