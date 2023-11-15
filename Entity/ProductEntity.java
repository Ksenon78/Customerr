package Customer.com.customer.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    private Long id;
    private String name;
    private Long service;
    private String food;
}
