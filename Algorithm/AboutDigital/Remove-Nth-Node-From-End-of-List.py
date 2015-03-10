2015年 03月 10日 星期二 11:05:07 CST

# Definition for singly-linked list.

# class ListNode:

#     def __init__(self, x):

#         self.val = x

#         self.next = None



class Solution:

    # @return a ListNode

    def removeNthFromEnd(self, head, n):

        cursor = new_head = ListNode(0)

        new_head.next = head

        queue = []

        while cursor:

            queue.append(cursor)

            if len(queue) > n + 1:

                queue.pop(0)

            cursor = cursor.next

        previous = queue.pop(0)

        to_del = queue.pop(0)

        previous.next = to_del.next

        return new_head.next
