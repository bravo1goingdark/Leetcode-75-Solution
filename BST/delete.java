package BST;

public class delete {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
    
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Case 1: Node to be deleted is a leaf node (no children)
            if (root.left == null && root.right == null) {
                root = null;
            }
            // Case 2: Node to be deleted has one child (left or right)
            else if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            }
            // Case 3: Node to be deleted has two children
            else {
                TreeNode successor = findMinNode(root.right);
                root.val = successor.val;
                root.right = deleteNode(root.right, successor.val);
            }
        }
    
        return root;
    }
    
    private TreeNode findMinNode(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
