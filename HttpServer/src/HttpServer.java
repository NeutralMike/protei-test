import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import java.io.IOException;


public class HttpServer {
    public static void main(String[] args) throws Throwable{
        ServerSocket ss = new ServerSocket(8080);
        while (true) {
            Socket s = ss.accept();
            System.err.println("Client accepted");
            OutputStream os = s.getOutputStream();
            String response = "HTTP/1.1 200 OK\r\n" +
                    "Content-Type: text/html\r\n" +
                    "Connection: close\r\n\r\n"+
                    "<html><body><h1>Hello World!</h1></body></html>";
            os.write(response.getBytes());
            s.close();
        }
    }
}
