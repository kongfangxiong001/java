package cn.itcast.p2.linkedlist.demo;

import java.util.LinkedList;

public class LinkedTest {

	public static void main(String[] args) {

	}
}

class DuiLie{
	private LinkedList link;
	public DuiLie() {
		link = new LinkedList();
	}
	public void myAdd(Object obj){
		link.addLast(obj);
	}
	public Object myGet(){
		return link.removeFirst();
	}
}