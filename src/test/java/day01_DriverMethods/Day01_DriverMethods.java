package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// bos bir browser actik
        driver.get("https://www.amazon.com");// ilk olarak gitmek istedigimiz sayfayi belirtiriz
        String title=driver.getTitle();
        System.out.println(title);
        //2. yol
        System.out.println( driver.getTitle());

        System.out.println("sayfa Url`i " + driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle()); // Bize o window a ait hash degerini verir. Biz bu hash degerlerini
                                                      //bir stringe atayip pencereler arasi gecis yapabiliriz



    }
}
