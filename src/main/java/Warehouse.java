
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    //private String product;
    private int price;
    private int stock;

    private final Map<String, Integer> warehouse = new HashMap<>();
    private final Map<String, Integer> warehouse2 = new HashMap<>();

   // public Warehouse() {

        //this.warehouse = new HashMap<>();
      //  this.warehouse2 = new HashMap<>();

   // }

    public void addProduct(String product, int price, int stock) {

        //this.product = product;
        this.price = price;
        this.stock = stock;

        this.warehouse2.put(product, this.stock);

        this.warehouse.put(product, this.price);
    }

    public int price(String product) {

        Set<String> keys = warehouse.keySet();

        if (keys.contains(product)) {

            return warehouse.get(product);

        }

        return -99;

    }

    public int stock(String product) {

        Set<String> keys = warehouse2.keySet();

        if (keys.contains(product)) {

            return warehouse2.get(product);

        }
        return 0;
    }

    public boolean take(String product) {

        Set<String> keys = warehouse2.keySet();

        if (keys.contains(product) && warehouse2.get(product)>0) {
            warehouse2.put(product, warehouse2.get(product) - 1);
            return true;
        }

        return false;
    }
    
    public Set<String> products(){
        
        Set<String> set = new HashSet<>();
        Set<String> keys = warehouse.keySet();

        for (String element: keys) {
   set.add(element);    
}
        
       
     return set;   
        
    }

}
