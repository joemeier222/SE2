/*
 * Stack that implements the stack of integers
 * The class will provide methods  push,  pop and 
 * isEmpty and will store the values in array of fixed size.
 * The size of array will be passed as an argument 
 * to  constructor. Method  push  will  throw  StackException
 * if  called  on  a  full  stack  and  method  pop  will 
 * throw StackException if called on an empty stack.
 * 
 */
package tarleton.datastructures;


/**
 *
 * @author Joe Meier
 */
public class Stack {
    private int[] curStack;
    private int size;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.curStack = new int[size];
        this.top = -1;
    }
    
    public void push(int item){
        if (this.size == (this.top + 1)){
            int[] tempStack = curStack;
            this.size *= 2;
            this.curStack = new int[size];
            for(int i = 0; i <= top; i++){
                this.curStack[i] = tempStack[i];
            }
        }
        this.top++;
        this.curStack[this.top] = item;
    }
    
    public int pop(){
        if (isEmpty()){
            throw new StackException("Empty Stack.");
        }
        int item = this.curStack[this.top];
        this.top--;
        return item;
    }
    
    public boolean isEmpty(){
        return this.top == -1;         
    }
    
}
