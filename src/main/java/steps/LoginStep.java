package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverProvider;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import pages.Pages;
import static com.codeborne.selenide.Condition.visible;

public class LoginStep implements Pages {

    @Step("Авторизация")
    public void login(String userName, String password){
        LOGIN_PAGE.inputUserName.setValue(userName);
        LOGIN_PAGE.inputUserPassword.setValue(password);
        LOGIN_PAGE.buttonLogin.click();
    }

    @Step("Подтверждение авторизации")
    public void authorizationConfirmation(String code){
        LOGIN_PAGE.inputConfirmationCode.setValue(code);
        LOGIN_PAGE.buttonLogin.click();
    }

    @Step("Проверка перехода на страницу подтверждения")
    public void checkTransitionWindowConfirm(){
        LOGIN_PAGE.inputConfirmationCode.shouldBe(visible);
    }

    @Step("Проверка перехода на главную страницу")
    public void checkTransitionMAinPage(){
        WebDriverRunner.url().equals("https://idemo.bspb.ru/welcome");
    }
}
