package com.ds.queue;



public class QueueImpl {
	static int size = 6;

	public static void main(String[] args) {

		int a[] = new int[size];

		enqueue(a, 1);
		enqueue(a, 2);
		enqueue(a, 3);
		enqueue(a, 4);

		dequeue(a);

	}

	public static void enqueue(int a[],int data) {
		
		lock(a){
			while(a.length == size) {
				try {
					wait();
				}catch(Exception e) {
					
				}
				
			}
		}
			
			a[size] = data;
			notify();
		
	}

	public static synchornized int dequeue(int a[]) {
		
		
		while(0 == size) {
			try {
				wait();
			}catch(Exception e) {
				
			}
			
		}
		
		int f =  a[size--];
		
		notify();
		return f;
	
	}
}