import java.util.ArrayList;
import java.util.Iterator;


public class CollectionArrayList {

	public static void main(String[] args) {
		ArrayList<String>  al=new ArrayList<String>();
		
		al.add("anupam");
		al.add("anupam");
		al.add("akash");
		al.add("shahab");
		al.add("badhon");
		
		Iterator itr=al.iterator(); //getting iterator from arrayList to traverse element
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
