import java.util.Scanner;

class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Pracownik nr " + (i + 1));
            System.out.print("Podaj imię: ");
            String firstName = sc.nextLine();
            System.out.print("Podaj nazwisko: ");
            String lastName = sc.nextLine();
            System.out.print("Podaj pensję: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.println("");
            employees[i] = new Employee(firstName, lastName, salary);
        }
        sc.close();

        double totalSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        System.out.println("Suma pensji pracowników: " + totalSalary);

    }
}
