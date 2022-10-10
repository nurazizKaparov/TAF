package com.talentlms.UI.pages;

import com.talentlms.UI.helpers.Helper;
import com.talentlms.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {





    @FindBy(xpath = "//input[@name='login']")
    public WebElement userNameOrEmailInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement loginButton;

    public LoginPage inputUserNameOrEmail(String userNameOrEmail) {
        helper.sendKeys(userNameOrEmailInput, userNameOrEmail);
        return this;
    }

    public LoginPage inputPassword(String password) {
        helper.sendKeys(passwordInput, password);
        return this;
    }

    public LoginPage clickLoginButton() {
        helper.click(loginButton);
        return this;
    }

}
