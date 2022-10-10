package com.talentlms.UI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUserPage extends BasePage {
    @FindBy(xpath = "//input[@name='name']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//input[@name='surname']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInputField;
    @FindBy(xpath = "//input[@name='login']")
    private WebElement loginInputField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement bioInputField;
    @FindBy(xpath = "(//a[@href=\"https://aidar.talentlms.com/user/create\"])[2]")
    private WebElement addNewUserButton;

    public AddNewUserPage inputFirstName(String firstName) {
        helper.sendKeys(firstNameInputField, firstName);
        return this;
    }

    public AddNewUserPage inputLastName(String lastName) {
        helper.sendKeysWithClear(lastNameInputField, lastName);
        return this;
    }

    public AddNewUserPage inputEmailAddress(String email) {
        helper.sendKeysWithClear(emailInputField, email);
        return this;
    }

    public AddNewUserPage inputUserName(String username) {
        helper.sendKeysWithClear(loginInputField, username);
        return this;
    }

    public AddNewUserPage inputPassword(String password) {
        helper.sendKeysWithClear(passwordInputField, password);
        return this;
    }

    public AddNewUserPage inputBio(String bio) {
        helper.sendKeysWithClear(bioInputField, bio);
        return this;
    }

    public AddNewUserPage goToAddNewUserPage() {
        helper.click(addNewUserButton);
        return this;
    }
}
