package com.org.factory.domain;


public class NodeNext {
    private int value;
    private NodeNext nodeNext;

    public NodeNext(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeNext getNodeNext() {
        return nodeNext;
    }

    public void setNodeNext(NodeNext nodeNext) {
        this.nodeNext = nodeNext;
    }
}
