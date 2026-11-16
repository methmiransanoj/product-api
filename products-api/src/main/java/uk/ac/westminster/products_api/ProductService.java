package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    public List<String> getAllSummary(){
        List<String> summaries=new ArrayList<>();
        for(Product p :products){
            summaries.add(p.getSummary());
        }
        return summaries;
    }
    public Optional<Product> getProductById(Long id){
        return products.stream().filter(p->p.getId().equals(id)).findFirst();
    }
    private List<Product> products=new ArrayList<>();
    private Long nextId=1l;

    public List<Product> getAllProducts() {
        return products;
    }
    public Product addProduct(Product product){
        product.setId( nextId++);
        products.add(product);
        return product;
        
    }
    public void deleteProduct(Long id){
        products.removeIf(p->p.getId().equals(id));
    }
    public List<Product> findByName(String name){
        return products.stream().filter(p ->p.getName().contains(name) ).toList();
    }
    public ProductService(){
        products.add(new DigitalProduct(nextId++,"sanoj",99.22,"love.ulk",22.33));
        products.add(new PhysicalProduct(nextId++,"methmiran",234.44,125,"12*33"));

    }


}
