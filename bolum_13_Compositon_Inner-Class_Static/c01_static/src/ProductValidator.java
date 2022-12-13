public class ProductValidator {
    public ProductValidator()
    {
        System.out.println("Yapıcı blok");
    }
    static {
        System.out.println("Statik blok");
    }
    public static boolean isValid(Product product)
    {
        if (product.price>0 && !product.name.isEmpty())
        {
            return  true;
        }
        else return false;
    }
    public void proc()
    {

    }
}
