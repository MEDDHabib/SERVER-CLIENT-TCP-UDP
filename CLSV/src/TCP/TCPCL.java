package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPCL {
	public static void main (String[] args) throws UnknownHostException, IOException
	{
		Socket s= new Socket("localhost",4999);
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("work?");
		pr.flush();
		
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		
		String str = bf.readLine();
		System.out.println("server: "+str);
		
		
		
	}

}
