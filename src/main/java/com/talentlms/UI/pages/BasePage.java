package com.talentlms.UI.pages;

import com.talentlms.UI.helpers.Helper;
import com.talentlms.UI.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage{

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    Helper helper = new Helper();
}
