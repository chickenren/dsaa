package stack;

/**
 * Description：用数组实现栈功能
 *
 * @author 吴瑾 (jin.wu@ucarinc.com)
 * @version 1.0 2019-07-16 09:35 by 吴瑾 (jin.wu@ucarinc.com) 创建
 */
public class ArrayStack<E> {
    private int count = 0;
    //默认的栈大小
    private static final int defaultSize = 8;

    private Object[] stack;

    public ArrayStack(Integer size) {
        if (size == null) {
            size = defaultSize;
        }
        stack = new Object[size];
    }


    public E push(E item){
        if(count == stack.length){
            throw new IndexOutOfBoundsException("栈满了，可以实现自动扩容");
        }
        count++;
        stack[count] = item;
        return item;
    }

    public E pop(){
        E o = (E)stack[count];
        count--;
        return o;
    }

    public int getSize(){
        return stack.length;
    }


}
