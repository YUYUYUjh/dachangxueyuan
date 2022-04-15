package com.yy.algorithm.linked_list;

public class ListNode {
    /**
     * 当前节点保存的数据值
     */
    int val;

    /**
     * 下一个节点
     */
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}