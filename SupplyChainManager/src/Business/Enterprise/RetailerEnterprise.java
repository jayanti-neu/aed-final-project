/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.ProductTracking.Product;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author jayanti
 */
public class RetailerEnterprise extends Enterprise{
    
//    Inventory inventory;
    ArrayList<Product> productList;
    Map<Integer, Integer> inventory; //productId To Quantity
//    Map<int>

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Map<Integer, Integer> getInventory() {
        return inventory;
    }

    public void setInventory(Map<Integer, Integer> inventory) {
        this.inventory = inventory;
    }
    
    
    public void addProduct(Product product){
        productList.add(product);
    }
    
    public void updateInventoryQuantity(Product product, int quantity){
        int existingQuantity = inventory.get(product.getId());
        
        inventory.put(product.getId(), existingQuantity + quantity);
    }
    
}
