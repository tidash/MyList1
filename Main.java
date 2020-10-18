package com.company;

public class Main {

    public static void main(String[] args) {
	List myList = new List();
	myList.add(12);
	myList.add(24);
	myList.add(36);
	myList.add(80);
	myList.add(35);
	myList.add(98);
	System.out.println(myList.toString());
	myList.swap(2,4);
	System.out.println(myList.toString());
	myList.swap(0, 3);
	System.out.println(myList.toString());
	myList.swap(-30,80);
	System.out.println(myList.toString());
	myList.swap(5,0);
	System.out.println(myList.toString());
	myList.sort();
	System.out.println(myList.toString());

    }
}
