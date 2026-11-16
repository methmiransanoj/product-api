package uk.ac.westminster.products_api;

public class Customer {

    private Long id;
    private String name;
    private String email;
    private Adress adress;
    private static int customerCount=0;
    private String[] tags;

    public Customer() {
        customerCount++;
    }
    public Customer(Long id, String name, String email, Adress adress) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.adress = adress;
        customerCount++;
    }
    public static int getCustomerCount(){
        return customerCount;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Adress getAdress() {
        return adress;
    }
}

