package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilkclass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        /*
        en temelhaliyle otomasyon yapmak icin classimiza otomasyon icin gerekli olan
        webdriverin yerini gostermnemiz gerekir. Bunun icin java kutuphanesinden System.setProperty()
        metodunun icine ilk olarak driveri yazariz.ikinci olarak driverin fiziki yolunu kopyalariz.

         */
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");



    }
}
