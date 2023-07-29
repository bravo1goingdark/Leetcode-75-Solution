public class LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        // Check if p and q are present in the left and right subtrees
        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

        if (leftLCA != null && rightLCA != null) {
            // If both p and q are found in different subtrees, the current node is the LCA.
            return root;
        }

        // Otherwise, return the non-null node as LCA (if any).
        return leftLCA != null ? leftLCA : rightLCA;
    }
}
