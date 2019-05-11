package Factory;

import Abstract.Abstract;
import Abstract.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
private static Map<String,Product> registry=new HashMap<String, Product>();
private static volatile ProductFactory instance=null;

//Singleton sur le registry factory
  public static ProductFactory getInstance(){
      ProductFactory result=instance;
      if(result==null){
          synchronized (ProductFactory.class){
              result=instance;
              if(result==null){
                  instance=new ProductFactory();
              }
          }
      }
      return instance;
  }


public Abstract createProduct(String name){
      return (Abstract) registry.get(name).createProduct();
}



    public static void registerProduct(String name, Product p){
        registry.put(name,p);
    }


}
