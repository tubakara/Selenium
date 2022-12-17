package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");

        //techpro sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");
        Thread.sleep(3000);
        //Tekrar amazon sayfasina donelim
        driver.navigate().back();
        Thread.sleep(3000);//sayfanin acildigind beklemesini saglar ama exception firlatmaliyiz
        //tekrar techpro sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(3000);
        //son sayfada sayfayi yenileyelim
        driver.navigate().refresh();
        //ve sayfayi kapatalim
        driver.close();
    }
}
