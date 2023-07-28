public class goodnodes {
    public int goodNodes(TreeNode root) {
        return dfs(root , Integer.MIN_VALUE);
    }

    private int dfs(TreeNode root, int maxValue) {
        if (root == null) {
            return 0;
        }


        int count = root.val >= maxValue ? 1 : 0;
        maxValue = Math.max(root.val , maxValue);

        count += dfs(root.left, maxValue);
        count += dfs(root.right, maxValue);

        return count;
    }
}
