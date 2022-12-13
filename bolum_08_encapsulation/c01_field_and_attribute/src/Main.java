public class Main {
    public static void main(String[] args) {

        Product product = new Product(10,"laptop","asus laptop", 5000, 3);
       /* product.name = "Laptop";
        product.id = 1;
        product.description = "Asus laptop";
        product.price = 5000;
        product.stockAmount = 3;
        product.getId();
        product.setId(15);
        product.setName("Laptop");
        */
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());
    }
}