import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class URLDemo2
{
	public static void main(String[] args) throws IOException {
		
		URL url=new URL("http://www.javatpoint.com/java-tutorial"); 
		
		System.out.println("Protocol : "+url.getProtocol());
		System.out.println("Server : "+url.getHost());
		System.out.println("File Name: "+url.getFile()); 
		
		
	}
}