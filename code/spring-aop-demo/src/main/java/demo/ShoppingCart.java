package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status) {
        // authentication
        // authorization
        // sanitize the data
        System.out.println("Checkout method from ShoppingCart called");
    }

    public int quantity() {
      return 2;
    }
}
