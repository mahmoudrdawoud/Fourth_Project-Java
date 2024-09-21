//  My name : Mahmoud Riyad Mahmoud Dawoud
//  ID : 1301200739


package school;

import java.io.Serializable;

public class Student implements Serializable{

    private int Id;
    private String Name;
    private int Level;

    public Student() {
        Id = 0;
        Name = "";
        Level = 0;

    }

    public Student(int Id, String Name, int Level) {
        this.Id = Id;
        this.Name = Name;
        this.Level = Level;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getLevel() {
        return Level;
    }

    @Override
    public String toString() {
        return "Student{" + "Id=" + Id + ", Name=" + Name + ", Level=" + Level + '}';
    }

    public Student(Student obj1) {
        this.Id = obj1.Id;
        this.Name = obj1.Name;
        this.Level = obj1.Level;

    }
}
//  My name : Mahmoud Riyad Mahmoud Dawoud
//  ID : 1301200739
