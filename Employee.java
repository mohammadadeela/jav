import java.util.Date;

public class Employee extends Citizen {
    private int employeeID;
    private String companyName;
    private Address companyAddress;
    private double salary;

    // - a no-args constructor thats calls the superclass’s no-args constructor
    public Employee() {
        super();
    }

    // constructor that sets all Employee attributes and calls the second constructor in Citizen
    public Employee(String fullName, Date birthDate, Address address, int employeeID, String companyName, Address companyAddress, double salary) {
        super(fullName, birthDate, address); //calls the second constructor in Citizen
        this.employeeID = employeeID;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.salary = salary;
    }

    // setters for all employee attributes
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // getters for all employee attributes
    public int getEmployeeID() {
        return employeeID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Address getCompanyAddress() {
        return companyAddress;
    }

    public double getSalary() {
        return salary;
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + // Call to the Citizen's toString method
                "Employee ID: " + employeeID + "\n" +
                "Company Name: " + companyName + "\n" +
                "Company Address: " + companyAddress + "\n" +
                "Salary: " + salary + "\n";
    }
}
