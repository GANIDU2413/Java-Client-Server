import java.io.IOException;
import java.net.*;

public class DatagramPack {
    public static void main(String[] args) {
        try {
            DatagramSocket dataSock = new DatagramSocket();
            String str = "Hello Server! this is Datagram";
            InetAddress address = InetAddress.getByName("127.0.0.1");
            DatagramPacket dpack = new DatagramPacket(str.getBytes(),str.length(),address,9008);

            dataSock.send(dpack);

        } catch (SocketException e) {
            System.out.println(e.getMessage());
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
