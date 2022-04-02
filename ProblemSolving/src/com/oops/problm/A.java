package com.oops.problm;

class A extends Thread 
{ 
    ThreadDemo demo; 
    public A(ThreadDemo td) 
    { 
        demo = td; 
    } 
    public void run() 
    { 
        demo.doSomething(); 
    } 
}