package array;

/**
 * Description：
 *
 * @author 吴瑾
 * @version 1.0 2019-07-04 14:42 by 吴瑾  创建
 */
public class Array {

    public static void main(String[] args) {
        int[] a = new int[5];

    }

    public Array(int length) {
        this.myArgs = new int[length];
        this.length = length;
        this.dataCount = 0;
    }

    /**
     * 数组
     */
    private int[] myArgs;
    /**
     * 数组的长度
     */
    private int length;

    /**
     * 数组中存的数据量
     */
    private int dataCount;

    public int[] getMyArgs() {
        return myArgs;
    }

    public void setMyArgs(int[] myArgs) {
        this.myArgs = myArgs;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDataCount() {
        return dataCount;
    }

    public void setDataCount(int dataCount) {
        this.dataCount = dataCount;
    }

    /**
     * 在site位置插入value，将数据往后移
     *
     * @param site
     * @param value
     */
    public void add(int site, int value) {
        //数据已经满了,就进行扩容
        if (dataCount == length) {
            this.capaticy();
        }
        //site位置的数据往后移动
        for (int i = dataCount; i > site; i--) {
            myArgs[i] = myArgs[i - 1];
        }
        myArgs[site] = value;
    }

    /**
     * 删除第site位置的数据，将后边的数据往前移动
     *
     * @param args
     * @param site
     */
    private void del(int[] args, int site) {
        for (int i = site; i < args.length; i++) {
            args[i] = args[i + 1];
        }
    }

    /**
     * 数组扩容2倍
     * 新建一个2倍长度的数组，然后将原来数组的值赋值到新数组，最后将原来数组的引用指向新建的数组
     */
    public void capaticy() {
        int[] tempArgs = new int[length * 2];
        for (int i = 0; i < length; i++) {
            tempArgs[i] = myArgs[i];
        }
        this.myArgs = tempArgs;
        this.length = tempArgs.length;
    }


}
