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
    
    private Product p;
    private Receipt r;
    private Discount disc;
    private double subtotal;
    private double taxRate;
    
    public void startSale(String customerId){
        // initiate sales procedure, start printing receipt
    }

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }
    
    public void addProduct(){
        // add product to DataManager... or Receipt/ListItem?
    }
    
    public void voidProduct(){
        // remove product from DataManager
    }
    
    private void applyDiscount(Discount disc){
        // apply Discount action to product or bill
    }
}
