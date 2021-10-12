package xiaoz.algorithm.learn.base;


import xiaoz.algorithm.learn.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrintListFromTail {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode p = head;
        while (p != null) {
            stack.push(p.val);
            p = p.next;
        }
        int size = stack.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}
