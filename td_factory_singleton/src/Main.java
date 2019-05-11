import Abstract.Product;
import Factory.ProductFactory;
import model.Client;

import java.util.ArrayList;
import java.util.List;

public class Main {


    static {
        try{
            Class.forName("ProductA");
            Class.forName("ProductB");
            Class.forName("ProductC");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        Client client=new Client();
        ProductFactory instance=ProductFactory.getInstance();
        List<Product> list=new ArrayList<Product>();
        list.add(instance.createProduct("ProductA"));
        list.add(instance.createProduct("ProductB"));
        list.add(instance.createProduct("ProductC"));
        client.foo(list);
    }
}
