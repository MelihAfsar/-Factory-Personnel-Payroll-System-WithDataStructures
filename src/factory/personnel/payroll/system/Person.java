package factory.personnel.payroll.system;
/* @author AFSAR */
public class Person {
    private int id;
    private String name;
    private String surname;
    private String gender;
    private int age;
    private String eMail;
    private String department;
    private String address;

    public Person(){
        
    }
    
    public Person(int id, String name, String surname,String gender, int age, String eMail,String department,String address){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.eMail = eMail;
        this.department = department;
        this.address = address;
    }
    
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String geteMail() {return eMail;}
    public void seteMail(String eMail) {this.eMail = eMail;}

    public String getDepartment() {return department;}
    public void setDepartment(String department) {this.department = department;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}
}
