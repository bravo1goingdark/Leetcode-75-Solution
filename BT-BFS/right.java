import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class right {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            int lvlsize = que.size();
            Integer right = null;

            for (int i = 0; i < lvlsize; i++) {
                TreeNode node = que.poll();
                right = node.val;

                if (node.left != null) {
                    que.add(node.left);
                }
                if (node.right != null) {
                 que.add(node.right);   
                }
            }
            list.add(right);
        }

        return list;
    }
}