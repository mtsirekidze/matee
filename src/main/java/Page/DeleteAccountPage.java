package Page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DeleteAccountPage extends Page.PageBase {
    // Page element

    private final SelenideElement deleteAccountButton = $("#deleteAccountButton");
    // Method to click on the delete account button

    public void clickDeleteAccount() {
        deleteAccountButton.click();
    }
}
