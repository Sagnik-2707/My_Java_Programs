/* Implementation of composition */
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

/** Department objects are created and stored within the School object. **/
/** Department objects can be accessed only from College object **/
/** Department objects will disappear once the College object is deleted  **/
class School {
    private String name;
    private Department[] departments;

    public School(String name, int numDepartments) {
        this.name = name;
        departments = new Department[numDepartments];
    }

    public void createDepartment(int index, String departmentName) {
        departments[index] = new Department(departmentName);
    }

    public void displayDepartments() {
        for (Department department : departments) {
            System.out.println(department.getName());
        }
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        School School = new School("XYZ School", 3);
        School.createDepartment(0, "Computer Science");
        School.createDepartment(1, "Mathematics");
		School.createDepartment(2, "Science");
        
        School.displayDepartments();
    }
}
