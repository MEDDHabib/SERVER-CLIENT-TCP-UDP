package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.rmi.AccessException;

public class UDPCL {
	public static void main (String[] args	) throws Exception
	{
		
		DatagramSocket ds= new DatagramSocket();
		int x= 40; // my data
		byte[] b =String.valueOf(x).getBytes();
		InetAddress ia=InetAddress.getLocalHost();
		DatagramPacket dp=new DatagramPacket(b,b.length,ia,9999);
		ds.send(dp);
		
		
		byte[] b1= new byte[1111];
		DatagramPacket dp1= new DatagramPacket(b,b.length);
		
		ds.receive(dp1);
		
		String s= new String(dp1.getData());
		System.out.println("result is:" +s);
		
	}

}
