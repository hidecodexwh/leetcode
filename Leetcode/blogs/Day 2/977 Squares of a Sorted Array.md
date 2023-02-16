####Day 2 

[977. Squares of a Sorted Array](https://leetcode.cn/problems/squares-of-a-sorted-array/)

关键信息：双指针(从不同起点开始，一头一尾)

易错点：循环结束条件。详细描述：刚开始结束条件用的whlie(low < high)，这种判断方式可能会漏掉最中间的一个数。最后用了指针（数组角标值），当指针值<0的时候，全部数字都排过一次序了
