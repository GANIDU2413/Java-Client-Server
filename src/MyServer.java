import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9898);
            Socket s = ss.accept();

            DataInputStream din = new DataInputStream(s.getInputStream());
            String string = (String) din.readUTF();
            System.out.println(string);
            ss.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
