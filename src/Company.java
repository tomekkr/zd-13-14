class Company {
    private final int employeesLimit = 2;
    private static int employeeIndex = 0;

    private Employee[] employees = new Employee[employeesLimit];

    void add(Employee emp) {
        employees[employeeIndex] = emp;
        employeeIndex++;
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