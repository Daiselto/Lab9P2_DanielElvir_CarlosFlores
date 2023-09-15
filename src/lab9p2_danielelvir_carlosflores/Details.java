
package lab9p2_danielelvir_carlosflores;


public class Details {
    private String Order_ID, Product_ID, Sales, Quantity, Discount, Profit;

    public Details() {
    }

    public Details(String Order_ID, String Product_ID, String Sales, String Quantity, String Discount, String Profit) {
        this.Order_ID = Order_ID;
        this.Product_ID = Product_ID;
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

    public String getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(String Product_ID) {
        this.Product_ID = Product_ID;
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
        return Order_ID+",\n"
                +Product_ID+",\n"
                +Sales+",\n"
                +Quantity+",\n"
                +Discount+",\n"
                +Profit;
    }
    
    
}
