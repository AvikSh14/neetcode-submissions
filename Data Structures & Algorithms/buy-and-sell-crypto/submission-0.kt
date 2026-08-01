class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var prevMin = Integer.MAX_VALUE

        for (curPrice in prices) {
            if (prevMin == Integer.MAX_VALUE) {
                prevMin = curPrice
                continue
            }

            maxProfit = maxOf(maxProfit, curPrice - prevMin)
            prevMin = minOf(prevMin, curPrice)
        }

        return maxProfit
    }
}
