package model;

import Abstract.Abstract;
import Factory.ProductFactory;

public final class ProductA extends Abstract{

    static {
        ProductFactory.registerProduct("ProductA",new ProductA());
    }

    public Abstract createProduct(){
        return new ProductA();
    }

    private static void doYourStuff(){
        System.out.println("I’m a ProductA , doing my stuff");
    }

    public void foo(){
        doYourStuff();
    }

}
