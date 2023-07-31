import org.openqa.selenium.devtools.v108.fetch.model.AuthChallengeResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.*;

public class TestClassName {
    private steps.CreateUserStep createUserStep;
    private steps.LoginPageStep loginPageStep;
    private steps.DeleteAccountStep deleteAccountStep;
    private steps.ErrorValidationStep errorValidationStep;
    private steps.ApiValidationStep apiValidationStep;
    private Models.Response.UserResponse userResponse;

    @BeforeClass
    public void setUp() {
        createUserStep = new CreateUserStep();
        loginPageStep = new LoginPageStep();
        deleteAccountStep = new DeleteAccountStep();
        errorValidationStep = new ErrorValidationStep();
        apiValidationStep = new ApiValidationStep();
    }

    @Test(priority = 1)
    public void testCreateUser() {
        userResponse = createUserStep.createUser();
    }

    @Test(priority = 2)
    public void testLoginWithNewUser() {
        loginPageStep.login(userResponse);
    }

    @Test(priority = 3)
    public void testDeleteAccount() {
        deleteAccountStep.deleteAccount();
    }

    @Test(priority = 4)
    public void testErrorValidation() {
        errorValidationStep.validateErrorMessage("Invalid username or password!");
    }

    @Test(priority = 5)
    public void testApiValidation() {
        apiValidationStep.validateErrorResponse(userResponse, "User not found!");
    }
}
