import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;

public class LoginToPjatkTest {
    private WebDriver webDriver;
    private String url;

    @Before
    public void setUp() {
        webDriver = new ChromeDriver();
        url = "https://store.steampowered.com/";
    }

    @Test
    public void productPresentInCartAfterAdditionToCart() {
        webDriver.get("https://planzajec.pjwstk.edu.pl/Logowanie.aspx");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        webDriver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Login1_UserName\"]"));
        webDriver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Login1_UserName\"]")).sendKeys("test");
        webDriver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Login1_Password\"]"));
        webDriver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Login1_Password\"]")).sendKeys("test1");
        webDriver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Login1_LoginButton\"]")).click();
        String error = webDriver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Login1\"]/tbody/tr/td/table/tbody/tr[4]/td")).getText();

        Assert.assertThat("Błędny login lub hasło. Spróbuj ponownie.", is(error));
        Assert.assertThat("https://planzajec.pjwstk.edu.pl/Logowanie.aspx", is(webDriver.getCurrentUrl()));
    }

    @After
    public void quit() {
        webDriver.quit();
    }
}
