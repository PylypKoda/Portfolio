public class  Employee {
    String name;
    String surname;
    String jobTitle;
    String salary;

    public Employee(String name_empl, String surname_empl) {
        name = name_empl;
        surname = surname_empl;
        jobTitle = "Engeneer";
        salary = "30000 RUB";
    }

    public Employee(String name_empl, String surname_empl, String jobTitle_empl, String salary_empl) {
        name = name_empl;
        surname = surname_empl;
        jobTitle = jobTitle_empl;
        salary = salary_empl;
    }

    public void updateName(String name_empl) {
        this.name = name_empl;
    }

    public void updateSurname(String surname_empl) {
        this.surname = surname_empl;
    }

    public void updateJobTitle(String jobTitle_empl) {
        this.jobTitle = jobTitle_empl;
    }

    public void updateSalary(String salary_empl) {
        this.salary = salary_empl;
    }

    public static void main(String[] args) {
        Employee constractor1 = new Employee("Ivan", "Ivanov");
        Employee constractor2 = new Employee("Ivan1", "Ivanov1", "Engineer", "30000");

//methods
//1. get name
        System.out.println(constractor1.name);
//2. update name
        constractor1.updateName("New Ivan Name");
        System.out.println(constractor1.name);
//3. get surname
        System.out.println(constractor1.surname);
//4. update surname
        constractor1.updateSurname("New Ivanov Surname");
        System.out.println(constractor1.surname);
//5. get job title
        System.out.println(constractor2.jobTitle);
//6. update job title
        constractor2.updateJobTitle("New job Name");
        System.out.println(constractor2.jobTitle);
//7. get salary
        System.out.println(constractor2.salary);
//8. update salary
        constractor2.updateSalary("New Salary value");
        System.out.println(constractor2.salary);

    }
}
