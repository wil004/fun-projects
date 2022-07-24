package personal.fun.binaryTree;
import java.util.*;

public class Tree {
    // The root value of the tree
    Node root;

    // The nodes that have to be divided over the tree.
    List<Node> nodeToDivide;

    public Tree() {
        nodeToDivide = new ArrayList<>();
    }

    // The method that creates the tree.
    public void createTree(Integer[] leaves, Node root) {
        this.root = root;
        for(int i = 0; i < leaves.length; i++) {
            nodeToDivide.add(new Node(leaves[i]));
        }

        while (nodeToDivide.size() > 0) {
            buildTreeRootByRoot(root, nodeToDivide.get(0));
        }

    }

    // The method that builds the tree root by root.
    private void buildTreeRootByRoot(Node root, Node addingNumber) {
        /* This method works as following:
        * Let's say you have a root with a value of 50 and a addingNumber with the value 35.
        * If 50 already has a left value let's say 30 then the function calls itself again.
        * This time with it's left value (30) as the new root.
        * 35 is higher then 30 so it needs to be added to the right side of that number
        * if the right side is occupied by 32 the function calls again with a new root value of 32
        * and so on until there is a free spot were the addingNumber can be added too.
        * If number 32 has a free spot on the right then 35 will be added to it.
        * */
            if(addingNumber.getValue() < root.getValue() && root.getLeft() != null) {
                buildTreeRootByRoot(root.getLeft(), addingNumber);
            } else if (addingNumber.getValue() > root.getValue() && root.getRight() != null) {
                buildTreeRootByRoot(root.getRight(), addingNumber);
            } else if(addingNumber.getValue() < root.getValue()) {
                root.setLeft(addingNumber);
                nodeToDivide.remove(0);
            } else if(addingNumber.getValue() > root.getValue()) {
                root.setRight(addingNumber);
                nodeToDivide.remove(0);
            } else {
                nodeToDivide.remove(0);
            }
    }





    // For any questions feel free to contact me on my linkedIn: William Meester
}