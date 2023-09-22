package com.light.code.leetcode.binarytree;

import com.light.code.leetcode.binarytree.define_create.TreeNode;

/**
 * @author light
 * @Description 合并二叉树
 *
 * 给你两棵二叉树： root1 和 root2 。
 *
 * 想象一下，当你将其中一棵覆盖到另一棵之上时，两棵树上的一些节点将会重叠（而另一些不会）。
 * 你需要将这两棵树合并成一棵新二叉树。合并的规则是：如果两个节点重叠，
 * 那么将这两个节点的值相加作为合并后节点的新值；否则,不为 null的节点将直接作为新二叉树的节点。
 *
 * 返回合并后的二叉树。
 *
 * 注意: 合并过程必须从两个树的根节点开始。
 * @create 2023-08-22 10:34
 */
public class MergeTreesTest {

	public  TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if(root1==null){
			return root2;
		}
		if(root2==null){
			return root1;
		}
		root1.val+= root2.val;
		root1.left=mergeTrees(root1.left,root2.left);
		root1.right=mergeTrees(root1.right,root2.right);
		return  root1;

	}
}
