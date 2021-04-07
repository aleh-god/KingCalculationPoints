package KingCalculationPoints.AppModels;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Component
public class LoginModel {

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String emailForLogin;

    private String userName;

    public LoginModel() {

    }

    public LoginModel(String emailForLogin) {
        this.emailForLogin = emailForLogin;
    }

    public String getEmailForLogin() {
        return emailForLogin;
    }

    public void setEmailForLogin(String emailForLogin) {
        this.emailForLogin = emailForLogin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
