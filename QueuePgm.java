package Programs;

public class QueuePgm
{
	int [] queue;
	int topOfQueue;
	int beginingOfQueue;
	
	public QueuePgm(int size) 
	{
		super();
		queue = new int[size];
		topOfQueue = beginingOfQueue=-1;
	}
	public boolean isFull()
	{
		return topOfQueue == queue.length-1;
	}
	public boolean isEmpty()
	{
		return topOfQueue == -1 || beginingOfQueue == queue.length;
	}
	public void enqueue(int no)
	{
		if(isFull())
		{
			System.out.println("QUEUE IS FULL......");
		}
		else if(beginingOfQueue == -1)
		{
			beginingOfQueue = 0;
			queue[++topOfQueue] =  no;
			System.out.println("--------------Inserted--------------------");
			System.out.println(no);
		}
		else {
			queue[++topOfQueue] =no;
			System.out.println("-----------------Inserted---------------");
			System.out.println(no);
		}
	}
	public void deque()
	{
		if(isEmpty())
		{
			System.out.println("Queue Is Empty...");
		}
		else
		{
			int value = queue[beginingOfQueue];
			beginingOfQueue++;
			if(beginingOfQueue > topOfQueue)
			{
				beginingOfQueue=topOfQueue=-1;
			}
			System.out.println("-------------Removed ----------------");
			System.out.println(value);
		}
	}
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("QUEUE IS EMPTY");
		}
		else
		{
			System.out.println("------------------PEEK ELEMENT IS----------------"+queue[beginingOfQueue]);
		}
	
	}
	public void delete()
	{
		queue = null;
		System.out.println("The queue is deleted");
	}
	public static void main(String[] args) 
	{
		QueuePgm q = new QueuePgm(5);
		q.enqueue(10);
		
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.enqueue(60);
		
		q.deque();
		q.delete();
		
	}

}

