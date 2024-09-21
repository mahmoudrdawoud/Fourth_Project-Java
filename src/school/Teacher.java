//  My name : Mahmoud Riyad Mahmoud Dawoud
//  ID : 1301200739


package school;

import java.io.Serializable;

public class Teacher extends Employee implements Serializable  {

    private int ClassNo;

    public Teacher() {
        super();
        ClassNo = 0;

    }

    public Teacher(String Name, int Id, String Address, int PhoneNumber, String Email, double BasicSalary, double LiveExpensive, int ClassNo) {
        super(Name, Id, Address, PhoneNumber, Email, BasicSalary, LiveExpensive);
        this.ClassNo = ClassNo;
    }

    public void setClassNo(int ClassNo) {
        this.ClassNo = ClassNo;
    }

   
    @Override
    public double getSalary() {
        return this.getBasicSalary() + this.ClassNo * 20 + this.getLiveExpensive();
    }

    public int getClassNo() {
        return ClassNo;
    }

    public Teacher(Teacher obj) {
        super(obj.Name, obj.Id, obj.Address, obj.PhoneNumber, obj.Email, obj.BasicSalary, obj.LiveExpensive);
        this.ClassNo = obj.ClassNo;

    }

    @Override
    public String toString() {
        
        return "Teacher{name = "+Name+ " Id = " +Id +" Address = "+Address +" PhoneNumber ="+PhoneNumber+" Email ="+Email+" BasicSalary = "+BasicSalary+ " LiveExpensive = "+LiveExpensive+" }";
    
    }
}

//  My name : Mahmoud Riyad Mahmoud Dawoud
//  ID : 1301200739
   



