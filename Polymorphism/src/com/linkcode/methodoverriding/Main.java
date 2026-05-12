package com.linkcode.methodoverriding;

public class Main {
	public static void main(String[] args) {
		Son son=new Son();
		son.work();
		Father father=son;
		father.work();
	}

}
