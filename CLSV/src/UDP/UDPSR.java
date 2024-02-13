package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSR {
	
	public static void main(String[ ] args) throws Exception
	{
		
		DatagramSocket ds= new DatagramSocket(9999);
		byte[] b1= new byte[1024];
		DatagramPacket dp= new DatagramPacket(b1,b1.length);
		ds.receive(dp);
		String s = new String(dp.getData());
	    System.out.println(s);
	    int num= Integer.parseInt(s.trim());
	    num=num+55;
	    System.out.println(num);
	    byte[] b2= String.valueOf(s).getBytes()	;
	    InetAddress ia= InetAddress.getLocalHost();
	    DatagramPacket dp1 = new DatagramPacket(b2,b2.length,ia,9999);
	    ds.send(dp1);
	    
	    
		
	}

}
