##Day 1##

### ###[27. Remove Element](https://leetcode.cn/problems/remove-element/)###

关键信息：双指针（快慢指针，从同一个起点开始）

关键信息2：fast指针遍历一次。

情况1：fast指向的空间内元素不是target，复制fast指向的空间内元素给slow，然后fast指针和slow指针同步后移。

情况2：fast指向的元素是要删除的target，这时只有fast向后移动，并且不复制给slow指向空间。
