package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Steps{
	
	
WebDriver driver;	
	
	@Given("Abrir Chrome")
	public void abrir_chrome() {
		System.out.println("Se Abre Chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse2022\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8090/proyecto_web/index.html");	
	}
	
	@When("Ingresa Username {string} y Password {string}")
	public void ingresar_Username_y_Password(String string, String string2) {
		System.out.println("Se ingresan credenciales de usuario");
		driver.findElement(By.id(user)).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}	
	
	@Then("inicia_sesion")
	public void inicia_sesion() {
		System.out.println("Se inicia sesion con los datos ingresados en el archivo Mytest.features");
		driver.findElement(By.id("loginbtn")).click();
	}	
}