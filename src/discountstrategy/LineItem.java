/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Andy
 */
public class LineItem {
    //declare local variables
    private int qty;
    private Product p;
    private DataManager db;
    
    public LineItem(String productId) {
        db = new DataManager();
        p = db.getProduct(productId);
    }
    
    public String getProductId(String productId){
        return p.getProductId();
    }
    
    public String getProductDescription(String productId){
        return p.getDescription();
    }
}
