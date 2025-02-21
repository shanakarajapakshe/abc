//import com.sun.net.httpserver.HttpExchange;
//import com.sun.net.httpserver.HttpHandler;
//
//import java.io.IOException;
//import java.io.OutputStream;
//
//public class DriverHandler implements HttpHandler {
//    @Override
//    public void handle(HttpExchange exchange) throws IOException {
//        if ("GET".equals(exchange.getRequestMethod())) {
//            String response = Database.drivers.toString();
//            exchange.sendResponseHeaders(200, response.length());
//            OutputStream os = exchange.getResponseBody();
//            os.write(response.getBytes());
//            os.close();
//        }
//    }
//}