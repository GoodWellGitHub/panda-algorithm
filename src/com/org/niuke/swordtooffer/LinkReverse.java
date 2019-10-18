package com.org.niuke.swordtooffer;

import com.org.factory.NodeFactory;
import com.org.factory.domain.NodeNext;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class LinkReverse {
    public static void main(String[] args) {
        NodeNext nodeNext= NodeFactory.rootNext();
        List<Integer> integers=solution(nodeNext);
        integers.forEach(System.out::println);
    }
    public static List<Integer> solution(NodeNext nodeNext){
        Stack<Integer> stack=new Stack<>();
        NodeNext temp=nodeNext.getNodeNext();
        while (temp!=null){
            stack.add(temp.getValue());
            temp=temp.getNodeNext();
        }
        List<Integer> integers=new ArrayList<>();
        while (!stack.empty()){
            integers.add(stack.pop());
        }
        return integers;
    }
}
