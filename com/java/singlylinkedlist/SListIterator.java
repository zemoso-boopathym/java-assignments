package com.java.singlylinkedlist;

import java.util.logging.Logger;

public class SListIterator<T> {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    SNode<T> head;
    SListIterator() {
        this.head = null;
    }
    SNode<T> add(T data)
    {
        SNode<T> newSNode = new SNode<>(data);
        if (head == null) {
            head = newSNode;
        } else {
            SNode<T> startNode = head;
            while (startNode.next != null) {
                startNode = startNode.next;
            }
            startNode.next = newSNode;
        }
        return head;
    }

    SNode<T> remove(T dataToBeRemoved)
    {
        SNode<T> prevNode = new SNode<>(null);
        prevNode.next = head;
        SNode<T> next = head.next;
        SNode<T> currSNode = head;

        if (head.data == dataToBeRemoved) {
            head = head.next;
            return head;
        }

        while (currSNode.next != null) {
            if (String.valueOf(currSNode.data).equals(String.valueOf(dataToBeRemoved))) {
                prevNode.next = next;
                return head;
            }
            prevNode = currSNode;
            currSNode = currSNode.next;
            next = currSNode.next;
        }

        if (String.valueOf(currSNode.data).equals(String.valueOf(dataToBeRemoved))) {
            prevNode.next = null;
            return head;
        }
        LOGGER.info("Entered data not found in the linked list !");
        return head;
    }

}
