package Day_24;
import java.io.*;
import java.net.*
;public class UDPServer {
    public static void main(String[] args)throws IOException{
        DatagramSocket Server = new DatagramSocket(4160);
        byte []buf = new byte[256];

        DatagramPacket packet = new DatagramPacket(buf,buf.length);

        Server.receive(packet);
        String response = new String (packet.getData());
        System.out.println("Response Data : " + response);


    }
    
}
