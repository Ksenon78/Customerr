package Customer.com.customer.Controller;

import Customer.com.customer.Entity.FoodEntity;
import Customer.com.customer.Product.BestFoodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final BestFoodService bestFoodService;

    public CustomerController(BestFoodService bestFoodService) {
        this.bestFoodService = bestFoodService;
    }

    @GetMapping("/getPizza")
    public FoodEntity getPizza() {
        return bestFoodService.getBestFood();
    }

    @GetMapping("/getNull")
    public FoodEntity getNull() {
        return bestFoodService.getNullFood();
    }
}
