package com.myhashmapimplementation;

public class VishuNode<K, V> {
	K key;
	V value;
	VishuNode<K, V> next;

	public VishuNode(K key, V value, VishuNode<K, V> next) {
		//super();
		this.key = key;
		this.value = value;
		this.next = next;
	}

}
