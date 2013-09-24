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
    private int qty;
    private double subtotal;
    private Product p;
    private DataManager db;
    
    public LineItem(String productId) {
        db = new DataManager();
        p = db.getProduct(productId);
    }
}
