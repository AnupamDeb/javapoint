import java.util.ArrayList;


public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		System.out.println("initial size of al : "+al.size());
		
		
		al.add("F");
		al.add("tht");
		al.add("ghg");
		al.add("gf");
		al.add(2, "ANUPAM");
		
		System.out.println("Size of al after additions: " +al.size());
		// Display the array list.
		System.out.println("Contents of al: " + al);
		
		al.remove("F");
		al.remove(2);
		
		System.out.println("Size of al after deletions: " +al.size());
		System.out.println("Contents of al: " + al);
	}
}
