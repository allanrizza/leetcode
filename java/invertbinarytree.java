class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode resultTreeNode = new TreeNode(root.val);
        resultTreeNode.left = invertTree(root.right);
        resultTreeNode.right = invertTree(root.left);
        return resultTreeNode;
    }
}