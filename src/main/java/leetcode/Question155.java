package leetcode;

import java.util.Stack;

/**
 * Description：最小栈
 * 通过辅助栈的方法来实现
 *
 * @author 吴瑾 (jin.wu@ucarinc.com)
 * @version 1.0 2019-07-23 16:04 by 吴瑾 (jin.wu@ucarinc.com) 创建
 */
public class Question155 {
    private Stack<Integer> data;
    private Stack<Integer> help;

    public Question155() {
        data = new Stack<>();
        help = new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        //如果入栈的数小于等于辅助栈的栈顶元素则辅助栈入栈
        if (help.empty() || x <= help.peek()) {
            help.push(x);
        }
    }

    public void pop() {
        if (data.peek() <= help.peek()) {
            help.pop();
        }
        data.pop();
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return help.peek();
    }
}
