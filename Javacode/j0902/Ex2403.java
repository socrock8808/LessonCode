package j0902;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet
 * */
public class Ex2403 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		/*建立10筆1~100隨機亂數至TreeSet*/
		while(ts.size()<10)
		{
			int m = (int)(Math.random()*100+1);
			ts.add(m);
		}
		System.out.println("TreeSet第一筆資料為: "+ts.first());
		System.out.println("TreeSet最後一筆資料為: "+ts.last());
		Iterator<Integer> itr = ts.iterator();
		System.out.println("從小到大 Iterator方法印");
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		System.out.println("\n從大到小");
		while(!ts.isEmpty())
		{
			System.out.print(ts.last()+" ");
			ts.remove(ts.last());
		}
		
	}

}
