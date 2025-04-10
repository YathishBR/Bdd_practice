package StepDefinitions;
	
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
  WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://archive174.estuate.com:3050/login");
	}

	@When("User enters valid username and password")
	public void userenters_valid_username_and_password() {
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.id("psswrd")).sendKeys("Admin@123");
	    
	}

	@And("clicks n Login Button")
	public void clicks_n_login_button() {
	 driver.findElement(By.className("submit-btn cds--btn cds--btn--primary")).click();
	    
	}

	@Then("user is navigated to Home page")
	public void user_is_navigated_to_home_page() {
	 String expectedText= driver.findElement(By.linkText("Archive Viewer")).getText();
	 System.out.println(expectedText);
	  
	}

	@And("close the browser")
	public void close_the_browser() {
	   driver.close();
	}
}
