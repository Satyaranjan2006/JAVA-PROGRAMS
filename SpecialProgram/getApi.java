package SpecialProgram;

import java.net.InetAddress;

public class getApi {
    public static void main(String args[]) throws Exception
    {
        InetAddress IP = InetAddress.getLocalHost();
        System.out.println("IP of my system is := "+IP.getHostAddress());
    }    
}
