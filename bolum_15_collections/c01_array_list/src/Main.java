import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int[] sayilar1 = new int[]{1,2,3};
        sayilar1 = new int[4];
        System.out.println(sayilar1[0]);

        ArrayList sayilar = new ArrayList();
        System.out.println(sayilar.size());
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ömer");
        System.out.println(sayilar.size());
        System.out.println(sayilar.get(2));
        sayilar.set(0,100);
        System.out.println(sayilar.get(0));
        sayilar.remove(0);
        System.out.println(sayilar.get(0));
        sayilar.add("45");
        System.out.println("------------------");
        for (Object sayi:sayilar)
            System.out.println(sayi);

        sayilar.clear();

    }
}