package Programs;

public class StackPgm 
{
    int[] stack;
    int topofstack;

    public StackPgm(int size) 
    {
        stack = new int[size];
        topofstack = -1;
    }

    public boolean isEmpty() 
    {
        return topofstack == -1;
    }

    public boolean isFull() 
    {
        return topofstack == stack.length - 1;
    }

    public void push(int no) 
    {
        if (isFull()) 
        {
            System.out.println("Stack is Full");
        } else 
        {
            stack[++topofstack] = no;
            System.out.println("The value " + no + " is inserted");
        }
    }

    public void pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is Empty");
        } else 
        {
            int value = stack[topofstack--];
            System.out.println(value + " is fetched from Stack");
        }
    }

    public void peek()
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is Empty");
        } else 
        {
            System.out.println("Peek value is: " + stack[topofstack]);
        }
    }

    public void delete() 
    {
        stack = null;
        topofstack = -1;
        System.out.println("Stack is deleted");
    }

    public static void main(String[] args) 
    {
        StackPgm s = new StackPgm(5); // create a stack of size 5

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(100);

        s.peek();

        s.pop();
        s.pop();
        s.pop();
  

        s.peek();

        s.delete();
    }
}
