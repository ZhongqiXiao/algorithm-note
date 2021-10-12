package xiaoz.algorithm.learn.base;


import xiaoz.algorithm.learn.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrintListFromTail {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}
