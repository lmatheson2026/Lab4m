
public class BTPrinting extends BinaryTree {
    /***
     * 
     *  @author dean casbay
     *  
     *  subtask #1
     *  
     *  public void postOrder(): this method prints the BinaryTree with Post-Order traverse 
     *  
     *  public void printRight(): this method prints nodes on the rightmost (most right-hand side) 
     *  path of a binary tree, starting from the lowest level all the way to the root. Override the 
     *  testing method, provide a sample tree, and call the two methods above in this method
     */

    // Constructor to initialize the root node
    public BTPrinting(Integer data) {
        root = new node(data);
    }

    private void postOrderTraversal(node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);
    }
    public void postOrder() {
        postOrderTraversal(root);
    }


    private void printRightPath(node node) {
        if (node != null) {
            printRightPath(node.right);
            System.out.println(node.data);
        }
    }
    public void printRight() {
        printRightPath(root);
    }


    public static void Testing() {
        BTPrinting tree = new BTPrinting(1);

        tree.root.left = tree.new node(2);
        tree.root.right = tree.new node(3);
        tree.root.left.left = tree.new node(4);
        tree.root.left.right = tree.new node(5);
        tree.root.right.left = tree.new node(6);
        tree.root.right.right = tree.new node(7);

        /* visual of sample tree I came up with:
         * 
         *        1
         *       / \
         *      2   3
         *     / \ / \
         *    4  5 6  7
         *    
         */

        System.out.println("Post-Order Traversal: ");
        tree.postOrder();

        System.out.println("\nRightmost Path: ");
        tree.printRight();
    }

    public static void main(String[] args) {
        Testing();
    }
}
