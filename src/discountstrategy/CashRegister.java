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
    // declare local variables
    private Receipt r;
    private double subtotal;
    private double taxRate;
    
    public void startSale(String customerId){
        // initiate sales procedure, start printing receipt
        r = new Receipt(customerId);
    }
    
    public void endSale(){
        calculateTotal();
        r.printReceipt();
    }
    
    public double calculateTotal(){
        //calculate grand total with discounts
        applyDiscount();
        calculateSubtotal();
        return (subtotal*taxRate) + subtotal;
    }
    
    private void calculateSubtotal(){
        //calculate subtotal of all products on receipt
    }
    
    private void applyDiscount(){
        //apply discount to transaction
    }
    
    public void addProduct(String productId){
        // add product to Receipt
        r.addProduct(productId);
    }
    
    public void voidProduct(String productId){
        // remove product from Receipt
        r.voidProduct(productId);
    }
}
