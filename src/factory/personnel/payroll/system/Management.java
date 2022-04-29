package factory.personnel.payroll.system;
/* @author AFSAR */
public class Management extends Person{
    private String userName;
    private String userPassword;
    
    public Management(){}
    
    public Management(int id,String name,String surname,int age,String eMail,String department,String address,String userName,String userPassword){
        super.setId(id);
        super.setName(name);
        super.setSurname(surname);
        super.setAge(age);
        super.seteMail(eMail);
        super.setDepartment(department);
        super.setAddress(address);
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}

    public String getUserPassword() {return userPassword;}
    public void setUserPassword(String userPassword) {this.userPassword = userPassword;}
}
