package optional;

public class Order {
    private Long id;
    private String product;
    private double price;

    public Order(Long id, String product, double price) {
        this.id = id;
        this.product = product;
        this.price = price;
    }

    public static double getPrice(Object o) {
        return ((Order) o).price;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


}
