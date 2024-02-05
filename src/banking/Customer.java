package banking;

/**
 * Represents a customer of a bank
 */

public class Customer {

    //instance vars

    String name;

    String address;

    // constructor

    /**
     * @param name of customer
     */

    public Customer(String name) {
        this.name = name;
    }

    // methods

    /**
     * Sets the address of customer to be given address
     * @param address for cusomter
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns customer's name
     * @return name of customer
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns customer's address
     * @return address of customer
     */
    public String getAddress() {
        return this.address;
    }
}
