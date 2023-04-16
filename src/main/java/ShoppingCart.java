
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class ShoppingCart {

    private Map<String, Item> ShoppingCart = new HashMap<>();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.ShoppingCart);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ShoppingCart other = (ShoppingCart) obj;
        if (!Objects.equals(this.ShoppingCart, other.ShoppingCart)) {
            return false;
        }
        return true;
    }

    public ShoppingCart() {

        this.ShoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {

        if (this.ShoppingCart.containsKey(product)) {

           this.ShoppingCart.get(product).increaseQuantity();

          //  for (Item item : ShoppingCart.values()) {

                //test = test + item.price();
                                
             //   item.increaseQuantity();
                
            }

            //Item item1 = new Item(product, 1, (test + price));

            //item1.increaseQuantity();

            //this.ShoppingCart.put(product, item1);

         //else if (!ShoppingCart.keySet().contains(product)) {

          //  Item item2 = new Item(product, 1, price);

         // item1.increaseQuantity();

          //  this.ShoppingCart.put(product, item2);

        else{
            Item item = new Item (product, 1, price);
        this.ShoppingCart.put(product, item);
          
    }      
          
    }

    public int price() {

        int test = 0;

        for (Item item : ShoppingCart.values()) {

            test = test + item.price();
        }

        return test;

    }

    public void print() {

        for (Item item : ShoppingCart.values()) {

            System.out.println(item.toString());
        }

    }

}
