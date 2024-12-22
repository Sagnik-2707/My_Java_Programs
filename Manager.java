import java.util.*;
class Employee
{
    private int id;
    private String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void showDetails()
    {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
public class Manager 
{
        static private ArrayList<Employee> employees = new ArrayList<Employee>();
        public static void addEmployee()
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Enter the name of employee ");
                Scanner sc = new Scanner(System.in);
                String name = sc.nextLine();
                System.out.println("Enter the id of employee ");
                int id = sc.nextInt();
                Employee e = new Employee(id, name);
                System.out.println("Employee added successfully");
                employees.add(e);
            }
        }
        public static void displayEmployees()
        {
            System.out.println("Employee Details:");
            for(Employee e : employees)
            {
                e.showDetails();
            }
        }
        public static void main(String[] args)
        {
            addEmployee();
            displayEmployees();
        }
}
