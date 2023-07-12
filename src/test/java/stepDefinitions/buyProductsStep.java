 package  stepDefinitions;

 import io.cucumber.java.en.*;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;




 public class buyProductsStep {
     WebDriver driver = null;
        @Given("que eu esteja na página de produtos")
        public void que_eu_esteja_na_página_de_produtos() {

            System.setProperty("webdriver.chrome.driver", "C:\\Projetos\\ProjetoMeta\\Meta\\src\\test\\java\\drivers\\chromedriver.exe");
            WebDriver navegador  = new ChromeDriver();
            navegador.get("https://automationexercise.com/login");
            driver.findElement(By.name("email")).sendKeys("fabiana.silva@gmail.com");
            driver.findElement(By.name("password")).sendKeys("teste@469");
            driver.findElement(By.className("btn btn-default")).click();

        }

        @When("adiciono três produtos ao carrinho sendo um deles com duas unidades")
        public void adiciono_três_produtos_ao_carrinho_sendo_um_deles_com_duas_unidades() {

        }

        @When("removo uma quantidade desse produto que contém duas")
        public void removo_uma_quantidade_desse_produto_que_contém_duas() {

        }

        @Then("deve ser possível realizar a compra de três produtos com  sucesso.")
        public void deve_ser_possível_realizar_a_compra_de_três_produtos_com_sucesso() {

        }






    }