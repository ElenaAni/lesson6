package features.login;

import Pages.LoginPage;
import base.BaseUITest;
import org.junit.jupiter.api.Test;

import static common.Configuration.*;

public class PositiveLoginTest extends BaseUITest {

    @Test
    public void loginWithBaseUserTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .checkUrl(BASE_URL);
    }
}
