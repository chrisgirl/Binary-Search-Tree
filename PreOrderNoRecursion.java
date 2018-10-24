
public class PreOrderNoRecursion {
    public void preOrderWithoutRecursion() {
    Stack<TreeNode> nodes = new Stack<>();
    nodes.push(root);

    while (!nodes.isEmpty()) {
      TreeNode current = nodes.pop();
      System.out.printf("%s ", current.data);

      if (current.right != null) {
        nodes.push(current.right);
      }
      if (current.left != null) {
        nodes.push(current.left);
      }
    }
  }

}
