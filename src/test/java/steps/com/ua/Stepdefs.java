package steps.com.ua;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stepdefs {


   public WebDriver driver;





    @Before
    public void seUp(){
        System.setProperty("webdriver.driver.chrome","C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();

    }



    @Given("Navigate to www.sharelane.com")
    public void navigateToWwwSharelaneCom() {
        driver.get("http://www.sharelane.com/cgi-bin/main.py");
    }

    @When("You`ve been navigated to it click Sign-up")
    public void youVeBeenNavigatedToItClickSignUp() {
        WebElement signUp= driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));
                signUp.click();
    }

    @And("Enter ZIP code")
    public void enterZIPCode() throws Exception {
        WebElement zipcode = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        zipcode.sendKeys("55555");
        Thread.sleep(1000);
    }

    @And("Click Continue")
    public void click() {
        WebElement click = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        click.click();
    }


    @And("Enter First Name")
    public void enterFirstName() {
        WebElement firstname = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
        firstname.sendKeys("Nastya");


    }

    @And("Enter email")
    public void enterEmail() {
        WebElement email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        email.sendKeys("zvyagin.nastya3@gmail.com");

    }




    @And("Enter password")
    public void enterPassword() {
        WebElement password = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
        password.sendKeys("12345678");

    }

    @And("Enter confirm password")
    public void enterConfirmPassword() {
        WebElement confirmpassword = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        confirmpassword.sendKeys("12345678");

    }


    @Then ("Click Register")
            public void register () {
        WebElement register = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input"));
        register.click();
    }


    @When("You`ve been registered, click here")
    public void youVeBeenRegisteredClickUnderlinedHere() {
        WebElement regmessage = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));
        Assert.assertEquals("Account is created!",regmessage.getText());

        WebElement here = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td/p/a"));
        here.click();

    }

    @Then ("Enter email1")
    public void emaill () {

        WebElement emaill = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input"));
        emaill.sendKeys("zvyagin.nastya3@gmail.com");

    }

    @And("Enter password1")
    public void password() {
        WebElement password1 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input"));
        password1.sendKeys("12345678");

    }


    @And("Click Login")
    public void clickLogin() {
        WebElement login = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input"));
        login.click();


    }

    @Then("You`ve been signed in")
    public void youVeBeenSignedIn() {
        WebElement name = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[2]/span"));
    }


}
