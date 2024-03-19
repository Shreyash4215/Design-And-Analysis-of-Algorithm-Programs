import java.util.Scanner;

class prog8_stack 
{

	Scanner sc = new Scanner(System.in);
  
	int MAX,top,a[];

	boolean isEmpty()
	{
		if(top < 0)
			return true;
		else
			return false; 

	}
	
	void Stack()
	{
		top = -1;
	}   

	boolean isFull() 
	{
		if (top >= (MAX - 1)) 
		{
		  return true;
		}
		return false;
	}

    void operations(int ch)
    {   
      switch(ch)
      {  
        case 1:
        {
          System.out.print("\nEnter Size Of Stack");
          MAX=sc.nextInt();  

          a = new int[MAX];
          Stack();           

          break;
        } 
          
        case 2:
        {
          int element;

          System.out.print("\nEnter Element to insert to Stack:");
          element=sc.nextInt(); 

          if (isFull()) {
            System.out.println("Stack Is Full");
           }
           else {
             top++;
            a[top] = element;    
            System.out.println(element + " pushed into stack");
           }
          break;
        }
        case 3:
        {
            int element;
           
            if (isEmpty()) {
              System.out.println("Stack Is Empty");
             }
             else {
              int x = a[top];
              top--;
              System.out.println(x + " Popped from stack");
             }
          break;
        }
        case 4:
        { 
          if (isEmpty()) {
            System.out.println("Stack Is Empty");
           }
           else  //to display elements of Stack
           {      
              for(int i = top;i>-1;i--){
             System.out.print(" "+ a[i]);
              }
            }
            
          break;
        }
        case 5:
        {
          if (isEmpty()) {
            System.out.println("Stack Is Empty");
           }
           else {
            int x = a[top];
            
            System.out.println("Top element is :" + x);
           }
           break;
        }
        }

      }
	public static void main(String args[])
	{
		prog8_stack s = new prog8_stack();
		
		int ch;

		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.print("\n***** Operation *****\n1.Create Stack\n2.Push Element\n3.Pop Element\n4.Display Stack\n5.Top element\n6.Exit\n Choose Any Operation:");
			ch=sc.nextInt();

			if(ch==6)
			  return;
			else if(ch<1 || ch >6)
			  System.out.print("\n Please Enter Correct Option"); 
			else
			  s.operations(ch);
		}
	}
}