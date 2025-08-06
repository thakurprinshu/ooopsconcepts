package inventory;

public class Order {
    private int[] productIds;
    private int[] quantities;
    private int size;

    public Order(int maxItems) {
        productIds = new int[maxItems];
        quantities = new int[maxItems];
        size = 0;
    }

    public void addItem(int productId, int quantity) {
        if (size < productIds.length) {
            productIds[size] = productId;
            quantities[size] = quantity;
            size++;
        }
    }

    public boolean processOrder(Warehouse warehouse) {
        // First check if all products are available
        for (int i = 0; i < size; i++) {
            Product p = warehouse.getProductById(productIds[i]);
            if (p == null || p.quantity < quantities[i]) {
                System.out.println("Order failed: Product ID " + productIds[i] + " is out of stock or insufficient quantity.");
                return false;
            }
        }

        // If all available, then reduce stock
        for (int i = 0; i < size; i++) {
            Product p = warehouse.getProductById(productIds[i]);
            p.quantity -= quantities[i];
        }

        System.out.println("Order processed successfully.");
        return true;
    }
}
