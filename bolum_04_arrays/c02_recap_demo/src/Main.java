public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2,1.3,1.4, 4.3,5.6};
        double total = 0;
        double max = myList[0];
        double min = myList[0];

        for (double number:myList)
        {
            if (max < number) {
                max = number;
            }
            if (min > number)
            {
                min = number;
            }
            total += number;
            System.out.println(number);
        }
        System.out.println("Toplam = " + total);
        System.out.println("Maksimum = "+ max);
        System.out.println("Minumum = " + min);

    }
}