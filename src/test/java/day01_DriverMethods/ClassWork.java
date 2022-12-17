package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// bos bir browser actik


        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitel = driver.getTitle();
        if (actualTitel.contains("Amazon")) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title testi FAILED");
        }

        //Sayfa adresini(url) yazdirin
        System.out.println("sayfa Urli " + driver.getCurrentUrl());

        //Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        if (actualTitel.contains("Amazon")) {
            System.out.println("Url testi PASSED");
        } else {
            System.out.println("Url testi FAILED");
        }
        //Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfaKodlari = driver.getPageSource();
        if (sayfaKodlari.contains("Gateway")) {
            System.out.println("Source Code Test passed");

        } else {
            System.out.println("Source Code Test failed");
        }

        //Sayfayi kapatin.
        driver.close();//sayfayi kapatmak icin close() metodu kullanilir


    }

}
