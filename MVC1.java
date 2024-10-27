import java.util.*;
class Student
{
    private String name;
    private int rollNo;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setRoll(int rollNo)
    {
        this.rollNo = rollNo;
    }
    public int getRollNo()
    {
        return rollNo;
    }
} 
    
class StudentView
{
    public void printDetails(String name, int rollNo)
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollNo);
    }
}    
class StudentController
{
    private Student model;
    private StudentView view;
    StudentController(Student model, StudentView view)
    {
        this.model = model;
        this.view = view;
    }
    public String getStudentName()
    {
        return model.getName();
    }
    public void setStudentName(String name)
    {
        model.setName(name);
    }
    public int getStudentRollNo()
    {
        return model.getRollNo();
    }
    public void setStudentRollNo(int rollNo)
    {
        model.setRoll(rollNo);
    }
    public void updateDetails()
    {
        view.printDetails(model.getName(), model.getRollNo());
    }
}    

public class MVC1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's name: ");
        String name = sc.nextLine();
        System.out.println("Enter roll number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        Student model = retrieveStudentData(name,rollNo);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateDetails();
        
        System.out.println("Enter updated name: ");
        String newName = sc.nextLine();
        controller.setStudentName(newName);
        controller.updateDetails();
    }
    public static Student retrieveStudentData(String name, int rollNo)
    {
        Student s1 = new Student();
        s1.setName(name);
        s1.setRoll(rollNo);
        return (s1);
    }
}
