package com.revature;

//Implement a stack that has the following methods:
//• push ( val ) : push val onto the stack
//• pop: pop off and return the topmost element of the stack. If there are no elements in the stack, throw an error.
//• max: return the maximum value in the stack currently. If there are no elements in the stack, throw an error.

public class POStack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public POStack(int size){
        stackArray = new int[size];
        this.capacity = size;
        top = -1;
    }

    public void push(int value){
        if(!isFull()){
            stackArray[++top] = value;
        }else{
            throw new NullPointerException();
        }
    }

    public int pop(){
        if(!isEmpty()){
            return stackArray[top--];
        }else{
            throw new NullPointerException();
        }
    }

    public int max(){
        if(!isEmpty()){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < stackArray.length; i++){
                if(stackArray[i] > max) max = stackArray[i];
            }
            return max;
            
        }else{
            throw new NullPointerException();
        }
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity -1;
    }


    public static void main(String[] args) {
        POStack sampleStack = new POStack(5);
        sampleStack.push(10);
        sampleStack.push(50);
        sampleStack.push(30);
        sampleStack.push(40);
        sampleStack.push(sampleStack.pop());
        System.out.println("The topmost element is:"+ sampleStack.pop());
        sampleStack.push(8888);
        System.out.println("The max value is:"+sampleStack.max());
        
    }
}