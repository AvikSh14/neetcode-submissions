/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
    
        var slowPointer = head
        var fastPointer = head

        while (fastPointer?.next != null) {
            slowPointer = slowPointer?.next
            fastPointer = fastPointer?.next?.next

            if (slowPointer == fastPointer) {
                return true
            }
        }

        return false
    }
}
