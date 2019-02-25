package com.auribisis;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i=10; i>0;i--) {
        	queue.add(i);
        }
        System.out.println("Head is :"+queue.peek());
        System.out.println("Size of queue is :"+queue.size());
        queue.poll();
        
        System.out.println("Head is :"+queue.peek());
        System.out.println("Size of queue is :"+queue.size());
        
        for(int i=0;i<queue.size();i++) {
        	System.out.println("Head is :"+queue.peek());
        	queue.poll();
        }
	}

}
