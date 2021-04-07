package KingCalculationPoints.DataAccessObject;

import KingCalculationPoints.AppModels.SetPlayersModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyDataAccessObject {

    private final JdbcTemplate jdbcTemplate;

    @Autowired // Иньекция из JavaConfig для подключению к SQL
    public MyDataAccessObject(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void startPartyGame(SetPlayersModel setPlayersModel) {

        // SELECT idUser FROM R_users WHERE EmailUser='Xan@gmail.com';
        // int id = jdbcTemplate.queryForObject("SELECT idUser FROM R_users WHERE EmailUser=?", setPlayersModel.getEmailPlayerOne(), Integer.class);

        //jdbcTemplate.update("INSERT INTO J_PartyGames VALUES(?,?,?,?)", );
    }

    public void workWithSQL() {
    }
}
