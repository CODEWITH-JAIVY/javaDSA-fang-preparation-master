package com.StackUsingArray.codewithjaivy;

public class StackOperation {
    public  class StackusingAray{
        private int [] stackArray  ; ;
        private int top   ;

        public StackusingAray(int size ) {
            stackArray  = new int [size] ;
             top = -1  ;
        }

       // push the  element in the stack
        void push(int data ) {
            if(top == stackArray.length-1) {
                System.out.println("Stack is not empty ! ");
                return  ;
            }
            top ++ ;
            stackArray[top] = data  ;
        }

        // pop operation in the stack
        void pop() {
            if(top == -1 ) {
                System.out.println("List is alrady empty ! ");
                return ;
            }
            System.out.println("Pop data is " + stackArray[top]);
            top--;
        }
        //  pick the data from the stack
        void pick(){
            if(top == -1 ) {
                System.out.println("Cann't be pick becase  stack  is empty ");
                return;
            }
            System.out.println("pick data is " + stackArray[top]);
        }
        void isEmpty(){
            if(top==-1) {
                System.out.println("Stack is empty !");
                return;
            }else {
                System.out.println("Stack is not empty ! ");
            }
        }

        void isFull() {
            if(top == stackArray.length-1){
                System.out.println("Stack is full ");
                return;
            }
            System.out.println("Stack is not full ");
        }

    }

    // derive class
    public static void main(String[] args) {
       StackOperation st = new StackOperation() ;
       StackOperation.StackusingAray ob = st. new StackusingAray(5);
       ob.push(10);
       ob.push(30);
       ob.push(50);
       ob.push(60);
       ob.push(70);
       ob.pick();
        ob.pop() ;
        ob.isEmpty();
    }
}
