public class Heap {
	private int h[];
	int count=0;
	int size=0;
	
	Heap(int number){
		size=number;
		h = new int[number];		
	}
	
	void putHeap(int number){
		if(count<size){
			h[count] = number;
			count++;
		} else{
			System.out.println("입력받을 수 있는 공간이 부족합니다.");
		}		
	}
	
	int getHeap(){
		int result = h[0];
		count--;
		System.arraycopy(h, 1, h, 0, count);
		h[count]=0;
		return result;
	}
	
	void showHeap(){
		System.out.println("\n**************************************");
		for(int i=0; i<h.length; i++){
			System.out.println("Heap["+i+"] = "+h[i]);
		}
	}
	
	
}
