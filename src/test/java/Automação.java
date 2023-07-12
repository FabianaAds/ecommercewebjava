import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automação {


    @Test
     public  void AcessarEcommerce ()  {

          System.setProperty("webdriver.chrome.driver", "C:\\Projetos\\ProjetoMeta\\Meta\\src\\test\\java\\drivers\\chromedriver.exe");
           WebDriver navegador  = new ChromeDriver();
            navegador.get("https://automationexercise.com/");


    }



}
