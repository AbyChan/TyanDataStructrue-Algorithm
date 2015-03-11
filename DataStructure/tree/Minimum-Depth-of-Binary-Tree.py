# Definition for a  binary tree node

# class TreeNode:

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None

import sys

class Solution:

    # @param root, a tree node

    # @return an integer

    def minDepth(self, root):

        if root is None: return 0

        left = self.minDepth(root.left)

        right = self.minDepth(root.right)

        if left == 0 and right == 0: return 1

        if left == 0: left = sys.maxint

        if right == 0: right = sys.maxint

        return min(left, right) + 1

        
2015年 03月 11日 星期三 14:51:51 CST
