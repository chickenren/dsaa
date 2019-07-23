package queue;

/**
 * Description：基于数组实现的队列
 *
 * @author 吴瑾 ( )
 * @version 1.0 2019-07-23 10:43 by 吴瑾 ( ) 创建
 */
public class ArrayQueue {

    private Integer[] arr;
    private int tail;
    private int head;
    private int size;

    public ArrayQueue(int size) {
        this.arr = new Integer[size];
        this.size = size;
    }

    /**
     * 入队
     *
     * @param enNum
     * @return
     */
    public boolean enqueue(Integer enNum) {
        if (tail == size) {
            return false;
        }
        arr[tail] = enNum;
        tail++;
        return true;
    }

    /**
     * 出队
     *
     * @return
     */
    public Integer dequeue() {
        if (head == tail) {
            return null;
        }
        Integer integer = arr[head];
        head++;
        return integer;
    }
}
