package co.com.reto_siigo_automation.certificacion.testUnit;

import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static WebDriver driver;

    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acaraballo\\Documents\\retos\\automation_siigo\\co.com.siigo_automation.certificacion\\src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qastaging.siigo.com/#/login");

        Thread.sleep(30000);
        WebElement usuario = driver.findElement(ByShadow.cssSelector("#username-input", "#username"));
        WebElement clave = driver.findElement(ByShadow.cssSelector("#password-input","#current-password"));
        WebElement btn_loggin = driver.findElement(By.id("login-submit"));

        usuario.sendKeys("admin@siigoautomationqa.com");
        clave.sendKeys("$22g0QA321");
        btn_loggin.click();

        //This Element is inside 2 nested shadow DOM.
        Thread.sleep(30000);
        SearchContext shadow0 = driver.findElement(By.cssSelector(".data-siigo-five9.hydrated")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("siigo-button-atom[type='button'][class='hydrated'][color='primary-green']")).getShadowRoot();
        Thread.sleep(1000);
        shadow1.findElement(By.cssSelector(".btn-element.size-m")).click();
        Thread.sleep(5000);

        //This Element is inside single shadow DOM.
        Thread.sleep(1000);
        SearchContext shadow = driver.findElement(By.cssSelector(".data-siigo-five9.hydrated")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector(" div:nth-child(1) > header:nth-child(3) > nav:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(5) > siigo-header-create-button-dropdown:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > li:nth-child(2) > div:nth-child(1) > a:nth-child(2)")).click();

    }
}
