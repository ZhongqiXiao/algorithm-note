package xiaoz.algorithm.learn.base;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * <p>
 * 作者：Krahets
 * 链接：https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/5d3i87/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class CQueue {
    /**
     * 使用两个栈，一个压入，一个弹出
     * stackPush的数据只能一次性全部导入到stackPop中，否则会出现顺序不对的情况，如压入顺序为1,2,3,4,5， 不能分批压入，如只压入5,4,用户想弹出时，弹出元素为4，而不是1，与预期不符合
     * 如果stackPop 不为空，则不能向stackPop中压入数据，如1~5依次压入stackPush, stackPush依次将数据倒入stackPop,此时又有6~10压入stackPush,stackPush 栈顶到栈底依次为10~6
     * 如果此时向stackPop压入，那么栈顶到栈底为6~10，1~5，最先弹出的是6而不是1，与预期不符
     */
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public CQueue() {
        this.stackPush = new Stack<>();
        this.stackPop = new Stack<>();
    }


    public void appendTail(int value) {
        stackPush.push(value);
        pushToPop();
    }

    private void pushToPop() {
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }

    /**
     * 删除时，只能从stackPop删除，如果两个栈都会空，即队列中没有数据，返回-1
     *
     * @return int
     */
    public int deleteHead() {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            return -1;
        }
        pushToPop();
        return stackPop.pop();
    }

    /**
     * peek 也需要 遵守上面两点
     *
     * @return int
     */
    public int peekHead() {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            return -1;
        }
        pushToPop();
        return stackPop.peek();
    }
}
