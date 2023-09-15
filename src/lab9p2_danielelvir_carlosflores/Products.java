/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_danielelvir_carlosflores;

/**
 *
 * @author HP
 */
public class Products {
    private String Product_ID, Category, Sub_Category, Product_Name;

    public Products() {
    }

    public Products(String Product_ID, String Category, String Sub_Category, String Product_Name) {
        this.Product_ID = Product_ID;
        this.Category = Category;
        this.Sub_Category = Sub_Category;
        this.Product_Name = Product_Name;
    }

    
    
    public String getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(String Product_ID) {
        this.Product_ID = Product_ID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getSub_Category() {
        return Sub_Category;
    }

    public void setSub_Category(String Sub_Category) {
        this.Sub_Category = Sub_Category;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String Product_Name) {
        this.Product_Name = Product_Name;
    }

    @Override
    public String toString() {
        return Product_ID+",\n"
                +Category+",\n"
                +Sub_Category+",\n"
                +Product_Name;
    }
    
    
}
