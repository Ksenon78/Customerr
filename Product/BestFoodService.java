package Customer.com.customer.Product;

import Customer.com.customer.Entity.FoodEntity;
import org.springframework.stereotype.Service;

@Service
public class BestFoodService {

    public FoodEntity getBestFood() {
        // Implementation to get the best food
        return new FoodEntity("Pizza");
    }

    public FoodEntity getNullFood() {
        // Implementation for null food
        return null;
    }
}
