//  My name : Mahmoud Riyad Mahmoud Dawoud
//  ID : 1301200739


package school;

import java.io.Serializable;

public class Subject implements Serializable {

    private String SubjectName;
    private Teacher Teacher;
    private Student Student;

    public Subject() {
        SubjectName = "";
        Teacher = Teacher;
        Student = Student;
    }

    public Subject(String SubjectName, Teacher Teacher, Student Student) {
        this.SubjectName = SubjectName;
        this.Teacher = Teacher;
        this.Student = Student;
    }

    public void setName(String Name) {
        this.SubjectName = SubjectName;
    }

    public void setTeacher(Teacher Teacher) {
        this.Teacher = Teacher;
    }

    public void setStudent(Student Student) {
        this.Student = Student;
    }

    public String getName() {
        return SubjectName;
    }

    public Teacher getTeacher() {
        return Teacher;
    }

    public Student getStudent() {
        return Student;
    }

    @Override
    public String toString() {
        return "Subject{" + "SubjectNAme = " + SubjectName + ", Teacher = " + Teacher + ", Student = " + Student + '}';
    }

}
//  My name : Mahmoud Riyad Mahmoud Dawoud
//  ID : 1301200739
