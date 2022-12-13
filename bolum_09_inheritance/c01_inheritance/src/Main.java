public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.firstname = "ali";
        employee.firstname = "akif";
        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        employeeManager.List();
        customerManager.List();

    }
}