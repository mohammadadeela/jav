import java.util.Date;

public class Citizen {
    private String firstName; // First name
    private String secondName; // Second name
    private String thirdName; // Third Name
    private String familyName; // Family name
    private Date birthDate; //  Date of birth is set using all constructors
    private Address address; // an object from Address
    private static long populationSize = 0; // a STATIC property that calculates the population size
    private long ID; // Citizen ID number

    // no-args constructor
    public Citizen() {
        this.ID = populationSize; // set ID to current population size
        populationSize++; // increment population size
    }

    // constructor with full name, birth date, and address
    public Citizen(String fullName, Date birthDate, Address address) {
        this.ID = populationSize;
        populationSize++;

        // split full name into parts
        String[] nameParts = fullName.split(" ");

        if (nameParts.length > 0) {
            this.firstName = nameParts[0];
        } else {
            this.firstName = "";
        }

        if (nameParts.length > 1) {
            this.secondName = nameParts[1];
        } else {
            this.secondName = "";
        }

        if (nameParts.length > 2) {
            this.thirdName = nameParts[2];
        } else {
            this.thirdName = "";
        }

        if (nameParts.length > 3) {
            this.familyName = nameParts[3];
        } else {
            this.familyName = "";
        }

        // set birth date and address
        this.birthDate = birthDate;
        this.address = address;
    }


    // setters for all name parts, birthDate, and address
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // getters for all attributes
    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public long getID() {
        return ID;
    }

    public static long getPopulationSize() {
        return populationSize;
    }

    // toString() method
    @Override
    public String toString() {
        return "citizen ID: " + ID + "\n" +
                "name: " + firstName + " " + secondName + " " + thirdName + " " + familyName + "\n" +
                "birth date: " + birthDate + "\n" +
                "address: " + address + "\n";
    }
}
