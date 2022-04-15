package com.yy.algorithm.linked_list;

public class ReverseLinkedList {
    // 方法一：迭代
    public ListNode reverseList1(ListNode head){
        //定义两个指针 一个指向当前节点，一个指向上一个节点
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            //存储下一个节点
            ListNode next = curr.next;
            //将当前节点的next指向上一个节点
            curr.next = prev;
            //更新当前节点和上一个节点
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // 方法二：递归
    public ListNode reverseList(ListNode listNode){
        // 基准情况
        if (listNode == null || listNode.next == null) {
            return listNode;
        }

        // 递归调用，翻转剩余所有节点
        ListNode restHead = listNode.next;
        ListNode reversedRest = reverseList(restHead);

        // 把当前节点接在翻转之后的链表末尾
        restHead.next = listNode;
        // 当前节点就是链表末尾，直接指向null
        listNode.next = null;

        return reversedRest;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);


        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;

        TestLinkedList.printList(listNode1);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        TestLinkedList.printList(reverseLinkedList.reverseList1(listNode1));
    }

}