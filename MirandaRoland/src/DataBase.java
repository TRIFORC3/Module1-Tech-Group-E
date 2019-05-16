import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private Statement statement;
    private Connection connection;
    private ResultSet resultSet;
    private Ref ref;

   /* private static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }
    */

    private void connectDB() {
        String ip = "10.31.3.121";
        String port = "3306";
        String database = "default";
        String user = "root";
        String password = "0123456";

        /*
         The following is a syntax of a MySQL connection string:
            jdbc:mysql://[host1][:port1][,[host2][:port2]]...[/[database]]
            [?propertyName1=propertyValue1[&propertyName2=propertyValue2]...]
         */

        connection = null;
        String url = "jdbc:mysql://" + ip + ":" + port + "/" + database + "?useSSL=false&user=" + user + "&password=" + password + "&serverTimezone=UTC";
        try {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            closeDBConnection();
        }
    }
        pricate void closeDBConnection () {
            //working on it
        }

    }

