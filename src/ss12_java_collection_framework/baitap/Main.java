package ss12_java_collection_framework.baitap;

public class Main {
        public static void main(String[] args) {
            ProductManager manager = new ProductManager();

            manager.addProduct(new Product(1, "Laptop", 1000));
            manager.addProduct(new Product(2, "Phone", 800));
            manager.addProduct(new Product(3, "Tablet", 600));
            manager.addProduct(new Product(4, "Camera", 500));

            System.out.println("Danh sách sản phẩm:");
            manager.displayProducts();

            System.out.println("\nTìm kiếm sản phẩm theo tên 'phone':");
            manager.searchProductByName("Phone");

            System.out.println("\nSắp xếp sản phẩm tăng dần theo giá:");
            manager.sortProductsAscendingByPrice();
            manager.displayProducts();

            System.out.println("\nSắp xếp sản phẩm giảm dần theo giá:");
            manager.sortProductsDescendingByPrice();
            manager.displayProducts();
        }

}
