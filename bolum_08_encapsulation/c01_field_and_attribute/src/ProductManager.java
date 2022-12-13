public class ProductManager {
    public void add(Product product)
    {
        System.out.println("Ürün Eklendi");
    }
    public void add(int id, String name, String description, int stockAmount, double price)
    {
        System.out.println("Ürün Eklendi");
    }
    public void remove(Product product)
    {
        System.out.println("Ürün Silindi");
    }
    public void update(Product product)
    {
        System.out.println("Ürün Güncellendi");
    }
}
