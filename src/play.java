
public class play {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s = new stack();
			
		s.putStack(4);
		s.putStack(3);
		s.putStack(2);
		s.putStack(1);
		s.putStack(5);
		s.putStack(6);
		
		s.showStack();
		
		s.getStack();
		
		s.showStack();
		
		Heap h = new Heap(5);
		
		h.putHeap(5);
		h.putHeap(4);
		h.putHeap(3);
		h.putHeap(2);
		h.putHeap(1);
		
		h.showHeap();
		
		h.getHeap();
		
		h.showHeap();
		
		h.putHeap(5);
		
		h.showHeap();
	}

}
