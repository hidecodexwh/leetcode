##Day 1##

###704.[Binary Search](https://leetcode.cn/problems/binary-search/) ###

关键信息：区间不变量

常用模式：左闭右开区间

左边可以取到，并且已经在mid使用过，因此新的mid = left + 1

右边取不到，因此新的mid = right
