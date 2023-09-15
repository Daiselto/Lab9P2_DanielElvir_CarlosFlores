/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_danielelvir_carlosflores;

/**
 *
 * @author HP
 */
public class Orders {
    private String Order_ID, Order_Date, Ship_Date, Ship_Mode, Customer_ID;

    public Orders() {
    }

    public Orders(String Order_ID, String Order_Date, String Ship_Date, String Ship_Mode, String Customer_ID) {
        this.Order_ID = Order_ID;
        this.Order_Date = Order_Date;
        this.Ship_Date = Ship_Date;
        this.Ship_Mode = Ship_Mode;
        this.Customer_ID = Customer_ID;
    }

    public String getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(String Order_ID) {
        this.Order_ID = Order_ID;
    }

    public String getOrder_Date() {
        return Order_Date;
    }

    public void setOrder_Date(String Order_Date) {
        this.Order_Date = Order_Date;
    }

    public String getShip_Date() {
        return Ship_Date;
    }

    public void setShip_Date(String Ship_Date) {
        this.Ship_Date = Ship_Date;
    }

    public String getShip_Mode() {
        return Ship_Mode;
    }

    public void setShip_Mode(String Ship_Mode) {
        this.Ship_Mode = Ship_Mode;
    }

    public String getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(String Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    @Override
    public String toString() {
        return Order_ID+",\n"
                + Order_Date+",\n"
                + Ship_Date+",\n"
                + Ship_Mode+",\n"
                + Customer_ID;
    }
    
    
}
