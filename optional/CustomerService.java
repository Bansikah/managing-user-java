package optional;

import java.util.List;
import java.util.Optional;

public class CustomerService {

    private List<Customer> customers; // Assuming a list of customers

    public CustomerService(List<Customer> customers) {
        this.customers = customers;
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst();
    }

    public Optional<Double> getTotalOrderAmount(Customer customer) {
        if (customer == null) { // Optional approach for null customer
            return Optional.empty();
        }
        return Optional.of(customer.getOrders().stream()
                .mapToDouble(Order::getPrice)
                .sum());
    }


}
