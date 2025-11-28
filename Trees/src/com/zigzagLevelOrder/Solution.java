//package com.zigzagLevelOrder;
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Queue;
//
//class TreeNode {
//    int val  ;
//    TreeNode  left ;
//    TreeNode  right  ;
//
//    TreeNode(int val ) {
//        this.val = val ;
//        this.left = null ;
//        this.right = null   ;
//    }
//
//}
//public class Solution {
//
//
//    public static void zig(TreeNode root, List<Integer> list, List<List<Integer>> ans) {
//        if (root == null) return;
//        Queue<TreeNode> Q = new ArrayDeque<>();
//        Q.add(root);
//        int level = 0;
//        while (!Q.isEmpty()) {
//            int size = Q.size();
//            if (level % 2 == 0) {
//                // left to right
//
//                for (int i = 0; i < size; i++) {
//                    TreeNode current = Q.poll();
//                    list.add(current.val);
//
//                }
//            } else {
//                // right to left
//                for (int i = 0; i < size; i++) {
//                    TreeNode current = Q.;
//                    list.add(current.val);
//                }
//
//            }
//            level++;
//            ans.add(new ArrayList(list));
//        }
//
//
//    }
//
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        List<List<Integer>> ans = new ArrayList<>();
//        if (root == null) return ans;
//        zig(root, list, ans);
//        return ans;
//    }
//
//}