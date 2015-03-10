class Solution:

    # @param n, an integer

    # @return an integer

    def hammingWeight(self, n):

        rst = 0

        while n > 0:

            rst += n % 2

            n = n / 2

        return rst
2015年 03月 10日 星期二 14:43:47 CST
