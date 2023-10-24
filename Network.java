import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

class Network {
    public static void main(String args[])  {
        System.out.println("Hello world");

        InetAddress googleAddress;
        try {
            googleAddress = InetAddress.getByName("www.google.com");
            System.out.println(googleAddress);
            // output
            // www.google.com/142.250.192.68

            System.out.println("HOST NAME      : " + googleAddress.getHostName());
            System.out.println("HOST ADDRESS   : " + googleAddress.getHostAddress());
            System.out.println("HOST CANONICAL : " + googleAddress.getCanonicalHostName());
            System.out.println("ADDRESS        : " + googleAddress.getAddress());
            System.out.println("LOCAL HOST     : " + InetAddress.getLocalHost());
            googleAddress.isReachable(1000);

            // output
            // HOST NAME      : www.google.com
            // HOST ADDRESS   : 142.250.183.4
            // HOST CANONICAL : bom07s30-in-f4.1e100.net
            // ADDRESS        : [B@1b28cdfa
            // LOCAL HOST     : LAPTOP-11SJC6KI/192.168.62.11
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}