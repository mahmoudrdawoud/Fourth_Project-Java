//  My name : Mahmoud Riyad Mahmoud Dawoud
//  ID : 1301200739


package school;

public class Principal extends Employee {

    private double PrincipalBonus;

    public Principal() {
        super();
        PrincipalBonus = 0.0;
    }

    public Principal(String Name, int Id, String Address, int PhoneNumber, String Email, double BasicSalary, double LiveExpensive, double PrincipalBonus) {
        super(Name, Id, Address, PhoneNumber, Email, BasicSalary, LiveExpensive);
        this.PrincipalBonus = PrincipalBonus;
    }

    public void setPrincipalBonus(double PrincipalBonus) {
        this.PrincipalBonus = PrincipalBonus;
    }

    @Override
    public double getSalary() {
        return this.getBasicSalary() + this.PrincipalBonus + this.getLiveExpensive();
    }

    public double getPrincipalBonus() {
        return PrincipalBonus;
    }
    
    

    public String toString() {
        return "Principal{" +  " name = " + Name+" BasicSalary = " + BasicSalary + " }";

    }
}
//  My name : Mahmoud Riyad Mahmoud Dawoud
//  ID : 1301200739
