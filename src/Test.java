class Test {
    public static void main(String[] args) {
        Company company = new Company();
        EmployeeFactory employeeFactory = new EmployeeFactory();

        for (int i = 0; i < company.getEmployeesLength(); i++) {
            System.out.println("Pracownik nr " + (i + 1));
            Employee employee = employeeFactory.createEmployee();
            company.add(employee);
        }

        double totalSalary = 0;

        for (int i = 0; i < company.getEmployeesLength(); i++) {
            totalSalary += company.getEmployees()[i].getSalary();
        }

        System.out.println("Suma pensji pracowników: " + totalSalary);

        System.out.println(company.get(0));
        System.out.println(company.get(1));
    }
}
