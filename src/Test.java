import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Company company = new Company();

        for (int i = 0; i < company.getEmployeesLength(); i++) {
            System.out.println("Pracownik nr " + (i + 1));
            System.out.print("Podaj imię: ");
            String firstName = sc.nextLine();
            System.out.print("Podaj nazwisko: ");
            String lastName = sc.nextLine();
            System.out.print("Podaj pensję: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.println("");
            Employee employee = new Employee(firstName, lastName, salary);
            company.add(employee);
        }
        sc.close();

        double totalSalary = 0;

        for (int i = 0; i < company.getEmployeesLength(); i++) {
            totalSalary += company.getEmployees()[i].getSalary();
        }

        System.out.println("Suma pensji pracowników: " + totalSalary);

        System.out.println(company.get(0));
        System.out.println(company.get(1));
    }
}
