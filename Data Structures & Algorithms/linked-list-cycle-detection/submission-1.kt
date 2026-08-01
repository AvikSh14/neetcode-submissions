/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) {
            return false
        }
        var slowPointer = head
        var fastPointer = head?.next

        while (slowPointer != null && fastPointer?.next != null) {
            if (slowPointer == fastPointer) {
                return true
            }
            slowPointer = slowPointer?.next
            fastPointer = fastPointer?.next?.next
        }

        return slowPointer == fastPointer
    }
}
