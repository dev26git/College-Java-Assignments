package PIJL_Assignments.Assignment_6.PIJL6_Part1;

import PIJL_Assignments.Assignment_6.PIJL6_Part1.Stack_Package.Interface_STACK;
import java.util.ArrayList;

public class Growable_stack implements Interface_STACK{

    ArrayList<Integer> growable_stack = new ArrayList<>();
    int top = 0;

    public Growable_stack() {}

    public Growable_stack(int arr[]) {
        for(int i: arr){
            growable_stack.add(i);
        }
    }

    @Override
    public void displayStack() {
        for(int i: growable_stack)
            System.out.print(i + " ");
    }

    @Override
    public int pop() {
        if(top == 0) {
            System.out.println("Cannot pop from empty stack.");
            return Integer.MIN_VALUE;
        }
        return growable_stack.remove(--top);
    }

    @Override
    public void push(int toPush) {
        growable_stack.add(toPush);
        top++;
    }

    @Override
    public void displayTop() {
        System.out.println(growable_stack.get(top - 1));
    }
}