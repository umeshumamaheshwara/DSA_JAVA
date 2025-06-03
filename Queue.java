package Programs;

import java.util.LinkedList;
import java.util.Queue;

class Documents 
{
	private String name;
	private int pages;

	public Documents(String name, int pages) 
	{
		super();
		this.name = name;
		this.pages = pages;
	}

	public String getName() 
	{
		return name;
	}

	public int getPages() 
	{
		return pages;
	}
}

class Printer {
	private Queue<Documents> queue = new LinkedList<Documents>();

	public void addDocumnets(Documents d1) 
	{
		queue.add(d1);
		System.out.println("Document: " + d1.getName() + " added to print");
	}

	public void print() 
	{
		while (!queue.isEmpty()) 
		{
			Documents d1 = queue.poll();
			System.out.println("Printing " + d1.getName() + " is in process");
			try 
			{
				Thread.sleep(d1.getPages() * 2000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("Printing " + d1.getName() + " is completed");
		}
		System.out.println("All documents are printed");
	}
}