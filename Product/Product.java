package Customer.com.customer.Product;

import org.springframework.http.server.DelegatingServerHttpResponse;

public class Product {
    String Yemek = "Köfte";

    String BestFoodService = "BestFoodService";
    int priceToday = 12;
    double priceYesterday = 11.5;

    boolean fiyatDüştü = false;

    String artış = "$";

    public void fiyatKontrol() {
        if (priceToday > priceYesterday) {
            artış = "more_$";
            System.out.println(artış);
        } else if (priceToday == priceYesterday) {
            artış = "equal_$";
            System.out.println(artış);
        } else {
            artış = "less_$";
            System.out.println(artış);
        }
    }
}


