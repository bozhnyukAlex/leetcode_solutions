package com.company.solutions;
/*
938. Range Sum of BST
Given the root node of a binary search tree, return the sum of values of all nodes with a value in the range [low, high].
*/

import com.company.solutions.utils.TreeNode;

public class N938_RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        if (root.left != null && root.val > low) {
            sum += rangeSumBST(root.left, low, high);
        }
        if (root.right != null && root.val < high) {
            sum += rangeSumBST(root.right, low, high);
        }
        return sum;
    }
}
