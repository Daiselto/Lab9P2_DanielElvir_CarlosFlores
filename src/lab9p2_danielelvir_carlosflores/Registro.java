/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_danielelvir_carlosflores;

/**
 *
 * @author HP
 */
public class Registro {
    private String Order_ID, Ship_Mode, Segment, State, ProductID, Order_Date, CustomerID, Country, Postal_Code, Category, Ship_Date, Customer_Name, City, Region, Sub_Categotry, Product_Name, Sales, Quantity, Discount,  Profit;

    public Registro() {
    }

    public Registro(String Order_ID, String Ship_Mode, String Segment, String State, String ProductID, String Order_Date, String CustomerID, String Country, String Postal_Code, String Category, String Ship_Date, String Customer_Name, String City, String Region, String Sub_Categotry, String Product_Name, String Sales, String Quantity, String Discount, String Profit) {
        this.Order_ID = Order_ID;
        this.Ship_Mode = Ship_Mode;
        this.Segment = Segment;
        this.State = State;
        this.ProductID = ProductID;
        this.Order_Date = Order_Date;
        this.CustomerID = CustomerID;
        this.Country = Country;
        this.Postal_Code = Postal_Code;
        this.Category = Category;
        this.Ship_Date = Ship_Date;
        this.Customer_Name = Customer_Name;
        this.City = City;
        this.Region = Region;
        this.Sub_Categotry = Sub_Categotry;
        this.Product_Name = Product_Name;
        this.Sales = Sales;
        this.Quantity = Quantity;
        this.Discount = Discount;
        this.Profit = Profit;
    }

    public String getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(String Order_ID) {
        this.Order_ID = Order_ID;
    }

    public String getShip_Mode() {
        return Ship_Mode;
    }

    public void setShip_Mode(String Ship_Mode) {
        this.Ship_Mode = Ship_Mode;
    }

    public String getSegment() {
        return Segment;
    }

    public void setSegment(String Segment) {
        this.Segment = Segment;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getOrder_Date() {
        return Order_Date;
    }

    public void setOrder_Date(String Order_Date) {
        this.Order_Date = Order_Date;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getPostal_Code() {
        return Postal_Code;
    }

    public void setPostal_Code(String Postal_Code) {
        this.Postal_Code = Postal_Code;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getShip_Date() {
        return Ship_Date;
    }

    public void setShip_Date(String Ship_Date) {
        this.Ship_Date = Ship_Date;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String Customer_Name) {
        this.Customer_Name = Customer_Name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getSub_Categotry() {
        return Sub_Categotry;
    }

    public void setSub_Categotry(String Sub_Categotry) {
        this.Sub_Categotry = Sub_Categotry;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String Product_Name) {
        this.Product_Name = Product_Name;
    }

    public String getSales() {
        return Sales;
    }

    public void setSales(String Sales) {
        this.Sales = Sales;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    public String getProfit() {
        return Profit;
    }

    public void setProfit(String Profit) {
        this.Profit = Profit;
    }

    @Override
    public String toString() {
        return Order_ID;
    }
    
    
}
