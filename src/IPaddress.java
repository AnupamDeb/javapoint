import java.net.InetAddress;
import java.net.UnknownHostException;


public class IPaddress {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress ip = InetAddress.getByName("www.facebook.com");
		
		System.out.println("Host Name: "+ip.getHostName());  
		System.out.println("IP Address: "+ip.getHostAddress());  
	}
}
