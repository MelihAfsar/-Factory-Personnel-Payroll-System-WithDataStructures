package SQLDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*@author AFSAR*/
public class DbHelperNotes {
    private String userName = "root";
    private String userPassword = "12345";
    private String dbUrl = "jdbc:mysql://localhost:3306/factorynotes";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,userPassword);
    }

    public void showErrorMassage(SQLException exception){
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error code: " + exception.getErrorCode());
    }
}
