/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Andy
 */
public class Customer {
    private String customerId;
    private String fname;
    private String lname;
    private String address;
    private char gender;

    public Customer(String customerId, String fname, String lname, String address, char gender) {
        this.customerId = customerId;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.gender = gender;
    }   

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
