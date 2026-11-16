package uk.ac.westminster.products_api;

public class Adress {
    private String street;
    private String city;
    private String postcode;
    public Adress (){}
    public Adress(String street,String city,String postcode){
        this.city=city;
        this.street=street;
        this.postcode=postcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }
}
