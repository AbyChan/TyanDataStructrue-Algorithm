# Definition for singly-linked list.

# class ListNode:

#     def __init__(self, x):

#         self.val = x

#         self.next = None



class Solution:

    # @param a ListNode

    # @return a ListNode

    def swapPairs(self, head):

        pre = ListNode(0)

        pre.next = head

        curr = head

        head = pre

        while curr and curr.next:      # curr =1, curr.next =2

            pre.next = curr.next       # 0 --> 2

            curr.next = pre.next.next  # 1 --> 3  # curr.next.next

            pre.next.next = curr       # 3 --> 1

            pre = curr                 # pre = 1

            curr = curr.next           # curr= 3

        return head.next

 

        
2015年 03月 13日 星期五 12:40:35 CST
