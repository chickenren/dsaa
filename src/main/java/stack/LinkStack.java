package stack;

/**
 * Description：链表实现栈功能
 *
 * @author 吴瑾 (jin.wu@ucarinc.com)
 * @version 1.0 2019-07-16 09:35 by 吴瑾 (jin.wu@ucarinc.com) 创建
 */
public class LinkStack<E> {
    private int count = 0;

    private Object[] stack;

    //栈顶的结点
    private StackNode top;

    public LinkStack() {
    }

    public E push(E e){
        StackNode sn = new StackNode(e);
        sn.next = top;
        top = sn;
        count++;
        return e;
    }

    public E pop(){
        E item = top.item;
        top = top.next;
        count--;
        return item;
    }

    private class StackNode{
        private E item;
        private StackNode next;

        public StackNode(E item) {
            this.item = item;
        }
    }
}