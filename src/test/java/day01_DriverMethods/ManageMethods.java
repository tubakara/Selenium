package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");
        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("sayfanin konumu: " +driver.manage().window().getPosition());
        System.out.println("sayfanin boyutlari: "+driver.manage().window().getSize());
        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Sayfanin konumunu ve boyutlarini maximize durumunda
        System.out.println("sayfanin konumu: " +driver.manage().window().getPosition());
        System.out.println("sayfanin boyutlari: "+driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("sayfanin konumu: " +driver.manage().window().getPosition());
        System.out.println("sayfanin boyutlari: "+driver.manage().window().getSize());
        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
