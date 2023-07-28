import java.util.ArrayList;
import java.util.List;

public class leftsimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        findleafsequance(root1 , left);
        findleafsequance(root2 , right);

        return left.equals(right);
    }

    private void findleafsequance(TreeNode root, List<Integer> left) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            left.add(root.val);
        }

        findleafsequance(root.left, left);
        findleafsequance(root.right, left);
    }    
}
