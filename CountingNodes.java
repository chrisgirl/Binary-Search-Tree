/*

1) if node is null return 0, this is also the base case of our recursive algorithm
2) if leaf node is encountered then return 1
3) repeat the process with left and right subtree
4) return the sum of leaf nodes from both left and right subtree

 public int countLeafNodesRecursively() {
    return countLeaves(root);
  }
private int countLeaves(TreeNode node) { 
if (node == null) return 0; 
if (node.isLeaf()) {
return 1; } else { return countLeaves(node.left) + countLeaves(node.right); } }


*/

/*
) if the root is null then return zero.
2) start the count with zero
3) push the root into Stack
4) loop until Stack is not empty
5) pop the last node and push left and right children of the last node if they are not null.
6) increase the count

*/
public int countLeafNodes() { 
if (root == null) { return 0; } 
Stack stack = new Stack<>();
stack.push(root); int count = 0; 
while (!stack.isEmpty())
{ TreeNode node = stack.pop();
if (node.left != null) stack.push(node.left);
if (node.right != null) stack.push(node.right); if (node.isLeaf())
count++; } 
return count; 
}

}

