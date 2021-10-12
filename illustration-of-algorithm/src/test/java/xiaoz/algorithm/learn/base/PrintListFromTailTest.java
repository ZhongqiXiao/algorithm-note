package xiaoz.algorithm.learn.base;

import org.junit.jupiter.api.Test;
import xiaoz.algorithm.learn.common.ListNode;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrintListFromTailTest {
    PrintListFromTail printListFromTail = new PrintListFromTail();

    @Test
    void reversePrint() {
        ListNode head = buildList();
        System.out.println("head val = " + head.val);
        int[] res = printListFromTail.reversePrint(head);
        System.out.println(Arrays.toString(res));
    }

    ListNode buildList() {
        int[] arr = {1, 3, 2};
        ListNode head = new ListNode(arr[0]);
        ListNode tmp = head;
        for (int i = 1; i <= arr.length-1; i++) {
            ListNode p = new ListNode(arr[i]);
            tmp.next = p;
            tmp = p;
        }
        return head;
    }
}