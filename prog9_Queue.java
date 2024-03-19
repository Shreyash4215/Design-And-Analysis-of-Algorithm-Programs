import java.util.Scanner;

public class prog9_Queue 
{
	Scanner sc = new Scanner(System.in);
	  
	int front, rear,SIZE,arr[];

	void Queue()
	{
		front = -1;
		rear = -1;
	}

	boolean isFull()
	{
		if (front == 0 && rear == SIZE - 1)
		{
		  return true;
		}
		return false;
	}

	boolean isEmpty() 
	{
		if (front == -1)
		  return true;
		else
		  return false;
	}

	void operations(int ch)
	{ 
		switch(ch)
		{  
			case 1:
			{
				System.out.print("\nEnter Size Of Queue");
				SIZE=sc.nextInt();  

				arr = new int[SIZE];

				Queue();             
				
				break;
			} 
			case 2:
			{
				int element;

				System.out.print("\nEnter Element to insert to Queue:");
				element=sc.nextInt(); 

				if (isFull()) 
				{
					System.out.println("Queue is full");
				}
				else 
				{
					if (front == -1)
					front = 0;
					 rear++;
					 arr[rear] = element;
					System.out.println("Inserted " + element);
				}
					break;
			}
			case 3:
			{
				int element,i;
				if (isEmpty()) 
				{
					System.out.println("Queue is empty");  
				}
				else
				{
					element = arr[front];
					if (front >= rear)
					{
						front = -1;
						rear = -1;
					} 
					else
					{
						for(i=front;i<rear;i++)
						  arr[i]=arr[i+1];
						  rear--;
					}
					  System.out.println("Deleted -> " + element);   
				}
				break;
			}
			case 4:
			{        
				int i;
				if (isEmpty()) {
					System.out.println("Empty Queue");
				}
				else 
				{
					System.out.println("\nFront index-> " + front);
					System.out.println("Elements -> ");
					for (i = front; i <= rear; i++)
						System.out.print(arr[i] + "  ");
				
					System.out.println("\nRear index-> " + rear);
				}
				  break;
			}
		}
	}
	  
	public static void main(String[] args)
	{
		prog9_Queue q = new prog9_Queue();

		int ch,n;

		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.print("\n***** Operation *****\n1.Create Queue\n2.Insert Element\n3.Delete Element\n4.Display Queue\n5.Exit\n Choose Any Operation:");
			ch=sc.nextInt();

			if(ch==5)
			  return;
			else if(ch<1 || ch >5)
			  System.out.print("\n Please Enter Correct Option"); 
			else
			  q.operations(ch);
		}
    }
  }