package Database;//import java.util.ArrayList;
//import java.util.List;
//
//public class  Database {
////    public static List<Customer> customers = new ArrayList<>();
////    public static List<Driver> drivers = new ArrayList<>();
////    public static List<Booking> bookings = new ArrayList<>();
//}
//
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Database {
//    public Database () {
//        super();
//    }
//
//    public static String AthiqID = "jdbc:mysql://localhost:3306/vehicle";
//    public static String loginName = "root";
//    public static String loginPwd  = "";
//
//    public static void main(String [] args){
//        getConnection();
//    }
//
//    static {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//        }
//    }
//
//    public static Connection getConnection() {
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(AthiqID, loginName, loginPwd);
//            System.out.println("Database is working.");
//        } catch (SQLException e) {
//        }
//        return conn;
//}
//}

//import java.util.ArrayList;
//import java.util.List;
//
//public class Database {
//    private List<String> bookings = new ArrayList<>();
//
//    public void addBooking(String booking) {
//        bookings.add(booking);
//    }
//
//    public List<String> getBookings() {
//        return bookings;
//    }
//}



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public Database() {
        super();
    }

    public static String ID = "jdbc:mysql://localhost:3306/vehicle";
    public static String loginName = "root";
    public static String loginPwd  = "";

    public static void main(String [] args){
        getConnection();
    }

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(ID, loginName, loginPwd);
            System.out.println("WORK.");
        } catch (SQLException e) {
        }
        return conn;
    }
}