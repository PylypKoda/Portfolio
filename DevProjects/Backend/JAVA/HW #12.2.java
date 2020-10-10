public class Department {
    private String departmentName;
    private Employee[] employees;

    Department(String departmentName){
        this.departmentName = departmentName;
    }

    Department(Employee[] employees){
        this.employees = employees;
    }

    public String getDepartmentName() {

        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {

        this.departmentName = departmentName;
    }

    public int getEmployeesCount(){

        return this.employees.length;
    }

    public int getTotalEmployeesSalary(){
        int salary = 0;
        for (Employee emp : this.employees){
            salary += emp.getSalary();
        }
        return salary;
    }

    public Employee getEmployeeByFullName(String lastName, String firstName){
        Employee findEmp = null;
        for (Employee emp : this.employees){
            if (emp.getLastName().equals(lastName) && emp.getFirstName().equals(firstName)){
                findEmp = emp;
            }
        }
        return findEmp;
    }

    public void addNewEmployee(Employee newEmployee) {
        Employee[] newEmploees = new Employee[this.employees.length + 1];
        System.arraycopy(this.employees, 0, newEmploees, 0, this.employees.length);
        newEmploees[this.employees.length] = newEmployee;
        this.employees = newEmploees;
    }

    public void showDepartmentInfo(){
        for (Employee emp : this.employees){
            System.out.println(emp.getFirstName());
            System.out.println(emp.getLastName());
            System.out.println(emp.getPosition());
            System.out.println(emp.getSalary());
            System.out.print("\n\n");
        }
    }

    public Employee[] getEmployees(){

        return this.employees;
    }

    public Employee[] getEmployeesSortByLastName(){
        Employee[] sortEmployees = this.getEmployees();
        Arrays.sort(sortEmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee em1, Employee em2) {
                if (em1.getFirstName().equals(em2.getFirstName())) {
                    return em1.getFirstName().compareTo(em2.getFirstName());
                }
                return em1.getLastName().compareTo(em2.getLastName());
            }
        });
        return sortEmployees;
    }

    public void fireEmployee(String lastName, String firstName, String position) {
        for (int removedIdx = 0; removedIdx < this.employees.length; removedIdx++) {
            Employee employee = this.employees[removedIdx];
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)
                    && employee.getPosition().equals(position)) {

                Employee[] newEmployees = new Employee[this.employees.length - 1];
                System.arraycopy(this.employees, 0, newEmployees, 0, removedIdx);
                if (this.employees.length != removedIdx) {
                    System.arraycopy(this.employees, removedIdx + 1, newEmployees, removedIdx,
                            this.employees.length - removedIdx - 1);
                }
                this.employees = newEmployees;
            }
        }
    }
}