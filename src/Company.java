class Company {
    private final int EMPLOYEES_LIMIT = 2;
    private static int EMPLOYEE_INDEX = 0;

    private Employee[] employees = new Employee[EMPLOYEES_LIMIT];

    void add(Employee emp) {
        employees[EMPLOYEE_INDEX] = emp;
        EMPLOYEE_INDEX++;
    }

    public Employee get(int index) {
        return employees[index];
    }

    public double getEmployeesLength() {
        return employees.length;
    }

    public Employee[] getEmployees() {
        return employees;
    }
}