package IPAddressFinding;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPandHostName {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress IP = InetAddress.getLocalHost();
        System.out.println(IP);

        String hostName = IP.getHostName();
        System.out.println(hostName);

    }
}
