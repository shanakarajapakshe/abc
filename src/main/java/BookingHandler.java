////import com.sun.net.httpserver.HttpExchange;
////import com.sun.net.httpserver.HttpHandler;
////
////import java.io.IOException;
////import java.io.OutputStream;
////
////public class BookingHandler implements HttpHandler {
////    @Override
////    public void handle(HttpExchange exchange) throws IOException {
////        if ("GET".equals(exchange.getRequestMethod())) {
////            String response = Database.bookings.toString();
////            exchange.sendResponseHeaders(200, response.length());
////            OutputStream os = exchange.getResponseBody();
////            os.write(response.getBytes());
////            os.close();
////        }
////    }
////}
//
//import Database.Database;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet("/booking")
//public class BookingHandler extends HttpServlet {
//
//    private Database db = new Database();
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//
//        try {
//            // Retrieve booking data from request parameters
//            String bookingData = request.getParameter("booking");
//
//            if (bookingData == null || bookingData.isEmpty()) {
//                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//                response.getWriter().write("{\"error\": \"Booking data is required\"}");
//                return;
//            }
//
//            // Add booking to the database
//            db.addBooking(bookingData);
//
//            // Send success response
//            PrintWriter out = response.getWriter();
//            out.write("{\"message\": \"Booking added successfully\"}");
//            out.flush();
//            out.close();
//
//        } catch (Exception e) {
//            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//            response.getWriter().write("{\"error\": \"An error occurred\"}");
//        }
//    }
//}
