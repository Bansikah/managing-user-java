package optional;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers = createCustomerList(); // Replace with logic to create customers

        CustomerService service = new CustomerService(customers);

        // Find customer by ID (Optional handling)
        Long customerId = 1L;
        Optional<Customer> customerOptional = service.getCustomerById(customerId);

        if (customerOptional.isPresent()) {
            Customer customer = customerOptional.get();
            System.out.println("Customer name: " + customer.getName());

            // Calculate total order amount (Optional handling)
            Optional<Double> totalAmount = service.getTotalOrderAmount(customer);
            totalAmount.ifPresent(amount -> System.out.println("Total order amount: " + amount));
        } else {
            System.out.println("Customer not found!");
        }
    }

    private static List<Customer> createCustomerList() {
      List<Customer> customers = new ArrayList<>();
      customers.add(new Customer(1L, "Noel", List.of(new order(100.00), new order(200.00))));
      return customers;
        return new ArrayList<>();
    }
}

