package Seleniumfirsttry;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

  static    WebDriver driver =  new ChromeDriver();
    public static void main(String[] args){
        driver.get("https://www.wikipedia.com/");
        driver.manage().window().maximize();

        int iterations =100;

        long totalId = 0, totalCss = 0, totalXpath = 0;
        long start; // Declare start variable
        for (int i =0; i <iterations; i++){
            driver.navigate().refresh();
            long startId = System.currentTimeMillis();
            driver.findElement(By.id("js-link-box-en"));
            totalId += (System.currentTimeMillis() - startId); // Fix assignment

            driver.navigate().refresh();

            start = System.currentTimeMillis();
            driver.findElement(By.cssSelector("#js-link-box-en"));
            totalCss += (System.currentTimeMillis() - start);

            driver.navigate().refresh();
            start = System.currentTimeMillis();
            driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]"));
            totalXpath += (System.currentTimeMillis() - start);
        }
        System.out.println("average id time: " + (totalId/iterations));
        System.out.println("average css time: " + (totalCss/iterations));
        System.out.println("average xpath time: " + (totalXpath/iterations));
        driver.quit(); // Ensure browser is closed
        driver.close();
    }

}
