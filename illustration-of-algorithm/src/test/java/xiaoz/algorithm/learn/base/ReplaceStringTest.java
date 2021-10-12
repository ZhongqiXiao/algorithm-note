package xiaoz.algorithm.learn.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceStringTest {
    ReplaceString replaceString = new ReplaceString();

    @Test
    void replaceSpace() {
        String testStr = "We are happy.";
        String res = replaceString.replaceSpace(testStr);
        System.out.println("res = " + res);
        Assertions.assertEquals(res, "We%20are%20happy.");
    }

    @Test
    void replaceSpaceMethod2() {
        String testStr = "We are happy.";
        String res = replaceString.replaceSpaceMethod2(testStr);
        System.out.println("res = " + res);
        Assertions.assertEquals(res, "We%20are%20happy.");
    }
}