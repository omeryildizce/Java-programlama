import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> sozluk = new HashMap<String,String>();
        sozluk.put("door", "kapı");
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer", "bilgisayar");
        System.out.println(sozluk);
        System.out.println(sozluk.get("table"));
        sozluk.size();
        for (String key: sozluk.keySet())
            System.out.println(key+"- -"+ sozluk.get(key));
        sozluk.remove("table");
        sozluk.clear();
    }
}