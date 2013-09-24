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
    private int MIN_LENGTH = 1;
    private String ID_ERROR = "Error: Invalid product ID.";
    private String COST_ERROR = "Error: Product cost must be greater than 0.00";
    private String DESC_ERROR = "Error: Please enter a valid description.";
    
    private Discount discount;
    private String productId;
    private String description;
    private double unitCost;
    
    public Product(String productId, double unitCost, String description){
        
        if(productId == null || productId.length() <= MIN_LENGTH){
            System.out.println(ID_ERROR);
        }else if(unitCost <= 0){
            System.out.println(COST_ERROR);
        }else if(description == null || description.length() <= MIN_LENGTH){
            System.out.println(DESC_ERROR);
        }else{
            this.productId = productId;
            this.unitCost = unitCost;
            this.description = description;
        }
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
        if(productId == null || productId.length() <= MIN_LENGTH){
            System.out.println(ID_ERROR);
        }else{
            this.productId = productId;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description == null || description.length() <= MIN_LENGTH){
            System.out.println(DESC_ERROR);
        }else{
            this.description = description;
        }
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        if(unitCost <= 0){
            System.out.println(COST_ERROR);
        }else{
            this.unitCost = unitCost;
        }
    }
    
}
