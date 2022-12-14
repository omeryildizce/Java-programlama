public class Main {
    public static void main(String[] args) {
        try
        {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println("1. Hata oluştu");
            System.out.println(exception);

        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("2. Hata oluştu");
            System.out.println(exception);

        }
        catch (Exception exception)
        {
            System.out.println("Logged :" + exception);
        }
        finally {
            System.out.println("Sistemi yeniden başlat");
        }

    }
}