package sort;

public class BubbleSort {
	private long[] array;
	private int nElems;
	
	public BubbleSort(int max) {
		array = new long[max];
		nElems = 0;
	}
	
	public void insert(long newElem){
		array[nElems] = newElem;
		nElems++;
	}
	
	public void display(){
		for(int i=0; i<nElems; i++){
			System.out.println(array[i]);
		}
	}
	
	public void sort(){
		for(int i=nElems-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(array[j] < array[j+1])
					swap(j, j+1);
			}
		}
	}
	
	protected void swap(int last, int next){
		long tmp = array[last];
		array[last] = array[next];
		array[next] = tmp;
	}
	
	public static void main(String[] args) {
		BubbleSort test = new BubbleSort(10);
		test.insert(5);
		test.insert(3);
		test.insert(2);
		test.insert(8);
		test.insert(34);
		test.insert(1);
		test.insert(9);
		test.insert(11);
		test.insert(10);
		test.insert(33);
		test.sort();
		test.display();
	}

}
