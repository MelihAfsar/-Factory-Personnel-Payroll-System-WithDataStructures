package SQLDataBase;

import factory.personnel.payroll.system.Employee;
import factory.personnel.payroll.system.Management;
import factory.personnel.payroll.system.ManagementManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*@author AFSAR*/
public class DbManagerManagement {
    public ArrayList<Management> selectDemo() throws SQLException {
        DbHelperManagement helper = new DbHelperManagement();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Management> managements = null;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select id,name,surname,age"
                    + ",eMail,department,address,userName,userPassword from personnelmanagement.management");
            managements = new ArrayList<Management>();
            while (resultSet.next()) {
                managements.add(new Management(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getInt("age"),
                        resultSet.getString("eMail"),
                        resultSet.getString("department"),
                        resultSet.getString("address"),
                        resultSet.getString("userName"),
                        resultSet.getString("userPassword")));              
            }
            System.out.println(managements.size());
        } catch (SQLException exception) {
            helper.showErrorMassage(exception);
        } finally {
            connection.close();
            System.out.println("Connection closed.");
        }
        return managements;
    }
    
    public void updateData(int id,String name, String surname, String eMail,String department, String userName, String userPassword) throws SQLException {
        DbHelperManagement helper = new DbHelperManagement();
        Connection connection = null;
        PreparedStatement statement = null;;
        
        try {
            connection = helper.getConnection();
            String sql = "update personnelManagement.management set name = ?, surname = ?, eMail = ?, department = ?, userName = ? ,userPassword = ? where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, surname);
            statement.setString(3, eMail);
            statement.setString(4, department);
            statement.setString(5, userName);
            statement.setString(6, userPassword);
            statement.setInt(7, id);  
            int result = statement.executeUpdate();
            System.out.println("Management updated");
        } catch (SQLException exception) {
            helper.showErrorMassage(exception);
        } finally {
            statement.close();
            connection.close();
            System.out.println("Connection closed.");
        }
    }
}
