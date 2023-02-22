/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

  You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

  Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

  Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
  Example 2:

  Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.*/

object BestTimeToBuyAndSellStock121 {
  def maxProfitBruteForce(prices: Array[Int]): Int = {
    var maxProfit = 0
    for(i <- 0 until prices.length){
      for(j <- i+1 until prices.length) {
        if(prices(i) < prices(j)) maxProfit = Math.max(maxProfit, prices(j) - prices(i))
      }
    }
    maxProfit
  }

  def maxProfitOptimized(prices: Array[Int]): Int = {
    var leastStockPrice = prices(0)
    var maxProfit = 0
    for(i <- 1 until prices.length) {
      if(prices(i) < leastStockPrice) leastStockPrice = prices(i)
      val currentProfit = prices(i) - leastStockPrice
      maxProfit = Math.max(currentProfit, maxProfit)
    }
    maxProfit
  }
}
