public class pathsum {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        int pathsfromroot = countpath(root , targetSum);
        int pathsfromleft = pathSum(root.left, targetSum);
        int pathsfromright = pathSum(root.right, targetSum);

        return pathsfromroot + pathsfromleft + pathsfromright;
    }

    private int countpath(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        int paths = (root.val == targetSum) ? 1:0;

        paths += countpath(root.left, targetSum - root.val);
        paths += countpath(root.right, targetSum - root.val);

        if (targetSum == 0) {
            paths++;
        }
        return paths;
    }
}