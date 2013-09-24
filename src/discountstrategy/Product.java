/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Andy
 */
public class Product {
    private Discount discount;
    private String productId;
    private String description;
    private double unitCost;
    
    public Product(String productId, double unitCost, String description){
        this.productId = productId;
        this.unitCost = unitCost;
        this.description = description;
    }

    public Product(String productId, double unitCost, String description, Discount discount) {
        this.discount = discount;
        this.productId = productId;
        this.description = description;
        this.unitCost = unitCost;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    
}
