package com.zafar;

import java.util.ArrayList;

public class Node {

	private Character data;
	private ArrayList<URLTree> next=new ArrayList<URLTree>();
	
	public Node(char data) {
		this.data=data;
	}
	public Character getData() {
		return data;
	}
	public void setData(Character data) {
		this.data = data;
	}
	public ArrayList<URLTree> getNext() {
		return next;
	}
	public void setNext(ArrayList<URLTree> next) {
		this.next = next;
	}
	
}
