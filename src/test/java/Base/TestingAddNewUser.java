package Base;

import com.talentlms.UI.dataProvider.ConfigReader;
import com.talentlms.UI.dataProvider.MockDataGenerator;
import com.talentlms.UI.pages.AddNewUserPage;
import com.talentlms.UI.pages.LoginPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import steps.BaseTest;

public class TestingAddNewUser extends BaseTest {

    @Test
    public void tesest() {
        loginPage = new LoginPage();
        addNewUserPage = new AddNewUserPage();
        loginPage.login(ConfigReader.getProperty("qaEnv")).goToAddNewUserPage();
        String parentPage = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://youtu.be/n-jVNxIhY6M?t=40");
        driver.switchTo().window(parentPage);
        for (int i = 0; i < 100; i++) {
            addNewUserPage.inputFirstName(MockDataGenerator.generateMockFirstName())
                    .inputLastName(MockDataGenerator.generateMockLastName())
                    .inputPassword(MockDataGenerator.generateMockPassword())
                    .inputUserName(MockDataGenerator.generateMockUserName())
                    .inputEmailAddress(MockDataGenerator.generateMockEmail())
                    .inputBio(MockDataGenerator.generateMockBio());
        }
    }
}
