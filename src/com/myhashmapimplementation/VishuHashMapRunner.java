package com.myhashmapimplementation;

public class VishuHashMapRunner {

	public static void main(String[] args) {
		VishuHashMap<Integer, String> vhm= new VishuHashMap<>();
		vhm.vishuPut(1, "a");
		vhm.vishuPut(1, "b");
		vhm.vishuPut(2, "c");
		vhm.vishuPut(3, "d");
		/*vhm.vishuPut(4, "d");
		vhm.vishuPut(5, "d");
		vhm.vishuPut(6, "d");
		vhm.vishuPut(7, "d");
		vhm.vishuPut(8, "d");
		vhm.vishuPut(9, "d");
		vhm.vishuPut(10, "d");
		vhm.vishuPut(11, "d");
		vhm.vishuPut(3, "d");
		vhm.vishuPut(3, "d");
		vhm.vishuPut(3, "d");
		vhm.vishuPut(3, "d");
		vhm.vishuPut(3, "d");
		vhm.vishuPut(3, "d");*/
		
		vhm.vishuDisplay();

	}

}
