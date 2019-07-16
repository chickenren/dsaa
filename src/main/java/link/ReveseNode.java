package link;

/**
 * Description：单链表反转的链表结点
 *
 * @author 吴瑾 (jin.wu@ucarinc.com)
 * @version 1.0 2019-07-08 20:47 by 吴瑾 (jin.wu@ucarinc.com) 创建
 */
public class ReveseNode {

    public ReveseNode(int val) {
        this.val = val;
    }

    private int val;
    private ReveseNode next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ReveseNode getNext() {
        return next;
    }

    public void setNext(ReveseNode next) {
        this.next = next;
    }
}
