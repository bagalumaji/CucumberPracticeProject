package customparametertype;

import io.cucumber.java.ParameterType;
import pojo.Product;

public class CustomParameterTypes {
    @ParameterType(".*")
    public Product product(String name){
        return new Product(name);
    }
}
