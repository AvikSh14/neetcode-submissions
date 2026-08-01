class Solution {
    fun search(nums: IntArray, target: Int): Int {
        val pivotIndex = findPivotIndex(nums)

        var left = 0
        var right = nums.size - 1
        if (target >= nums[pivotIndex] && target <= nums[nums.size-1]) {
            left = pivotIndex
        } else {
            right = pivotIndex - 1
        }

        while (left <= right) {
            var mid = left + (right - left) / 2
            if (target == nums[mid]) {
                return mid
            }

            if (target > nums[mid]) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return -1
    }

    

    private fun findPivotIndex(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1
        while(left < right) {
            val mid = left + (right - left) / 2
            if (nums[mid] > nums[right]) {
                left = mid + 1
            } else {
                right = mid
            }
        }

        return right
    }
}
