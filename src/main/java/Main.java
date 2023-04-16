
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

Warehouse warehouse = new Warehouse();
warehouse.addProduct("milk", 3, 10);
warehouse.addProduct("coffee", 5, 7);

System.out.println("prices:");
System.out.println("milk: " + warehouse.price("milk"));
System.out.println("coffee: " + warehouse.price("coffee"));
System.out.println("sugar: " + warehouse.price("sugar"));

Warehouse warehouse1 = new Warehouse();
warehouse1.addProduct("coffee", 5, 1);

System.out.println("stock:");
System.out.println("coffee:  " + warehouse1.stock("coffee"));
System.out.println("sugar: " + warehouse1.stock("sugar"));

System.out.println("taking coffee " + warehouse1.take("coffee"));
System.out.println("taking coffee " + warehouse1.take("coffee"));
System.out.println("taking sugar " + warehouse1.take("sugar"));

System.out.println("stock:");
System.out.println("coffee:  " + warehouse1.stock("coffee"));
System.out.println("sugar: " + warehouse1.stock("sugar"));

Warehouse warehouse2 = new Warehouse();
warehouse2.addProduct("milk", 3, 10);
warehouse2.addProduct("coffee", 5, 6);
warehouse2.addProduct("buttermilk", 2, 20);
warehouse2.addProduct("yogurt", 2, 20);

System.out.println("products:");

for (String product: warehouse2.products()) {
    System.out.println(product);
    
    Item item = new Item("milk", 4, 2);
System.out.println("an item that contains 4 milks has the total price of " + item.price());
System.out.println(item);
item.increaseQuantity();
System.out.println(item);

ShoppingCart cart = new ShoppingCart();
cart.add("milk", 3);
cart.add("buttermilk", 2);
cart.add("cheese", 5);
System.out.println("cart price: " + cart.price());
cart.add("computer", 899);
System.out.println("cart price: " + cart.price());

ShoppingCart cart1 = new ShoppingCart();
cart1.add("milk", 3);
cart1.print();
System.out.println("cart price: " + cart1.price() + "\n");

cart.add("buttermilk", 2);
cart.print();
System.out.println("cart price: " + cart1.price() + "\n");

cart.add("milk", 3);
cart.print();
System.out.println("cart price: " + cart1.price() + "\n");

cart.add("milk", 3);
cart.print();
System.out.println("cart price: " + cart1.price() + "\n");

Warehouse warehouse3 = new Warehouse();
    warehouse3.addProduct("coffee", 5, 10);
    warehouse3.addProduct("milk", 3, 20);
    warehouse3.addProduct("cream", 2, 55);
    warehouse3.addProduct("bread", 7, 8);

    Scanner scanner = new Scanner(System.in);

    Store store = new Store(warehouse3, scanner);
    store.shop("John");
}

}
    }