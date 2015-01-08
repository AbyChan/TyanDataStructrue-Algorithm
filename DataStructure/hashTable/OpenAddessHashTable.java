package hashTable;

class DataItem{
	private int key;
	
	public DataItem(int key) {
		this.key = key;
	}
	
	public int getKey(){
		return key;
	}
	
}

public class OpenAddessHashTable {
	private DataItem[] hasharray;
	private DataItem deletedItem;
	private int arraysize;
	private int useablecount;
	
	public OpenAddessHashTable(int arraysize) {
		this.arraysize = arraysize;
		hasharray = new DataItem[arraysize];
		deletedItem = new DataItem(-1);
		useablecount = this.arraysize;
	}
	
	public int hashFunc(int key){
		return key % arraysize;
	}
	
	public boolean insert(DataItem item) {
		if (useablecount != 0) {
			int key = item.getKey();
			int hashval = hashFunc(key);

			while (hasharray[hashval] != null){
				if(hasharray[hashval].getKey() == key)
					return false;
				else{
					if(hasharray[hashval].getKey() != -1){
						hashval++;
						hashval = hashFunc(hashval);
					}
					else{
						break;
					}
				}
			}
			hasharray[hashval] = item;
			useablecount--;
			return true;
		} else {
			return false;
		}
	}
	
	public DataItem deleteItem(int key){
		int hashval = hashFunc(key);
		while(hasharray[hashval] != null){
			if(hasharray[hashval].getKey() == key){
				DataItem temp = hasharray[hashval];
				hasharray[hashval] = deletedItem;
				useablecount++;
				return temp;
			}
			hashval++;
			hashval = hashFunc(hashval);
		}
		return null;
	}
	
	public DataItem find(int key){
		int hashval = hashFunc(key);		
		while(hasharray[hashval] != null){
			if(hasharray[hashval].getKey() == key)
				return hasharray[hashval];
			hashval++;
			hashval = hashFunc(hashval);
		}
		return null;
	}
	
	public void display(){
		System.out.println("Hashtable: ");
		for(int i=0; i<arraysize; i++){
			if(hasharray[i] != null && hasharray[i].getKey() !=-1)
				System.out.println(hasharray[i].getKey()+" ");
			else
				System.out.println("* ");
		}
	}
	
	public static void main(String[] args) {
		OpenAddessHashTable test = new OpenAddessHashTable(20);
		DataItem item1 = new DataItem(22);
		DataItem item2 = new DataItem(22);
		DataItem item3 = new DataItem(42);
		DataItem item4 = new DataItem(55);
		DataItem item5 = new DataItem(66);
		DataItem item6 = new DataItem(77);
		test.insert(item1);
		test.insert(item2);
		test.insert(item3);
		test.insert(item4);
		test.insert(item5);
		test.insert(item6);
		test.display();
	}
	

}
