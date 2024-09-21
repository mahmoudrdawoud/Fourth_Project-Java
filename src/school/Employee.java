//  My name : Mahmoud Riyad Mahmoud Dawoud
//  ID : 1301200739


package school;

import java.io.Serializable;

public abstract class Employee implements Serializable {

    String Name;
    int Id;
    String Address;
    int PhoneNumber;
    String Email;
    double BasicSalary;
    double LiveExpensive;

    public Employee() {
        Name = "";
        Id = 0;
        Address = "";
        PhoneNumber = 0;
        Email = "";
        BasicSalary = 0.0;
        LiveExpensive = 0.1*BasicSalary;
    }

    public Employee(String Name, int Id, String Address, int PhoneNumber, String Email, double BasicSalary, double LiveExpensive) {
        this.Name = Name;
        this.Id = Id;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.BasicSalary = BasicSalary;
        this.LiveExpensive = 0.1*BasicSalary;
    }

    
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setBasicSalary(double BasicSalary) {
        this.BasicSalary = BasicSalary;
    }

    public void setLiveExpensive(double LiveExpensive) {
        this.LiveExpensive = LiveExpensive;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }

    public String getAddress() {
        return Address;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public double getBasicSalary() {
        return  BasicSalary;
    }
    public abstract double getSalary();


    public double getLiveExpensive() {
        return LiveExpensive  ;

    }


    @Override
    public String toString() {
        return "Employee{" + "Name=" + Name + ", Id=" + Id + ", Address=" + Address + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email + ", BasicSalary=" + BasicSalary + ", LiveExpensive=" + LiveExpensive + '}';
    }

}
//  My name : Mahmoud Riyad Mahmoud Dawoud
//  ID : 1301200739
