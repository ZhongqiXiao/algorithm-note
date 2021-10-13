package xiaoz.algorithm.learn.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CQueueTest {
    @Test
    void testCase1() {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        int res = cQueue.deleteHead();
        Assertions.assertEquals(3, res);
        res = cQueue.deleteHead();
        Assertions.assertEquals(-1, res);
    }

    @Test
    void testCase2() {
        CQueue cQueue = new CQueue();
        int res = cQueue.deleteHead();
        Assertions.assertEquals(-1, res);
        cQueue.appendTail(5);
        cQueue.appendTail(2);
        res = cQueue.deleteHead();
        Assertions.assertEquals(5, res);
        res = cQueue.deleteHead();
        Assertions.assertEquals(2, res);
    }

    @Test
    void testCase3() {
        CQueue cQueue = new CQueue();
        for (int i = 1; i <= 5; i++) {
            cQueue.appendTail(i);
        }
        int res = 0;
        for (int i = 1; i <=5 ; i++) {
            res = cQueue.deleteHead();
            Assertions.assertEquals(i, res);
        }
    }
}