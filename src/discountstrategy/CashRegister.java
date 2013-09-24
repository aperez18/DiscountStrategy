/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Andy
 */
public class CashRegister {
    private final String INPUT_ERROR = "";
    
    private Receipt r;
    private double subtotal;
    private double taxRate;
    
    public void startSale(String customerId){
        // initiate sales procedure, start printing receipt
        r = new Receipt(customerId);
    }
    
    public void addProduct(){
        // add product to Receipt
    }
    
    public void voidProduct(){
        // remove product from Receipt
    }
}
