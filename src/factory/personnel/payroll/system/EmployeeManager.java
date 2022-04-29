package factory.personnel.payroll.system;

import SQLDataBase.DbManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author AFSAR
 */
public class EmployeeManager extends PersonManager{
    @Override
    public double totalSalaryPaid() {
        dbManager = new DbManager();
        double total = 0;
        try {    
             ArrayList<Employee> employees = dbManager.selectDemo();
             for (Employee employee: employees) {
                    total += employee.getSalary();
                }
            }catch (SQLException ex) {}
        return total;
    }
}
