package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	WebDriver driver;
	String Expected_Eid="";
	String Actual_Eid ="";
	@Given("i want to launch url {string} in a browser")
	public void i_want_to_launch_url_in_a_browser(String url) {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(url);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("i enter username as {string} and enter password as {string}")
	public void i_enter_username_as_and_enter_password_as(String user, String pass) {
	   driver.findElement(By.name("txtUsername")).sendKeys(user);
	   driver.findElement(By.name("txtPassword")).sendKeys(pass);
	}

	@When("i click login button")
	public void i_click_login_button() throws Throwable {
	    driver.findElement(By.name("Submit")).click();
	    Thread.sleep(3000);
	}

	@Then("i validate url")
	public void i_validate_url() {
	    String Expected ="dashboard";
	    String Actual = driver.getCurrentUrl();
	    if(Actual.contains(Expected))
	    {
	    	System.out.println("Login Success    "+Expected+"---------"+Actual);
	    }
	    else
	    {
	    	System.out.println("Login UnSuccess    "+Expected+"---------"+Actual);
	    }
	}

	@When("i close browser")
	public void i_close_browser() {
	    driver.close();
	}

	@When("navigate to add employee page")
	public void navigate_to_add_employee_page() throws Throwable {
	    driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	}

	@When("i enter first name as {string}")
	public void i_enter_first_name_as(String fname) {
	   driver.findElement(By.name("firstName")) .sendKeys(fname);
	}

	@When("i enter middle name as {string}")
	public void i_enter_middle_name_as(String mname) {
	    driver.findElement(By.name("middleName")).sendKeys(mname);
	}

	@When("i enter last name as {string}")
	public void i_enter_last_name_as(String lname) {
	    driver.findElement(By.name("lastName")).sendKeys(lname);
	}

	@When("i capture emp id value")
	public void i_capture_emp_id_value() {
	    Expected_Eid = driver.findElement(By.name("employeeId")).getAttribute("value");
	}

	@When("i click save button")
	public void i_click_save_button() throws Throwable {
	    driver.findElement(By.id("btnSave")).click();
	    Thread.sleep(2000);
	}

	@When("i capture Employee id value")
	public void i_capture_Employee_id_value() {
	    Actual_Eid = driver.findElement(By.name("personal[txtEmployeeId]")).getAttribute("value");
	    if(Actual_Eid.equals(Expected_Eid))
	    {
	    	Reporter.log("Employee added Success  "+Expected_Eid+"--------"+Actual_Eid,true);
	    }
	    else
	    {
	    	Reporter.log("Employee added UnSuccess  "+Expected_Eid+"--------"+Actual_Eid,true);
	    }
	}
}
