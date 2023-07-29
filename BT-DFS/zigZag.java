public class zigZag {
    int longestZigZag = 0;
    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Call the helper function to perform DFS and update the longestZigZag variable
        dfs(root.left, true, 1);
        dfs(root.right, false, 1);

        return longestZigZag;
    }

    private void dfs(TreeNode node, boolean isLeft, int length) {
        if (node == null) {
            return;
        }

        // Update the longestZigZag if the current length is greater
        longestZigZag = Math.max(longestZigZag, length);

        if (isLeft) {
            // If moving left, call DFS for the left and right children with opposite directions
            dfs(node.left, true, 1);
            dfs(node.right, false, length + 1);
        } else {
            // If moving right, call DFS for the left and right children with opposite directions
            dfs(node.left, true, length + 1);
            dfs(node.right, false, 1);
        }
    }
}
