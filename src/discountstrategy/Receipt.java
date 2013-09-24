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
    //declare local variables
    
    //finals
    
    //components
    private LineItem items[];
    private Customer customer;
    private DataManager db;
    
    //properties
    //private double subtotal;
    //private double total;
    
    public Receipt(String customerId){
        db = new DataManager();
        customer = findCustomer(customerId);
    }
    
    public String printReceipt(){
        //display all line items, customer info, subtotal and total
        return "I'm a receipt! :D";
    }
    
    private Customer findCustomer(String customerId){
        return db.getCustomer(customerId);
    }
    
    public void addProduct(String productId){
        LineItem itemIn = new LineItem(productId);
        
        LineItem temp[] = new LineItem[items.length+1];
        System.arraycopy(items, 0, temp, 0, items.length);
        items = temp;
        items[items.length-1] = itemIn;
    }
    
    public void voidProduct(String productId){
        //find line item on receipt, subtract one from quantity or remove
        //line item if qty == 1
    }
}
