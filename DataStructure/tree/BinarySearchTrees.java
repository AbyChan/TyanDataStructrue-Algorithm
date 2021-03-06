

class BinarySearchTrees {
    private int number;
    private Node root;

    public static void main(String args[]){
	BinarySearchTrees bst = new BinarySearchTrees(5, 5);
	bst.insert(1, 3);
	System.out.println(bst.search(1));
    }

    public BinarySearchTrees(int key, int value){
	Node root = new Node(key, value);
	this.root = root;
    }

    public int insert(int key, int value){
	this.number++;
	Node parent = root;
	while(true){
	    if(parent.getKey() == key){
		int temp = parent.getValue();
		parent.setValue(value);
		return temp;
	    } else if(parent.getKey() > key){
		if(parent.getLeft() == null){
		    Node node = new Node(key, value);
		    parent.setLeft(node);
		    return -1;
		} else {
		    parent = parent.getLeft();
		    continue;
		}
	    } else {
		if(parent.getRight() == null){
		    Node node = new Node(key, value);
		    parent.setRight(node);
		    return -1;
		} else {
		    parent = parent.getRight();
		    continue;
		}
	    }
	}
    }
    
    public int search(int key){
	return searchNode(root, key);
    }
    public int searchNode(Node parent, int key){
	if(parent.getKey() == key)
	    return parent.getValue();
	else if(parent.getKey() > key)
	    return searchNode(parent.getLeft(), key);
	else
	    return searchNode(parent.getRight(), key);
    }
    public void showNumber(){
	System.out.println(this.number);
    }

    class Node{
	private int key;
	private int value;
	private Node left;
	private Node right;

	public Node getLeft(){
	    return this.left;
	}
	public void setLeft(Node left){
	    this.left = left;
	}
	public Node getRight(){
	    return this.right;
	}
	public void setRight(Node right){
	    this.right = right;
	}
	public Node(int key, int value){
	    this.key = key;
	    this.value = value;
	}
	
	public int getKey(){
	    return this.key;
	}
	public void setKey(int key){
	    this.key = key;
	}
	public int getValue(){
	    return this.value;
	}
	public void setValue(int value){
	    this.value = value;
	}
    }
}
