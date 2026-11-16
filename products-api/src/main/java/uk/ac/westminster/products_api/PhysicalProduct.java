package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product
implements Discountable{
    private double weightKg;
    private String dimensions;
    private double DiscountablePrice;
    @Override
    public void applyDiscount(double rate) {
        double capped=Math.min(rate, 0.20);
        DiscountablePrice=getPrice()*(1-capped);
    }

    @Override
    public double getDiscountedPrice() {
        return DiscountablePrice;
    }

    public PhysicalProduct(){
    }

    public PhysicalProduct(Long id,String name,double price,double weightKg,String dimensions){
        super(id,name,price);
        this.dimensions=dimensions;
        this.weightKg=weightKg;

    }
    @Override
    public String getSummary(){
        return "name"+getName()+"weight"+weightKg;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }


}
