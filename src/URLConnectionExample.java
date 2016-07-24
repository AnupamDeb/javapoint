import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample
{
	public static void main(String[] args) throws IOException {
		
		URL url=new URL("http://www.javatpoint.com/java-tutorial"); 
		URLConnection urlC=url.openConnection();
		
		InputStream stream= urlC.getInputStream();
		
		int i;
		while((i=stream.read())!=-1)
		{
			System.out.print((char)i);
		}
				
			
		
	}
}