package list.reverselist;

/**
 * Description leetcode question 206
 * https://leetcode-cn.com/problems/reverse-linked-list/solution/tou-cha-fa-fan-zhuan-lian-biao-by-cartoon/
 *
 * @author 吴瑾 (jin.wu@ucarinc.com)
 * @version 1.0 2019-07-08 20:42 by 吴瑾 (jin.wu@ucarinc.com) 创建
 */
public class ReverseList {

    /**
     * 反转单链表->递归解法
     *
     * @param head
     * @return
     */
    public ReveseNode reverseList(ReveseNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        ReveseNode reveseNode = reverseList(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return reveseNode;
    }

    /**
     * 反转链表->迭代
     *
     * @param head
     * @return
     */
    public ReveseNode reverseList2(ReveseNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        ReveseNode curr = head;
        while (curr.getNext() != null){
            ReveseNode temp = curr.getNext();
            curr.setNext(curr.getNext().getNext());
            temp.setNext(curr);
            head = temp;
        }

        return head;
    }
}
