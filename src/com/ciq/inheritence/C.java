package com.ciq.inheritence;

public class C implements B,A{

	@Override
	public void sum() {
		
		
		
		
		A.super.add();
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		A.super.add();
		B.super.add();
	}

	@Override
	public void ad() {
		// TODO Auto-generated method stub
		
	}

	
	
}
