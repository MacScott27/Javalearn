import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//Prints the same as above
		for(String s: names) {
			System.out.println(s);
		}
	}
}