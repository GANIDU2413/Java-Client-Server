import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSock {
    public static void main(String[] args) {
        try {
            DatagramSocket dsock = new DatagramSocket(9008);
            byte[] buff = new byte[1024];
            DatagramPacket datapack = new DatagramPacket(buff,1024);
            dsock.receive(datapack);
            String str = new String(datapack.getData(),0,datapack.getLength());
            System.out.println(str);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
