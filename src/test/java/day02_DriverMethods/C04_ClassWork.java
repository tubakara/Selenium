package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C04_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucYazisi = driver.findElements(By.className("sg-col-inner"));
        String sonuc=aramaSonucYazisi.get(0).getText();

        //arama sonuc sayisini konsola yazdir:
        String []sonucSayisi=sonuc.split(" ");
        System.out.println(sonucSayisi[2]);//128 verir

        //sonuc sayisini lambda ile yazdirin
        Arrays.stream(aramaSonucYazisi.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);

        //karsimiza cikan ilk resme tikla

        List<WebElement>ilkWebElement=driver.findElements(By.className("s-image"));
        ilkWebElement.get(0).click();//list e atadigimiz icin get metodunu kullanabiliriz


        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramasonuclari = driver.findElements(By.className("sg-col-inner"));

      String aramaSonucu = aramasonuclari.get(0).getText();
        System.out.println(aramaSonucu);

        String[] aramaSonucArr = aramaSonucu.split(" ");
        System.out.println("aramaSonucArr[2] = " + aramaSonucArr[2]);
        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> firstImg = driver.findElements(By.className("s-image"));
        firstImg.get(0).click();
        //sayfayi kapatin
        driver.close();


    }
}
