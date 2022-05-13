package factory.personnel.payroll.system;

import DataStructures.EmployeeLinkedList;
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
            //Linkedlist
            EmployeeLinkedList linkedList = dbManager.selectDemo();
            Employee temp = linkedList.getHeadNode();
            while(temp != null){
                total += temp.getSalary();
                temp = temp.next;
            }              
       }catch (SQLException ex) {}
        return total;
    }
}
