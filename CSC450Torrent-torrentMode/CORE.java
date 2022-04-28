import java.io.DataOutputStream;
import java.util.ArrayList;

public class CORE 
{
    private static ArrayList<DataOutputStream> theClientDOSsss= new ArrayList<DataOutputStream>();
    private static ArrayList<String> ClientIPs= new ArrayList<String>();
    public synchronized static void addDOS(DataOutputStream dos)
    {
        CORE.theClientDOSsss.add(dos);
    }
    public synchronized static void addIPs(String IP)
    {
        CORE.ClientIPs.add(IPs);
    }
    public synchronized static void broadCastIP();
    {
        for(int count = 0; count < ClientIPs.size(); count++)
        {
            
        }
    }
    public static synchronized void removeReceivers()
    {
        for(DataOutputStream dos : CORE.theClientDOSsss)
        {
            try {
                dos.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
            
        }
        CORE.theClientDOSsss.clear();
    }

    public synchronized static void broadCastByte(byte b)
    {
        try
        {
            for(DataOutputStream dos : CORE.theClientDOSsss)
            {
                dos.writeByte(b);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
