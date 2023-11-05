import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client{
    public static void main(String[] args){
        try{
            Scanner myObj = new Scanner(System.in);
            Socket s = new Socket("localhost", 8800);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            String msg = "";
            while(msg!="bye"){
                msg = myObj.nextLine();
                dout.writeUTF(msg);
            }
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}