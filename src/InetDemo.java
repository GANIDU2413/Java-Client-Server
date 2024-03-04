import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo
{
    public static void main(String[] args) {
        try {
            InetAddress ip=InetAddress.getByName("www.tec.ruh.ac.lk");

            System.out.println("Host Address: "+ip.getHostAddress());
            System.out.println("Is a local address : "+ip.isAnyLocalAddress());
            System.out.println("Is Linked to a local address: "+ip.isLinkLocalAddress());
            System.out.println("loop back address: "+ip.isLoopbackAddress());
            System.out.println("mulicast global scope:"+ip.isMCGlobal());
            System.out.println("Reachabl: "+ip.isReachable(200));
            System.out.println("Site-local address"+ip.isSiteLocalAddress());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}