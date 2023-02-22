package easy

object BestTimeToBuyAndSellStock121 {
  def maxProfitBruteForce(prices: Array[Int]): Int = {
    var maxProfit = 0
    for (i <- 0 until prices.length) {
      for (j <- i + 1 until prices.length) {
        if (prices(i) < prices(j)) maxProfit = Math.max(maxProfit, prices(j) - prices(i))
      }
    }
    maxProfit
  }

  def maxProfitOptimized(prices: Array[Int]): Int = {
    var leastStockPrice = prices(0)
    var maxProfit = 0
    for (i <- 1 until prices.length) {
      if (prices(i) < leastStockPrice) leastStockPrice = prices(i)
      val currentProfit = prices(i) - leastStockPrice
      maxProfit = Math.max(currentProfit, maxProfit)
    }
    maxProfit
  }
}
