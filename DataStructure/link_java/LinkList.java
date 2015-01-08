package link;

class Link{
	public int key;
	public double data;
	public Link next;
	
    public Link(int key, double data) {
		this.key = key;
		this.data = data;
	}
    
    public void display(){
    	System.out.println("{key="+key+" data="+data+"} ");
    }
}

/////////////////////////////////////////////////////////////////

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty(){
		return(first==null);
	}
	
	public void insertfirst(int key, double data){
		Link newLink = new Link(key, data);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deletefirst(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void display(){
		if(first != null){
			Link current = first;
			do{
				current.display();
				current = current.next;
			}while(current != null);
		}else{
			System.out.println("LinkList is empty");
		}
	}
	
	public static void main(String[] args) {
		LinkList test = new LinkList();
		test.insertfirst(2, 3.3);
		test.insertfirst(3, 4.3);
		test.insertfirst(4, 5.3);
		test.insertfirst(5, 6.3);
		test.deletefirst();
		test.display();
	}
}
