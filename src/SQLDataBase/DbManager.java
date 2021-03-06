package SQLDataBase;

import DataStructures.EmployeeLinkedList;
import factory.personnel.payroll.system.Employee;
import factory.personnel.payroll.system.EmployeeManager;
import factory.personnel.payroll.system.ManagementManager;
import factory.personnel.payroll.system.PersonManager;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

/**
 * @author MELIH AFSAR
 * This class performs database operations.
 */
public class DbManager {
    /**
     * This method deletes the information whose id is given from the database.
     * @throws SQLException
     */
    public void deleteDemo(int id)throws SQLException{
        DbHelperEmployee helper = new DbHelperEmployee();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql = "delete from factoryPersonnelPayrollSystem.employee where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            int result = statement.executeUpdate();
            System.out.println("Personnel deleted.");
        } catch (SQLException exception) {
            helper.showErrorMassage(exception);
        } finally {
            statement.close();
            connection.close();
            System.out.println("Connection closed.");
        }
    }
    
    
    /**
     * 
     * This method fetches information from the database.
     * @throws SQLException
     * @return EmployeeLinkedList 
     */
    public EmployeeLinkedList selectDemo() throws SQLException {
        DbHelperEmployee helper = new DbHelperEmployee();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        EmployeeLinkedList linkedList = null;
        //Linkedlist data structure
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select id,name,surname,gender,age"
                    + ",eMail,department,address,salary,grossSalary,tax,hourlyWage,workingHours from employee");
            linkedList = new EmployeeLinkedList();
            while (resultSet.next()) {
                linkedList.add(new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("gender"),
                        resultSet.getInt("age"),
                        resultSet.getString("eMail"),
                        resultSet.getString("department"),
                        resultSet.getString("address"),
                        resultSet.getDouble("salary"),
                        resultSet.getDouble("grossSalary"),
                        resultSet.getDouble("tax"),
                        resultSet.getDouble("hourlyWage"),
                        resultSet.getInt("workingHours")));                       
            }
        } catch (SQLException exception) {
            helper.showErrorMassage(exception);
        } finally {
            connection.close();
            System.out.println("Connection closed.");
        }
        return linkedList;
    }
    
    /**
     * @author Kenan Baylan
     * This method keeps database id information in arraylist
     * @throws SQLException 
     * @return ArrayList<Integer> 
     * 
     */
    public static ArrayList<Integer> selectId() throws SQLException{
        ArrayList list = new ArrayList();
        DbHelperEmployee helper = new DbHelperEmployee();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select id from employee");
            while (resultSet.next()) {
                 list.add(resultSet.getInt("id"));
            }
        } catch (SQLException exception) {
            helper.showErrorMassage(exception);
             
        } finally {
            connection.close();
            System.out.println("Connection closed.");
        }
        return list; 
        
    }
    
    
    /**
     *  This method adds information to the database.
     * @throws SQLException
     */

    public void insertData(int id,String name,String surname, String gender, int age, String eMail, String department, 
            String address, Double salary, Double grossSalary, Double tax, double hourlyWage, int workingHours) throws SQLException {
        DbHelperEmployee helper = new DbHelperEmployee();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql = "insert into factoryPersonnelPayrollSystem.employee(id,name,surname,gender,age"
                    + ",eMail,department,address,salary,grossSalary,tax,hourlyWage,workingHours) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            statement.setString(2,name);
            statement.setString(3,surname);
            statement.setString(4,gender);
            statement.setInt(5,age);
            statement.setString(6,eMail);
            statement.setString(7,department);
            statement.setString(8,address);
            statement.setDouble(9,salary);
            statement.setDouble(10,grossSalary);
            statement.setDouble(11,tax);
            statement.setDouble(12,hourlyWage);
            statement.setInt(13,workingHours);
            
            int result = statement.executeUpdate();
            System.out.println("Personnel added");
        } catch (SQLException exception) {
            System.out.println("You cannot add personnel with the same id !!!");
            helper.showErrorMassage(exception);
        } finally {
            statement.close();
            connection.close();
            System.out.println("Connection closed.");
        }
    }
    
    /**
     *  This method updates information to the database.
     * @throws SQLException
     */
 
    public void updateData(int id,String address, double hourlyWage, int workingHours, double tax) throws SQLException {
        DbHelperEmployee helper = new DbHelperEmployee();
        Connection connection = null;
        PreparedStatement statement = null;
        double grossSalary = ((hourlyWage * workingHours) + tax);
        double salary = 0;
        salary = PersonManager.salaryCalculator(hourlyWage,workingHours,tax);
        
        try {
            connection = helper.getConnection();
            String sql = "update factoryPersonnelPayrollSystem.employee set address = ?, hourlyWage = ?, workingHours = ? ,tax = ?, salary = ?, grossSalary = ? where id=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, address);
            statement.setDouble(2, hourlyWage);
            statement.setInt(3, workingHours);
            statement.setDouble(4, tax);
            statement.setDouble(5, salary);
            statement.setDouble(6, grossSalary);
            statement.setInt(7, id);
                    
            int result = statement.executeUpdate();
            System.out.println("Personnel updated");
        } catch (SQLException exception) {
            helper.showErrorMassage(exception);
        } finally {
            statement.close();
            connection.close();
            System.out.println("Connection closed.");
        }
    }
    
    /**
     * This method pulls the information given the id from the database.
     * @throws SQLException
     */
        public Employee getEmployee(int id) throws SQLException {
        DbHelperEmployee helper = new DbHelperEmployee();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        
        Employee temp;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select id,name,surname,gender,age"
                    + ",eMail,department,address,salary,grossSalary,tax,hourlyWage,workingHours from employee");
            
            while (resultSet.next()) {
                if(resultSet.getInt("id")==id){
                    temp = new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("gender"),
                        resultSet.getInt("age"),
                        resultSet.getString("eMail"),
                        resultSet.getString("department"),
                        resultSet.getString("address"),
                        resultSet.getDouble("salary"),
                        resultSet.getDouble("grossSalary"),
                        resultSet.getDouble("tax"),
                        resultSet.getDouble("hourlyWage"),
                        resultSet.getInt("workingHours"));  
                    return temp;
                }                    
            }
            
        } catch (SQLException exception) {
            helper.showErrorMassage(exception);
        } finally {
            connection.close();
            System.out.println("Connection closed.");
        }
        return null;
    }
}



