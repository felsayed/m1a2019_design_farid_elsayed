package model;

import Abstract.Abstract;
import Factory.ProductFactory;

public final class ProductB extends Abstract {

    static{
        ProductFactory.registerProduct("ProductB",new ProductB());
    }
    public Abstract createProduct(){
        return new ProductB();
    }

    private static void doIt(){
        System.out.println("I'm a ProductB, doing it");
    }

    public void foo(){
        doIt();
    }
}
