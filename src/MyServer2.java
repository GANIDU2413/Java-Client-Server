import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer2 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9090);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str1 = "",str2="";

            while (!str1.equals("404")){
                str1= br.readLine();
                dout.writeUTF(str1);
                dout.flush();

                str2=din.readUTF();
                System.out.println("Client Says:v"+str2);
            }

            din.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
