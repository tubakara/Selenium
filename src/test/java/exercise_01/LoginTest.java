package exercise_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
//doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://youtube.com");
        String actualTitle=driver.getTitle();
        String expectedTitle="youtube";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("title test passed");
        }else System.out.println(actualTitle);

//3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
//doğru URL'yi yazdırın.
        String actualUrl=driver.getCurrentUrl();
        if(actualUrl.contains("youtube")){
            System.out.println(actualUrl);
        }
//4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//5. Youtube sayfasina geri donun
        driver.navigate().back();
//6. Sayfayi yenileyin
        driver.navigate().refresh();
//7. Amazon sayfasina donun
        driver.navigate().back();
//8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
//9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,

        String currentTitle=driver.getTitle();
       if(currentTitle.contains("Amazon")) {
           System.out.println("title contains amazon");

       }else System.out.println("title does not contains amazon");
//Yoksa doğru başlığı(Actual Title) yazdırın.
//10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
//URL'yi yazdırın
//11.Sayfayi kapatin
    }
}
