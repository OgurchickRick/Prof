import org.testng.annotations.Test;
import service.BaseTest;

public class LoginTests extends BaseTest {

    @Test(description = "Проверка авторизации с валидными данными")
    public void loginValid(){
        LOGIN_STEP.login("demo", "demo");
        LOGIN_STEP.checkTransitionWindowConfirm();
        LOGIN_STEP.authorizationConfirmation("0000");
        LOGIN_STEP.checkTransitionMAinPage();
    }
}
