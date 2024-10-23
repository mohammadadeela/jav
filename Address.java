public class Address {
    private String firstLine;
    private String secondLine;
    private String townName;

    // No-args constructor
    public Address() {
        this.firstLine = "";
        this.secondLine = "";
        this.townName = "";
    }

    // constructor that takes one String containing full address and then splits it (using \n) and
    //fills firstLine, secondLine and townName
    public Address(String fullAddress) {
        String[] addressParts = fullAddress.split("\n");
        if (addressParts.length > 0) {
            this.firstLine = addressParts[0];
        } else {
            this.firstLine = "";
        }
        if (addressParts.length > 1) {
            this.secondLine = addressParts[1];
        } else {
            this.secondLine = "";
        }
        if (addressParts.length > 2) {
            this.townName = addressParts[2];
        } else {
            this.townName = "";
        }
    }

    // method called changeAddress that takes a String containing full address and then splits it
    //(using \n) and fills firstLine, secondLine and townName
    public void changeAddress(String fullAddress) {
        String[] addressParts = fullAddress.split("\n");
        if (addressParts.length > 0) {
            this.firstLine = addressParts[0];
        } else {
            this.firstLine = "";
        }
        if (addressParts.length > 1) {
            this.secondLine = addressParts[1];
        } else {
            this.secondLine = "";
        }
        if (addressParts.length > 2) {
            this.townName = addressParts[2];
        } else {
            this.townName = "";
        }
    }

    // toString() method
    @Override
    public String toString() {
        return firstLine + "\n" + secondLine + "\n" + townName;
    }
}
