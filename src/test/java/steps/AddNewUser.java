package steps;

import com.talentlms.UI.dataProvider.ConfigReader;
import com.talentlms.UI.dataProvider.MockDataGenerator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WindowType;


public class AddNewUser extends BaseTest {
    @Given("user on web")
    public void user_on_web() {
        loginPage.login(ConfigReader.getProperty("qaEnv"));
    }

    @When("user click on add User button")
    public void user_click_on_add_user_button() {
        addNewUserPage.goToAddNewUserPage();
    }

    @Then("user input fields")
    public void user_input_fields() {
        String parentPage = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://youtu.be/n-jVNxIhY6M?t=40");
        driver.switchTo().window(parentPage);
//        for (int i = 0; i < 20; i++) {
        addNewUserPage.inputFirstName(MockDataGenerator.generateMockFirstName())
                .inputLastName(MockDataGenerator.generateMockLastName())
                .inputPassword(MockDataGenerator.generateMockPassword())
                .inputUserName(MockDataGenerator.generateMockUserName())
                .inputEmailAddress(MockDataGenerator.generateMockEmail())
                .inputBio(MockDataGenerator.generateMockBio());
        driver.navigate().back();

//        }
    }


//    @Given("user on web")
//    public void user_on_web() {
//        loginPage.login(ConfigReader.getProperty("qaEnv"));
//    }
//
//    @Then("user should see home page")
//    public void user_should_see_home_page() {
//    }
//
//    @Then("user clicked Add user button to create new user")
//    public void user_clicked_add_user_button_to_create_new_user() {
//        loginPage.goToAddNewUserPage();
//    }
//
//    @Then("user should see input fields")
//    public void user_should_see_input_fields() {
//    }
//
//    @Then("user create new user with mock data using faker")
//    public void user_create_new_user_with_mock_data_using_faker() {
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.youtube.com/watch?v=n-jVNxIhY6M&t=38s");
//        for (int i = 0; i < 100; i++) {
//            addNewUserPage.inputFirstName(MockDataGenerator.generateMockFirstName())
//                    .inputLastName(MockDataGenerator.generateMockLastName())
//                    .inputPassword(MockDataGenerator.generateMockPassword())
//                    .inputUserName(MockDataGenerator.generateMockUserName())
//                    .inputEmailAddress(MockDataGenerator.generateMockEmail())
//                    .inputBio(MockDataGenerator.generateMockBio());
//        }
//    }
}
