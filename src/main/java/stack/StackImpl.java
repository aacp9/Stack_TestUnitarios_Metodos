package stack;

import java.util.ArrayList;

public class StackImpl implements Stack{
    private ArrayList<Integer> stack;
    private int  maxSize;

    public StackImpl() {
        stack = new ArrayList<>();
        maxSize = 0;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean push(int value) {
        //validado que no agrege màs del maximo
        if (this.stack.size() < this.maxSize ) {
            if (this.stack.contains(value)) {
                return false;
            }else{
                this.stack.add(value);
                return true;
            }
        }else{
            //StackOverFlow
            throw new RuntimeException("Stack is full");
            //return false;
        }
    }

    @Override
    public int size() {
        if (stack == null){
            return 0;
        }
        return this.stack.size();
    }

    @Override
    public boolean pop() {
        if (stack.size()>0){
            this.stack.remove(this.stack.size()-1);
            return true;
        }else{
            return false;
        }
   }

    @Override
    public int peek() {
        if (stack.size() > 0){
            return stack.get(stack.size()-1);
        }
        //underflow
        throw new RuntimeException("Stack is empty");
        //return -1;
    }


    @Override
    public String toString() {
        return "stack.StackImpl{" +
                "stack=" + stack +
                '}';
    }
}
