/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Andy
 */
public class Receipt {
    private LineItem item;
    private Customer customer;
    private DataManager db;
    private String customerId;
    private double subtotal;
    private double total;
    
    public Receipt(String customerId){
        db = new DataManager();
        customer = findCustomer(customerId);
    }
    
    private Customer findCustomer(String customerId){
        return db.getCustomer(customerId);
    }
}
