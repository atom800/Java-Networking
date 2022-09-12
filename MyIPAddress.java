import java.net.*;
public class MyIPAddress
{
    public static void main(String []rgs)
    {
        try
        {
            InetAddress myIP= InetAddress.getLocalHost();
            System.out.println("IP Address: "+myIP.getHostAddress());
            System.out.println("Device Name: "+myIP.getHostName());
        }
        catch (UnknownHostException e)
        {
            System.out.println(""+e);
        }
    }

}
