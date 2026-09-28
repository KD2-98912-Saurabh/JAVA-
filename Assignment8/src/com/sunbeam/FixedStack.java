package com.sunbeam;

public class FixedStack implements Stack{

	private Employee[]arr;
	
	private int top;
	public FixedStack() {
		// TODO Auto-generated constructor stub
	}
	
	public FixedStack(Employee[] arr, int top) {

		this.arr = new Employee[STACK_SIZE];
		this.top = -1;
	}

	@Override
	public void push(Employee e) {
		
	if(top==arr.length-1)
	{
		System.out.println("Stack is full...");
	}
	else
	{
		top++;
		arr[top]= e;
		System.out.println("Employee pushed");
	}
	}

	@Override
	public Employee pop() {
		if(top==-1)
		{
			System.out.println("stack is empty");
			return null;
		}
		else
		{
			Employee e = arr[top];
			top--;
			return e;
		}
	}

}
