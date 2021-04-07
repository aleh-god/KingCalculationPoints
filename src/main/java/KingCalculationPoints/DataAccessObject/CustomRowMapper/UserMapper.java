package KingCalculationPoints.DataAccessObject.CustomRowMapper;

import KingCalculationPoints.AppModels.Entities.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {

        User user = new User();

        user.setId(resultSet.getInt("idUser"));
        user.setEmail(resultSet.getString("EmailUser"));
        user.setName(resultSet.getString("NameUser"));

        return user;
    }
}
