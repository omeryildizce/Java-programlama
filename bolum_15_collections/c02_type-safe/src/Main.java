import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehiler = new ArrayList<String>();
        sehiler.add("Ankara");
        sehiler.add("İstanbul");
        sehiler.add("İzmir");
        sehiler.add("Adana");
        sehiler.add("Bursa");
        sehiler.remove("Adana");
        Collections.sort(sehiler);
        for (String sehir: sehiler)
        {
            System.out.println(sehir);
        }

    }
}