package com.java.singlylinkedlist;

public class SList<T> {
    SNode<T> head;
    SListIterator<T> sListIterator;
    SList() {
        this.head = null;
        this.sListIterator = new SListIterator<>();
    }

    public String toString()
    {
        SNode<T> firstNode = head;
        StringBuilder bld = new StringBuilder();
        bld.append("{");
        if (firstNode == null) {
            bld.append("}");
            return bld.toString();
        }
        while (firstNode.next != null) {
            bld.append(firstNode.data).append(" -> ");
            firstNode = firstNode.next;
        }
        bld.append(firstNode.data).append("}");
        return bld.toString();
    }

    public void iterator(String methodType, T data) {
        if(methodType.equals("add")) {
            this.head = this.sListIterator.add(data);
        } else if (methodType.equals("remove")) {
            this.head = this.sListIterator.remove(data);
        }
    }
}
