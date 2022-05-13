package factory.personnel.payroll.system;
/*@author AFSAR */
public class Employee extends Person{
    private double salary;
    private double grossSalary;
    private double tax;
    private double hourlyWage;
    private int workingHours;
    public Employee next; //Linked list node.next
    
    public Employee(){}
    
    public Employee(int id,String name,String surname,String gender,int age,String eMail,String department,String address,double salary,double grossSalary,double tax,double hourlyWage,int workingHours){
        super.setId(id);
        super.setName(name);
        super.setSurname(surname);
        super.setGender(gender);
        super.setAge(age);
        super.seteMail(eMail);
        super.setDepartment(department);
        super.setAddress(address);
        this.salary = salary;
        this.grossSalary = grossSalary;
        this.tax = tax;
        this.hourlyWage = hourlyWage;
        this.workingHours = workingHours;
        this.next = null;
    }

    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}

    public double getGrossSalary() {return grossSalary;}
    public void setGrossSalary(double grossSalary) {this.grossSalary = grossSalary;}

    public double getTax() {return tax;}
    public void setTax(double tax) {this.tax = tax;}

    public double getHourlyWage() {return hourlyWage;}
    public void setHourlyWage(double hourlyWage) {this.hourlyWage = hourlyWage;}

    public int getWorkingHours() {return workingHours;}
    public void setWorkingHours(int workingHours) {this.workingHours = workingHours;}
}
