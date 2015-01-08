package sort;

public class SelectionSort {
	private long[] array;
	private int nElems;
	
	public SelectionSort(int max) {
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
	
	protected void swap(int one, int two){
		long tmp = array[one];
		array[one] = array[two];
		array[two] = tmp;
	}
	
	public void sort(){
		int min = 0;
		for(int i=0; i<nElems-1; i++){
			min = i;
			for(int j=i+1; j<nElems; j++)
				if(array[j] > array[min])
					min = j;
			swap(i, min);
		}
	}
	
	public static void main(String[] args) {
		SelectionSort test = new SelectionSort(10);
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
