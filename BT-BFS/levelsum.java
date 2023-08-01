import java.util.LinkedList;
import java.util.Queue;

public class levelsum {
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        int maxlevelsum = Integer.MIN_VALUE;
        int maxlevel = 1;
        int currlevel = 1;

        while (!que.isEmpty()) {
            int lvlsize = que.size();
            Integer levelsum = 0;

            for (int i = 0; i < lvlsize; i++) {
                TreeNode node = que.poll();
                levelsum += node.val;

                if (node.left != null) {
                    que.add(node.left);
                }
                if (node.right != null) {
                 que.add(node.right);   
                }
            }
            
            if (levelsum > maxlevelsum) {
                maxlevelsum = levelsum;
                maxlevel = currlevel;
            }

            currlevel++;
        }

        return maxlevel;
    }
}
