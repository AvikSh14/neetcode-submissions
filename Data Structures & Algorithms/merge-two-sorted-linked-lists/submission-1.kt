/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var l1 = list1
        var l2 = list2

        // val mergedHead: ListNode? = if (list1!!.`val` < list2!!.`val`) list1 else list2
        val dummyHead : ListNode? = ListNode(0)
        var currentNode = dummyHead

        while(l1!=null && l2!=null) {
            if (l1.`val` < l2.`val`) {
                currentNode?.next = l1
                l1 = l1.next
            } else {
                currentNode?.next = l2
                l2 = l2.next
            }

            currentNode = currentNode?.next
        }

        currentNode?.next = l1 ?: l2

        return dummyHead?.next
    }
}
