/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Andy
 */
public class Startup {
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        String sampleId = "AP33092";
        cr.startSale(sampleId);
    }
}
