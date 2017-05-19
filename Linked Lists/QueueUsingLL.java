import java.util.Scanner;

class QueueNode
{
	int data;
	QueueNode next;
}

class Queue_using_LinkedList
{
	 QueueNode front;
	QueueNode rear;
	
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			Queue_using_LinkedList qn = new Queue_using_LinkedList();
			GfG obj = new GfG();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a,qn);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop(qn)+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}

class GfG
{
	
        /* The method push to push element into the queue*/
        void push(int a, Queue_using_LinkedList ob)
	{
        QueueNode added = new QueueNode();
        added.data = a;
        if (ob.front == null && ob.rear == null) {
            ob.front = added;
            ob.rear = added;
        }
        else {
            ob.rear.next = added;
            ob.rear = added;
        }
        

	}
        
        /*The method pop which return the element poped out of the queue*/
	int pop(Queue_using_LinkedList ob)
	{
	    
	    if ( ob.front != null ) {
	        
	        if ( ob.front == ob.rear ) {
	            int x = ob.front.data;
	            ob.front = null;
	            ob.rear = null;
	            return x;
	        }
	        
	        int popper = ob.front.data;
	        ob.front = ob.front.next;
	        return popper;
	    }
		else 
		    return -1;
	}
}
