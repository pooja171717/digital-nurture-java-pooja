import java.io.*;
import java.net.*;

class Server
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket ss =
            new ServerSocket(5000);

            System.out.println("Server Started");

            Socket s = ss.accept();

            DataInputStream dis =
            new DataInputStream(s.getInputStream());

            String msg = dis.readUTF();

            System.out.println("Client: " + msg);

            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}