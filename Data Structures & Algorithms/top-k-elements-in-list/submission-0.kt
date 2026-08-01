class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqMap = mutableMapOf<Int, Int>()

        for (num in nums) {
            freqMap[num] = freqMap.getOrDefault(num, 0) + 1
        }

        val minHeap = PriorityQueue<Int> { firstNum, secondNum -> 
                freqMap.getValue(firstNum).compareTo(freqMap.getValue(secondNum))      
        }

        for (key in freqMap.keys) {
            minHeap.offer(key)

            if (minHeap.size > k) {
                minHeap.poll()
            }
        }

        val resultArray = IntArray(k)
        var arrIndex = 0

        while (!minHeap.isEmpty()) {
            resultArray[arrIndex++] = minHeap.poll()
        }
        
        return resultArray
    }
}
