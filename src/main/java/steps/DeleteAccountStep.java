package steps;

import Page.DeleteAccountPage;

public class DeleteAccountStep {
    // Method to click on the delete account button

    public void deleteAccount() {
        DeleteAccountPage page = new DeleteAccountPage();
        page.clickDeleteAccount();
    }
}
