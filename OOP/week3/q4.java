
class Stack
{
    int arr[]; 
    int tos;
    int n;

    Stack(int nn)
    {
        arr= new int[n];
        n = nn;
        tos = -1;
    }
    public void push(int x)
    {
        if(isFull())
        {
            System.out.println("Stack overflow");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++tos] = x;
    }
    public int pop()
    {
        if(isEmpty()){
            System.out.println("Stack underflow");
            System.exit(1);
        }
        return arr[tos--];
    }
    public int getSize(){
        return tos+1;
    }
    public boolean isFull(){
        return tos == n -1;
    }
    public boolean isEmpty(){
        return tos == -1;
    }
    public void display(){
        for(int i = 0; i<=tos; i++)
        {
            System.out.println(arr[i] + ", ");
        }
    }
    
    public static void main(String[] args)
    {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: ");
        stack.display();

        stack.pop();
        System.out.println("After popping out ");
        stack.display();
    }
}