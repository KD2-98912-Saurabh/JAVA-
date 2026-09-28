package com.sunbeam;

public class GrowableStack implements Stack{

	private Employee[] emp;
	private int top;
	
	public GrowableStack() {}
	
	public GrowableStack(Employee[] emp, int top) {
		super();
		this.emp = new Employee[STACK_SIZE];
		this.top = -1;
	}

	@Override
	public void push(Employee e) {
		if(top==emp.length-1)
		{
			  Employee[] temp = new Employee[emp.length * 2];
			  for(int i=0;i<temp.length;i++)
			  {
				  temp[i] = emp[i];
			  }
			  
			  emp=temp;
			  
		}
		
		top++;
		emp[top]= e;
		
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
			Employee e = emp[top];
			top--;
			return e;
		}
	}
}
