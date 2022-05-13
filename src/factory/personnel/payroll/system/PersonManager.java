package factory.personnel.payroll.system;
import DataStructures.EmployeeLinkedList;
import SQLDataBase.DbManager;
import java.sql.SQLException;
/*@author AFSAR*/
public class PersonManager {
    DbManager dbManager;
    
    public int[] totalPersonnelCounter(){
        dbManager = new DbManager();
        int[] total = new int[3];
        int totalPersonnel = 0;
        int totalFemalePersonnel = 0;
        int totalMalePersonnel = 0;
        try { 
            EmployeeLinkedList linkedList = dbManager.selectDemo();
            Employee temp = linkedList.getHeadNode();
            while(temp != null){
                 if(temp.getGender().equals("female")){
                    totalFemalePersonnel +=1;
                    totalPersonnel +=1;
                 }
                 else{
                    totalMalePersonnel +=1;
                    totalPersonnel +=1;
                 }
            temp = temp.next; 
            }
        } catch (SQLException ex) {}
        total[0] = totalPersonnel;
        total[1] = totalFemalePersonnel;
        total[2] = totalMalePersonnel;
        return total;
    } 
    
    public double totalSalaryPaid(){
        System.out.println("totalSalaryPaid");
        return 0;
    }
    
    public static double salaryCalculator(double wageHourly, int hoursWorking, double salaryTax) {
        /*
        24.000 TL’ye kadar      15%
        53.000 TL               20%
        190.000 TL              27%
        650.000 TL              35%
        650.000 TL          	40%
        */
           
        double salary=0;
        salary = ((wageHourly * hoursWorking) + salaryTax);
        
        if(salary<0)
            salary = -1.0;
        else if(salary>=0 && salary<=24000.0)
            salary*=0.85;
        else if(salary>24000.0 && salary <=53000.0)
            salary*=0.8;
        else if(salary>53000.0 && salary <=190000.0)
            salary*=0.73;
        else if(salary>190000 && salary <=650000.0)
            salary*=0.65;
        else
            salary*=0.6;
        
        return salary;
    }
}
