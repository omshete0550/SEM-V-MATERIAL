import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args){
        try{
			System.out.println("Server Started..");
            ServerSocket ss = new ServerSocket(8800);
            Socket s = ss.accept();
			System.out.println("Server is listening on 6666");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = " ";
            while(!str.equals("bye")) {
                str = dis.readUTF();
                System.out.println("Message: " + str);
            }
            ss.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}