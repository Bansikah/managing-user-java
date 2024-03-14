package optional;

import java.util.List;
import java.util.Optional;

public class Customer {
    private Long id;
    private String name;

    private List<Order> order;

    public Customer(Long id, String name, List<Order> orders) {
        this.id = id;
        this.name = name;
    }

public Customer(List<Order> orders){
        this.order = orders;
}

public List<Order> getOrder() {
        return order;
}
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Optional<Object> getOrders() {
        return Optional.empty();
    }
}
