package inventory;

public class Warehouse {
    private Product[] products;
    private int size;

    public Warehouse(int capacity) {
        products = new Product[capacity];
        size = 0;
    }

    public boolean addProduct(Product product) {
        if (size < products.length) {
            products[size++] = product;
            return true;
        }
        return false;
    }

    public Product getProductById(int id) {
        for (int i = 0; i < size; i++) {
            if (products[i].id == id) {
                return products[i];
            }
        }
        return null;
    }

    public void displayStock() {
        System.out.println("Current Stock in Warehouse:");
        for (int i = 0; i < size; i++) {
            System.out.println(products[i].id + " - " + products[i].name + " | Qty: " + products[i].quantity);
        }
    }
}
