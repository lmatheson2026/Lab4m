
public class aggregateBT extends BinaryTree {
@Override
	public void testing() {
    root = new node(5);
    root.left = new node(3);
    root.left.right = new node(4);
    root.right = new node(7);
    root.right.left = new node(6);
    root.right.right = new node(8);
    System.out.println(findSum());
	System.out.println(countEvenNumber());

	}

	public int findSum() {
return findSumHelper(root);
	}

		public int findSumHelper(node temp) {
		    if (temp == null)
		        return 0;

		    int leftSum = findSumHelper(temp.left);
		    int rightSum = findSumHelper(temp.right);

		    return leftSum + rightSum + temp.data;
		
	}


	public int countEvenNumber() {
return countEvenNumberHelper(root);
	}

	public int countEvenNumberHelper(node temp) {
		 int currentNodeCount = 0;
		 if (temp == null)
		        return 0;

		    int t1 = countEvenNumberHelper(temp.left);
		    int t2 = countEvenNumberHelper(temp.right);

		    // Check if the current node's data is even
		    if(temp.data % 2 == 0)
		     currentNodeCount += 1;

		    return t1 + t2 + currentNodeCount;
	}
}

