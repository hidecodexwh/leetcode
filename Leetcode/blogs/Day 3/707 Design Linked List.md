Day 3

#### [707. Design Linked List](https://leetcode.cn/problems/design-linked-list/)

关键信息：无

错误点：尾部添加函数死循环

```Java
public void addAtTail(int val) {
        LinkedNode iter = head;
        LinkedNode newTailNode = new LinkedNode(val, null);

        while(iter != null){
            if(iter.next == null){
                iter.next = newTailNode;
                break;\\第一次写，没有写这个break导致死循环
            }else{
                iter = iter.next;
            }
        }
    }
```


