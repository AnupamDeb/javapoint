import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class URLhttpConnection {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("http://www.javatpoint.com/java-tutorial");
		
		HttpURLConnection huc= (HttpURLConnection) url.openConnection();
		
		for(int i=1;i<=9;i++)
		{
			System.out.println(huc.getHeaderFieldKey(i)+" : "+huc.getHeaderField(i));
		}
		huc.disconnect();
	}
}
