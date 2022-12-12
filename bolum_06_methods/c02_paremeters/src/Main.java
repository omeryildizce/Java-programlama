public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = city();
        System.out.println(yeniMesaj);
        int sum = add(10, 7);
        System.out.println(sum);
        System.out.println(add(10));
        System.out.println(add(10, 7, 3, 17, 21, 19));

    }

    public static void insert() {
        System.out.println("Eklendi.");
    }

    public static void delete() {
        System.out.println("Silindi.");

    }

    public static void update() {
        System.out.println("Güncellendi.");

    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int add(int... sayilar) {
        int sum = 0;
        for (int i = 0; i < sayilar.length; i++) {
            sum += sayilar[i];
        }
        return sum;
    }

    public static String city() {
        return "Ankara";
    }
}