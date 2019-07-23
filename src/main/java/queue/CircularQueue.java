package queue;

/**
 * Description：环形队列
 *
 * @author 吴瑾 (jin.wu@ucarinc.com)
 * @version 1.0 2019-07-23 11:12 by 吴瑾 (jin.wu@ucarinc.com) 创建
 */
public class CircularQueue {

    private Integer[] arr;
    /**
     * 队列中的元素个数
     */
    private int size = 0;
    //队列尾部元素
    private int tail = 0;
    //队列头部元素
    private int head = 0;

    public CircularQueue(int size) {
        this.arr = new Integer[size];
    }

    public boolean enqueue(Integer enNum) {
        //说明环形队列已经满了
        if (size == arr.length) {
            return false;
        }else{
            tail = tail%arr.length;
        }
        arr[tail] = enNum;
        size++;
        tail++;
        return true;
    }

    public Integer dequeue() {
        if (size == 0) {
            return null;
        }
        Integer re = arr[head];
        arr[head] = null;
        head++;
        size--;
        return re;
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(7);

        circularQueue.enqueue(0);
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);
        circularQueue.enqueue(6);

        circularQueue.sou();
        System.out.println("=====================");
        circularQueue.dequeue();
        circularQueue.enqueue(7);
        circularQueue.sou();
    }

    public void sou(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"");
        }
    }

}
