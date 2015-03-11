# Definition for a  binary tree node

# class TreeNode:

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None

#

# Definition for singly-linked list.

# class ListNode:

#     def __init__(self, x):

#         self.val = x

#         self.next = None



class Solution:

    # @param head, a list node

    # @return a tree node

    def sortedListToBST(self, head):

        if head is None: return None

        array = self.toArray(head)

        return self.buildBST(array, 0, len(array)-1)

        

    def buildBST(self, array, left, right):

        if left > right: return None

        mid = (left + right) / 2

        root = TreeNode(array[mid])

        root.left = self.buildBST(array, left, mid-1)

        root.right = self.buildBST(array, mid+1, right)

        return root

    

    def toArray(self, head):

        rst = []

        while head is not None:

            rst.append(head.val)

            head = head.next

        return rst
2015年 03月 11日 星期三 14:14:43 CST
