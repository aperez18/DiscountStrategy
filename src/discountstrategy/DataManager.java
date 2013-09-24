/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Andy
 */
public class DataManager {
    private final int NOT_FOUND = -1;
    private int MIN_RECS = 0;
    private final String CUSTOMER_ERROR = "Error: Customer not found.";
    private final String PRODUCT_ERROR = "ErrorL Product not found.";
    
    private Customer customers[];
    private Product products[];
    private int foundIndex;
    
    public DataManager(){
        foundIndex = NOT_FOUND;
        customers = new Customer[MIN_RECS];
        products = new Product[MIN_RECS];
    }
    
    public void addCustomer(String customerId, String fname, String lname, 
            String address, char gender){
        
        Customer newCust = new Customer(customerId, fname, lname, address, gender);
        
        Customer temp[] = new Customer[customers.length+1];
        System.arraycopy(customers, 0, temp, 0, customers.length);
        customers = temp;
        customers[customers.length-1] = newCust;
    }
    
    public Customer getCustomer(String customerId){
        for (int i = 0; i <= customers.length; i++) {
            if (customerId.equalsIgnoreCase(customers[i].getCustomerId())) {
                foundIndex = i;
                break;
            }
        }
        
        if (foundIndex == NOT_FOUND) {
            System.out.println(CUSTOMER_ERROR);
            return null;
        }else{
            return customers[foundIndex];
        }
    }
    
    public void addProduct(String productId, double unitCost, String description){
        Product newProd = new Product(productId, unitCost, description);
        
        Product temp[] = new Product[products.length+1];
        System.arraycopy(products, 0, temp, 0, products.length);
        products = temp;
        products[products.length-1] = newProd; 
    }
    
    public Product getProduct(String productId){
        for (int i = 0; i <= products.length; i++) {
            if (productId.equalsIgnoreCase(products[i].getProductId())) {
                foundIndex = i;
                break;
            }
        }
        
        if (foundIndex == NOT_FOUND) {
            System.out.println(PRODUCT_ERROR);
            return null;
        }else{
            return products[foundIndex];
        }
    }
}
