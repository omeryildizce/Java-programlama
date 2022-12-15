import java.sql.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            String sql = "delete from customer id='10' ";


            int result = statement.executeUpdate();
            System.out.println("Kayıt güncellendi: "+ result);

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            helper.showErorMesssage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from customer");
            ArrayList<Customer> customers = new ArrayList<Customer>();
            while (resultSet.next())
            {
                customers.add(new Customer(resultSet.getNString("first_name"),resultSet.getString("last_name"),resultSet.getString("email")));

            }
            System.out.println(customers.size());
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            helper.showErorMesssage(exception);
        } finally {
            connection.close();
        }

    }
    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            String sql = "insert into customer (first_name,last_name, email) values (?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Ömer");
            statement.setString(2,"YILDIZ");
            statement.setString(3,"omeryildiz@mail.com");

            int result = statement.executeUpdate();
            System.out.println("Kayıt eklendi: "+ result);

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            helper.showErorMesssage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
    public static void updateData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            String sql = "update customer set email='mail' where id = 102";


            int result = statement.executeUpdate();
            System.out.println("Kayıt güncellendi: "+ result);

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            helper.showErorMesssage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
}