import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSock {
    public static void main(String[] args) {
        try {
            DatagramSocket dsock = new DatagramSocket(9091);
            byte[] buff = new byte[1024];
            DatagramPacket datapack = new DatagramPacket(buff,1024);
            String str = new String(datapack.getData(),0,datapack.getLength());
            System.out.println(str);
            dsock.close();

        } catch (SocketException e) {
            System.out.println(e.getMessage());
        }
    }
}
