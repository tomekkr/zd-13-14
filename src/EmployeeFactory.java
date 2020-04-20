import java.util.Scanner;

class EmployeeFactory {
    public Employee createEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String firstName = sc.nextLine();
        System.out.print("Podaj nazwisko: ");
        String lastName = sc.nextLine();
        System.out.print("Podaj pensję: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("");
        return new Employee(firstName, lastName, salary);
    }
}