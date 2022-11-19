import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SteamCartTest {
    private WebDriver webDriver;
    private String url;

    @Before
    public void setUp() {
        webDriver = new ChromeDriver();
        url = "https://store.steampowered.com/";
    }

    @Test
    public void productPresentInCartAfterAdditionToCart() {
        webDriver.get(url);
        webDriver.findElement(By.id("store_nav_search_term")).sendKeys("spiderman");
        webDriver.findElement(By.id("store_nav_search_term")).sendKeys(Keys.RETURN);
        webDriver.findElement(By.xpath("//*[@id=\"search_resultsRows\"]/a[1]")).click();
        webDriver.findElement(By.id("btn_add_to_cart_653430")).click();
        Assert.assertTrue(webDriver.findElement(By.xpath("//a[contains(@href,'https://store.steampowered.com/app/1817190?snr=1_8_4__501')]"))
                .isDisplayed());
    }

    @After
    public void quit() {
        webDriver.quit();
    }
}
