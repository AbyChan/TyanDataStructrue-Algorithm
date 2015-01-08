package sort;

public class InsertSort {
	private long[] array;
	private int nElems;
	
	public InsertSort(int max) {
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
		for(int out=1; out<nElems; out++){
			long temp = array[out];
			int in = out;
			while(in>0 && array[in-1]>=temp){
				array[in] = array[in-1];
				in--;
			}
			array[in] = temp;
		}	
	}
	
	public static void main(String[] args) {
		InsertSort test = new InsertSort(10);
		test.insert(11);
		test.insert(22);
		test.insert(33);
		test.insert(44);
		test.insert(55);
		test.insert(66);
		test.insert(9);
		test.insert(77);
		test.insert(10);
		test.insert(33);
		test.sort();
		test.display();
	}

}
