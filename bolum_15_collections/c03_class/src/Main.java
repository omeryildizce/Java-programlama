import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Engin","Kaya"));
        customers.add(new Customer(2,"Ömer","Yıldız"));
        customers.add(new Customer(3,"Ali","Kaya"));

        for (Customer customer:customers){
            System.out.println(customer.firstname +" " + customer.lastname);
        }

    }
}