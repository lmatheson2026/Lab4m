/**
 * This class extends the BinaryTree class and provides methods to
 * find the sum of all nodes, and counts all even numbers.
 */
public class aggregateBT extends BinaryTree {

    /**
     * Creates sample tree and tests both methods
     */
    @Override
    public void testing() {
        root = new node(5);
        root.left = new node(3);
        root.left.right = new node(4);
        root.right = new node(7);
        root.right.left = new node(6);
        root.right.right = new node(8);

        System.out.println("Sum of all nodes: " + findSum());
        System.out.println("Count of even nodes: " + countEvenNumber());
    }

    /**
     * Finds the sum of all nodes in the tree
     *
     * @return The sum of all nodes
     */
    public int findSum() {
        return findSumHelper(root);
    }

    /**
     * Recursive helper method to find the sum of nodes in the tree
     *
     * @param temp  current node 
     * @return The sum of nodes 
     */
    private int findSumHelper(node temp) {
        if (temp == null)
            return 0;

        int leftSum = findSumHelper(temp.left);
        int rightSum = findSumHelper(temp.right);

        return leftSum + rightSum + temp.data;
    }

    /**
     * Counts the number of even nodes in the tree.
     *
     * @return The count of even nodes.
     */
    public int countEvenNumber() {
        return countEvenNumberHelper(root);
    }

    /**
     * helper method to count the number of even nodes in the tree.
     *
     * @param temp current node being used
     * @return The count of even nodes 
     */
    private int countEvenNumberHelper(node temp) {
        int currentNodeCount = 0;

        if (temp == null)
            return 0;

        int t1 = countEvenNumberHelper(temp.left);
        int t2 = countEvenNumberHelper(temp.right);

        // Check if the current node's data is even
        if (temp.data % 2 == 0)
            currentNodeCount += 1;

        return t1 + t2 + currentNodeCount;
    }
}