import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// driver class to test the Citizen, Employee, and Address classes
public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // create an array of 5 Citizens
        Citizen[] citizens = new Citizen[5];
        // create an array of 5 Employees
        Employee[] employees = new Employee[5];

        // loop to fill citizen array
        for (int i = 0; i < citizens.length; i++) {
            System.out.println("full  for Citizen " + (i + 1) + ":");
            String fullName = scanner.nextLine();

            System.out.println("birth date for Citizen " + (i + 1) + " (yyyy-mm-dd):");
            Date birthDate = null;
            while (birthDate == null) {
                try {
                    String birthDateString = scanner.nextLine();
                    birthDate = dateFormat.parse(birthDateString);
                } catch (ParseException e) {
                    System.out.println("Invalid date format. Please date in yyyy-mm-dd format:");
                }
            }

            System.out.println("the first line of the address for Citizen " + (i + 1) + ":");
            String firstLine = scanner.nextLine();

            System.out.println("the second line of the address for Citizen " + (i + 1) + ":");
            String secondLine = scanner.nextLine();

            System.out.println("the town  for Citizen " + (i + 1) + ":");
            String townName = scanner.nextLine();

            Address address = new Address();
            address.changeAddress(firstLine + "\n" + secondLine + "\n" + townName);

            citizens[i] = new Citizen(fullName, birthDate, address);
        }

        // loop to fill employee array
        for (int i = 0; i < employees.length; i++) {
            System.out.println("full  for Employee " + (i + 1) + ":");
            String fullName = scanner.nextLine();

            System.out.println("birth date for Employee " + (i + 1) + " (yyyy-mm-dd):");
            Date birthDate = null;
            while (birthDate == null) {
                try {
                    String birthDateString = scanner.nextLine();
                    birthDate = dateFormat.parse(birthDateString);
                } catch (ParseException e) {
                    System.out.println("invalid date format. Please date in yyyy-mm-dd format:");
                }
            }

            System.out.println("the first line of the home address for Employee " + (i + 1) + ":");
            String firstLine = scanner.nextLine();

            System.out.println("the second line of the home address for Employee " + (i + 1) + ":");
            String secondLine = scanner.nextLine();

            System.out.println("the town  of the home address for Employee " + (i + 1) + ":");
            String townName = scanner.nextLine();

            Address homeAddress = new Address();
            homeAddress.changeAddress(firstLine + "\n" + secondLine + "\n" + townName);

            System.out.println("employee ID for Employee " + (i + 1) + ":");
            int employeeID = Integer.parseInt(scanner.nextLine());

            System.out.println("company  for Employee " + (i + 1) + ":");
            String companyName = scanner.nextLine();

            System.out.println("the first line of the company address for Employee " + (i + 1) + ":");
            String companyFirstLine = scanner.nextLine();

            System.out.println("the second line of the company address for Employee " + (i + 1) + ":");
            String companySecondLine = scanner.nextLine();

            System.out.println("the town  of the company address for Employee " + (i + 1) + ":");
            String companyTownName = scanner.nextLine();

            Address companyAddress = new Address();
            companyAddress.changeAddress(companyFirstLine + "\n" + companySecondLine + "\n" + companyTownName);

            System.out.println("salary for Employee " + (i + 1) + ":");
            double salary = Double.parseDouble(scanner.nextLine());

            employees[i] = new Employee(fullName, birthDate, homeAddress, employeeID, companyName, companyAddress, salary);
        }

        // print all citizens
        System.out.println("\n############## Citizens ##############");
        for (Citizen citizen : citizens) {
            System.out.println(citizen.toString());
            System.out.println();
        }

        // print all employees
        System.out.println("\n############## Employees ##############");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
            System.out.println();
        }

        // testing methods in all classes
        // modify the first citizen's address
        citizens[0].setFirstName("tempFirst");
        citizens[0].setSecondName("tempSecond");
        citizens[0].setThirdName("tempThird");
        citizens[0].setFamilyName("tempFamily");
        citizens[0].getAddress().changeAddress("temp Line 1\ntemp Line 2\ntemp Town");
        System.out.println("temp Citizen 1: " + citizens[0]);

        // modify the first employee's details
        employees[0].setEmployeeID(9999);
        employees[0].setCompanyName("tempCompany");
        employees[0].setSalary(99999.99);
        employees[0].setCompanyAddress(new Address("temp Line 1\ntemp Line 2\ntemp Town"));

        System.out.println("temp Employee 1: " + employees[0]);

        scanner.close();
    }
}
