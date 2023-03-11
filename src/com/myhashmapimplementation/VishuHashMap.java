package com.myhashmapimplementation;

public class VishuHashMap<K, V> {
	K key;
	VishuNode<K, V> bucketArray[];

	@SuppressWarnings("unchecked")
	public VishuHashMap() {
		bucketArray = new VishuNode[16];
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("unchecked")
		VishuHashMap<K, V> other = (VishuHashMap<K, V>) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}

	public void vishuPut(K key, V value) {
		int index = (key.hashCode()) % 16;
		VishuNode<K, V> previous=null;
		VishuNode<K, V> newNode = new VishuNode<K, V>(key, value, null);
		if (bucketArray[index] == null) {
			bucketArray[index] = newNode;
		} else {
			VishuNode<K, V> newNode2 = bucketArray[index];
			
			while (newNode2.next != null) {
				if (newNode2.key.equals(newNode.key))
					bucketArray[index].value = newNode.value;
				else {
					previous=newNode2; 
					newNode2 = newNode2.next;
					}
			}
 			previous.next=newNode;
			newNode.next = newNode2;
		}
	}

	public void vishuDisplay() {
		for (int i = 0; i < 16; i++) {
			if (bucketArray[i] == null)
				continue;
			else {
				VishuNode<K, V> n = bucketArray[i];
				while (n != null) {
					System.out.println(n.key + " " + n.value);
					n = n.next;
				}
			}

		}
	}

}
