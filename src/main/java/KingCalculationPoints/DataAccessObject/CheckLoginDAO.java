package KingCalculationPoints.DataAccessObject;

import KingCalculationPoints.AppModels.LoginModel;
import KingCalculationPoints.AppModels.SetPlayersModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;

@Component
public class CheckLoginDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired // Иньекция из JavaConfig для подключению к SQL
    public CheckLoginDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean checkLoginInDataBase(LoginModel loginModel) {
        boolean checkLogin = false;

        String emailUser = loginModel.getEmailForLogin();

        int result = jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM R_users WHERE EmailUser LIKE ?",
                new Object[]{emailUser},
                Integer.class);

        if (result > 0) checkLogin = true;
        System.out.println("result=" + result);
        System.out.println("checkLogin=" + checkLogin);

        return checkLogin;
    }

    public void setNameVerifiedUserFromDataBaseInModel(LoginModel loginModel) {

        // SELECT nameuser FROM R_users WHERE EmailUser='Xan@gmail.com';
        String emailUser = loginModel.getEmailForLogin();

        String result = jdbcTemplate.queryForObject(
                "SELECT nameuser FROM R_users WHERE EmailUser LIKE ?",
                new Object[]{emailUser},
                String.class);

        System.out.println("result.setUserName=" + result);
        loginModel.setUserName(result);

    }

}
