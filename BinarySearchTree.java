/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author me
 */
import java.util.Stack;
public class BinarySearchTree {
    


/**
 * Java Program to implement a binary search tree. A binary search tree is a
 * sorted binary tree, where value of a node is greater than or equal to its
 * left the child and less than or equal to its right child.
*/

    private static class Node {
        private int data;
        private Node left, right;

        public Node(int value) {
            data = value;
            left = right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    /**
     * Java function to check if binary tree is empty or not
     * Time Complexity of this solution is constant O(1) for
     * best, average and worst case. 
     * 
     * @return true if binary search tree is empty
     */
    public boolean isEmpty() {
        return null == root;
    }

    
    /**
     * Java function to return number of nodes in this binary search tree.
     * Time complexity of this method is O(n)
     * @return size of this binary search tree
     */
    public int size() {
        Node current = root;
        int size = 0;
        Stack<Node> stack = new Stack<Node>();
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                size++;
                current = stack.pop();
                current = current.right;
            }
        }
        return size;
    }


    /**
     * Java function to clear the binary search tree.
     * Time complexity of this method is O(1)
     */
    public void clear() {
        root = null;
    }

}
