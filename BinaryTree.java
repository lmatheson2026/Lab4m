
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
		aggregateBT X = new aggregateBT();
		BTPrinting Y = new BTPrinting();
		 searchBT Z = new  searchBT();
		 Z.testing();
		Y.testing();
		X.testing();
	}

}


