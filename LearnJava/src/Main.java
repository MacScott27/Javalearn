import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");
		
		System.out.println(names.pop());
		System.out.println(names.pop());
		System.out.println(names.pop());
	}
}