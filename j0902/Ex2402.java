package j0902;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedList、HashSet
 * */
public class Ex2402 {

	public static void main(String[] args) {
		LinkedList<Integer> ln = new LinkedList<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		while(ln.size()<20)
		{
			int a = (int)(Math.random()*20+1);
			ln.add(a);
			hs.add(a);
		}
		/*ListInterator*/
		ListIterator<Integer> list = ln.listIterator();
		System.out.println("ListInterator 從前印到後 LinkedList");
		while(list.hasNext())
		{
			System.out.print(list.next()+" ");
		}
		System.out.println("\nListInterator 從後印到前 LinkedList");
		while(list.hasPrevious())
		{
			System.out.print(list.previous()+" ");
		}
		
		/*Iterator*/
		Iterator<Integer> itr = hs.iterator();
		System.out.println("\nInterator HashSet");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		/*Foreach*/
		System.out.println("\nforeach Linkedlist");
		for(Integer i:ln)
		{
			System.out.print(i+" ");
		}
		System.out.println("\nforeach HashSet");
		for(Integer i:hs)
		{
			System.out.print(i+" ");
		}
	}

}
