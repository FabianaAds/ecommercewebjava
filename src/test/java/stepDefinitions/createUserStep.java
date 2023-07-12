 package  stepDefinitions;


 import io.cucumber.java.en.*;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;


 public  class createUserStep {
     WebDriver driver = null;



     @Given("que eu esteja na página de login")
     public void que_eu_esteja_na_página_de_login() {
         System.setProperty("webdriver.chrome.driver", "C:\\Projetos\\ProjetoMeta\\Meta\\src\\test\\java\\drivers\\chromedriver.exe");
         WebDriver navegador  = new ChromeDriver();
         navegador.get("https://automationexercise.com/");

     }

     @When("preencho as informações necessárias para cadastrar um novo usuário em {string}")
     public void preencho_as_informações_necessárias_para_cadastrar_um_novo_usuário_em(String string) {

             System.setProperty("webdriver.chrome.driver", "C:\\Projetos\\ProjetoMeta\\Meta\\src\\test\\java\\drivers\\chromedriver.exe");
              WebDriver navegador  = new ChromeDriver();
              navegador.get("https://automationexercise.com/login");
              driver.findElement(By.name("name")).sendKeys("Fabiana");



     }

     @Then("deve ser possível  realizar o cadastro do usuário na plataforma com sucesso")
     public void deve_ser_possível_realizar_o_cadastro_do_usuário_na_plataforma_com_sucesso() {

     }











 }
