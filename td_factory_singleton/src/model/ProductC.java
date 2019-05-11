package model;

import Abstract.Abstract;
import Abstract.Product;
import Factory.ProductFactory;

public final class ProductC extends Abstract{

    static {
        ProductFactory.registerProduct("ProductC",new ProductC());
    }

    public Product createProduct(){
        return new ProductC();
    }

    private static void perform(){
        System.out.println("I'm a ProductC, performing");
    }

    public void foo(){
        perform();
    }
}
