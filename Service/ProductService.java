package Customer.com.customer.Service;

import Customer.com.customer.Entity.FoodEntity;
import Customer.com.customer.Entity.ProductEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    @Override
    public ProductEntity getProduct() {
        // Implementation for getting a product
        return new ProductEntity(1L, "Doom", 9999L, "Best");
    }

    @Override
    public ProductEntity getNullProduct() {
        // Implementation for getting a null product
        return null;
    }
}
