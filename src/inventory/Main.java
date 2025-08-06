package inventory;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(5);


        warehouse.addProduct(new Product(101, "Laptop", 50000, 10));
        warehouse.addProduct(new Product(102, "Mouse", 500, 20));
        warehouse.addProduct(new Product(103, "Keyboard", 800, 15));

        warehouse.displayStock();

        Order order = new Order(3);
        order.addItem(101, 2);  // Laptop
        order.addItem(102, 1);  // Mouse

        order.processOrder(warehouse);
        warehouse.displayStock();


        Order secondOrder = new Order(2);
        secondOrder.addItem(103, 20);

        secondOrder.processOrder(warehouse);
        warehouse.displayStock();
    }
}
