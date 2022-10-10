package steps;

import com.talentlms.UI.helpers.Helper;
import com.talentlms.UI.pages.AdminHomePage;
import com.talentlms.UI.pages.LoginPage;

public abstract class BaseTest {

   protected LoginPage loginPage = new LoginPage();
   protected Helper helper = new Helper();
   protected AdminHomePage adminHomePage = new AdminHomePage();
}
