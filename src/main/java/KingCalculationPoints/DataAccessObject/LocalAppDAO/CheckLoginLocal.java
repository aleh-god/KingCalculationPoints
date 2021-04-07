package KingCalculationPoints.DataAccessObject.LocalAppDAO;

import KingCalculationPoints.AppModels.LoginModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CheckLoginLocal {

    public void checkLoginInDataBase(LoginModel loginModel) {

        try{

            String url = "jdbc:postgresql://localhost:5432/kingcalcpointswebapp_db";
            String username = "postgres";
            String password = "postgresql";
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();

            try (Connection conn = DriverManager.getConnection(url, username, password)){

                Statement statement = conn.createStatement();
                String name = "test";

                ResultSet resultSet = statement.executeQuery("SELECT nameuser FROM R_users WHERE EmailUser='Xan@gmail.com';");

                if (resultSet.next()) {
                    System.out.println("have next");
                    name = resultSet.getString(1);
                    System.out.println("resultSet " + name);
                }
                else System.out.println("no have next");

                resultSet = statement.executeQuery("SELECT nameuser FROM R_users WHERE EmailUser='BadAdress@gmail.com';");

                if (resultSet.next()) {
                    System.out.println("have next");
                    name = resultSet.getString(1);
                    System.out.println("resultSet " + name);
                }
                else System.out.println("no have next");

            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }

    }
}
