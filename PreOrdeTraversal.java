/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author me
 */
public class PreOrdeTraversal {
    public void preOrderWithoutRecursion() {
        Stack<TreeNode> nodes = new Stack<>(); 
        
        nodes.push(root); while (!nodes.isEmpty()) {
            TreeNode current = nodes.pop(); 
            System.out.printf("%s ", current.data);
            if (current.right != null) {
                nodes.push(current.right); } 
            if (current.left != null) { 
                nodes.push(current.left); } } }

}
