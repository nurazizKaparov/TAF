package steps;

import com.talentlms.UI.dataProvider.ConfigReader;
import com.talentlms.UI.helpers.Helper;
import com.talentlms.UI.pages.AdminHomePage;
import com.talentlms.UI.pages.LoginPage;
import com.talentlms.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class LoginSteps extends BaseTest{



    @Given("Go to login page")
    public void go_to_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("qaEnv"));


    }
    @Given("Enter {string} in UserName or Email input field")
    public void enter_in_user_name_or_email_input_field(String UserNameOrEmail) {
        loginPage.inputUserNameOrEmail((UserNameOrEmail));


    }
    @Given("Enter {string} in password input field")
    public void enter_in_password_input_field(String password) {
        loginPage.inputPassword(password);


    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        loginPage.clickLoginButton();


    }
    @Then("user should successfully logged in")
    public void user_should_successfully_logged_in() {
        Assertions.assertEquals("Home", helper.getText(adminHomePage.adminHomeTitle));

    }

}

