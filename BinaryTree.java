
public class BinaryTree {
	protected node root;
public class node {
	int data;
	node left;
	node right; 
	public node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
		
}
public void testing() {
	
}

public static void main(String[] args) {
	
	
	 BTPrinting Z = new  BTPrinting();
	 searchBT Y = new  searchBT();
	aggregateBT X = new aggregateBT();
	Z.postOrder();
	Z.printRight();
	Y.containsGreater();
	Y.getLevel();
	X.countEvenNumber();
	X.findSum();
}

}
