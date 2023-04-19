package PIJL_Assignments.Assignment_6.PIJL6_Part1;

import PIJL_Assignments.Assignment_6.PIJL6_Part1.Stack_Package.Interface_STACK;

public class Fixed_stk implements Interface_STACK {

    int MAX = 5;
    int stack[]=new int[MAX], top=0;
    @Override
    public void push(int a) {
        if (top == MAX)
            System.out.println("Can't insert. Stack full.");
        else
            stack[top++]=a;
    }

    @Override
    public int pop() {
        if(top==-1)
            return -1;
        else {
            top--;
            return stack[top];
        }
   }

    @Override
    public void displayTop() {
        System.out.println("Stack top " + stack[top-1]);
    }

    @Override
    public void displayStack() {
        System.out.println("Stack elements");
            for(int i=0;i<top;i++)
                System.out.print(stack[i]+" ");
        System.out.println("\n");
        }
    }

