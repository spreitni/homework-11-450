import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.Scanner;
public class TrackerThread extends Thread
{
    private Socket theClient;
    public TrackerThread(Socket theClient)
    {
        this.theClient = theClient;

    }

    public void run()
    {
        System.out.println("Tracker Thread Started....");
        String clientIP= (Inet4Address.getLocalHost().getHostAddress().toString());
        CORE.addIPs(clientIP);
        //get the IP address of our connect client
        //add it to our list of peers, then broadcast
        //the current list of peers to this connected client
        //as well as all previous clients
    }
}
