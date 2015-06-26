import java.util.ArrayList;

public class stack {
	int num, size;
	int count = 0;
	ArrayList<Integer> s = new ArrayList<Integer>();

	void putStack(int num) {
		s.add(num);		
		count++;
	}

	int getStack() {
		int result = s.get(--count);
		System.out.println("\n**************************************");
		System.out.println("getStack = " + result);
		
		s.remove(count);
		count--;
		return result;
	}

	void empty() {
		s.isEmpty();
	}

	void showStack() {
		System.out.println("\n**************************************");
		for (int i = 0; i < s.size(); i++) {			
			System.out.println("Stack[" + i + "] = " + s.get(i));
		}
	}
}
