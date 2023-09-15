/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_danielelvir_carlosflores;

/**
 *
 * @author HP
 */
public class Customers {
    private String Customer_ID, Customer_Name, Segment, Country, City, State, Postal_Code, Region;

    public Customers() {
    }

    public Customers(String Customer_ID, String Customer_Name, String Segment, String Country, String City, String State, String Postal_Code, String Region) {
        this.Customer_ID = Customer_ID;
        this.Customer_Name = Customer_Name;
        this.Segment = Segment;
        this.Country = Country;
        this.City = City;
        this.State = State;
        this.Postal_Code = Postal_Code;
        this.Region = Region;
    }

    public String getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(String Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String Customer_Name) {
        this.Customer_Name = Customer_Name;
    }

    public String getSegment() {
        return Segment;
    }

    public void setSegment(String Segment) {
        this.Segment = Segment;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getPostal_Code() {
        return Postal_Code;
    }

    public void setPostal_Code(String Postal_Code) {
        this.Postal_Code = Postal_Code;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    @Override
    public String toString() {
        return Customer_ID+",\n"
                +Customer_Name+",\n"
                +Segment+",\n"
                +Country+",\n"
                +City+",\n"
                +State+",\n"
                +Postal_Code+",\n"
                +Region;
    }
    
    
}
