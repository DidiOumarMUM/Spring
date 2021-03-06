import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class LinkedListTest {

	public static void main(String[] args) {
		
		occurence(new int[] {-1,0,1,2} ,3);
		// TODO Auto-generated method stub
		ListNode l = new ListNode(3) ;
		ListNode l2 = addListNode(l,-4);
		ListNode l3 = addListNode(l2,1);
		ListNode l4 = addListNode(l3,0);
		System.out.println("sort here ******");
		ListNode test =sortwithmerge(l) ;
		show(test) ;
		System.out.println("end sort ******");
		//sort(l) ;
		//l=addListNodewithsorted(l , 2) ;
		//l=deleteNode( l ,2 ) ;
		ListNode li = new ListNode(0) ;
		addListNode(li,7);
		//addListNode(li,11);
		System.out.println("******");
		ListNode middle = getMiddle(li);
		System.out.println("******"+middle.value);
		ListNode res = mergesorted(l,li) ;
		show(res);
		
		
		/*
       //show(l);
       //removedup(l) ;
		//ListNode tes = new ListNode(l.value) ;
	  //l=removeduplcatewithoutsorting(l) ;
       show(l);
       System.out.println(conatain(l , 6 ));
       MergeTwoList(l,l) ;
       ListNode res =findmidle(l) ;
       System.out.println("*****"+res.value);
       Stack<Integer> slist = new Stack<Integer>() ;
       slist.push(1);
       slist.push(4);
       slist.push(4);
       slist.push(6);
       slist.push(7);
       slist.push(8);
       slist.push(10);
       slist.push(10);
       slist.push(10);
       slist.push(11);
       Hashtable<String , Integer> h = new Hashtable<String,Integer> () ;
      
    		   Stack<Integer> res1 = removeDoubles(slist);
               Iterator<Integer> it = res1.iterator() ;
       while(it.hasNext())
       {
    	   
    	   System.out.println(it.next());
       }*/
     /*  LinkedList<Integer> mylink = new LinkedList<Integer>();
       LinkedList<Integer> sortedmylink = new LinkedList<Integer>();
       List<Integer> l = new ArrayList<Integer>() ; 
       mylink.add(2) ;
       mylink.add(3) ;
       mylink.add(2) ;
       Iterator<Integer> iter =   mylink.listIterator() ;
       while(iter.hasNext())
       {
    	   l.add(iter.next());
       }
      
       Collections.sort(l);
       for(Integer i : l)
       {
    	   sortedmylink.add(i) ;
       }
       
       Iterator<Integer> iterr =   sortedmylink.listIterator() ;
       while(iterr.hasNext())
       {
    	   System.out.println(iterr.next()) ;
       }*/
       
      /* Player [] p = {new Player("didi" , 4) , new Player("ismail" , 6) , new Player("didi" , 9)} ;
       
       Arrays.sort(p , (Player a, Player b) -> {
    	  if(a.name.equals(b.name))
    	  {
    	  return a.age.compareTo(b.age) ;
    	  }
    	  else {
    		  return a.name.compareTo(b.name) ;
    	  }
       });
       
       for(Player pl :p ) {
    	   System.out.println(pl.toString());
       } */
       int [] myarr ={2,3,1,0,-1} ;
       BubleSort(myarr) ;
	}
	
	public static void occurence(int[] arr ,int x)
	{
		int first=-1 ,last=-1 ;
		
		for(int i=0 ; i<arr.length ; i++)
		{
		    	if(arr[i]==x)
				    	{
		    		       if(first==-1)
		    		       {
		    		    	   first=last=i ;
		    		       }
		    		       else last=i ;
				    	}
		}
		System.out.println("****first"+first +"***last +"+last) ;
		
	}
	public static void BubleSort(int [] arr)
	{
		Boolean isSorted=false ;
		int lastunsorted=arr.length-1 ;
		while(!isSorted)
		{
			isSorted=true ;
			for(int i=0 ; i<lastunsorted ;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp =arr[i] ;
					arr[i]=arr[i+1] ;
					arr[i+1]=temp ;
					isSorted=false;
				}
			}
			lastunsorted-- ;
		}
		
		for(int i=0 ; i<arr.length ;i++)
		{
			System.out.println(arr[i]) ;
			
			
		}
		
	}
	
	public static ListNode findmidle(ListNode l)
	{
	
		ListNode ptrfirst = l ;
		ListNode ptrlast = l ;
		while(ptrlast!=null && ptrlast.next!=null )
		{
			ptrfirst=ptrfirst.next ;
			ptrlast=ptrlast.next.next ;
		}
		return ptrfirst ;
	}
	public static ListNode removeduplcatewithoutsorting(ListNode l)
	{
		ListNode res = new ListNode(l.value) ;
		ListNode curr = res ;
		while(l!=null)
		{   
			//System.out.println(res.value);
			if(!conatain(res , l.value ))
			{
				//System.out.println("here");
				ListNode lis = new ListNode(l.value) ;
				curr.next=lis ;
				curr=curr.next ;
			}
			
			l=l.next ;
		}
		l=res ;
 
		return res ;
	}
	public static ListNode MergeTwoList(ListNode l1 , ListNode l2)
	{
		ListNode ptr1 = l1 ;
		ListNode ptr2 = l2 ;
		ListNode res ;
		if(l1.value>l2.value)  {
			res = new ListNode(l2.value);
			l2=l2.next ;
		}
		else {
			res = new ListNode(l1.value);
			l1=l1.next ;
		}
		ListNode ptrres = res ;
		while(l1!=null && l2!=null)
		{
			if(l1.value>l2.value)  {
				ListNode t  = new ListNode(l2.value);
				ptrres.next=t ;
				ptrres=ptrres.next ;
				l2=l2.next ;
			}
			else {
				ListNode t  = new ListNode(l1.value);
				ptrres.next=t ;
				ptrres=ptrres.next ;
				l1 = l1.next ;
			}   
		}
		while(res!=null)
		{
			System.out.println(res.value);
			res=res.next ;
		}
		return res ;
	}
	public  static void removedup(ListNode l)
	{
		while(l.next!=null)
		{
			if(l.value==l.next.value)
			{
				l.next=l.next.next ;
			}
			else {
				l=l.next ;
			}
		}
	}
	public static boolean conatain(ListNode l , int v )
	{
		while(l!=null)
		{
			if(l.value==v) return true ;
			l=l.next ;
		}
		return false ;
	}
	public static void show(ListNode l )
	{
		while(l!=null)
		{
			System.out.println(l.value);
			l=l.next ;
		}
	}
	
	public static ListNode  addListNode(ListNode l , int k)
	{  
		ListNode li = new ListNode(k);
		l.next=li ;	
		l=l.next ;
		return l ;
	}
	public static ListNode addListNodewithsorted(ListNode l , int k)
	{
		ListNode li= new ListNode(k);
		if(l.value>k)
		{
			li.next=l ;
			l=li ;
		}
		else {
		while(l!=null && l.next!=null && l.value<k)
		{   if(l.next.value>k) break ;
			l=l.next ;
			
		}
		
		li.next = l.next ;
		l.next=li ;
		}
		return l ;
	}
	
	public static ListNode deleteNode(ListNode l , int k )
	{
		if(l.value==k)
		{
			l=l.next ;
		}
		else {
		while(l!=null && l.next!=null &&l.next.value!=k)
		{
			l=l.next ;
		}
		l.next=l.next.next ;
		}
		return l ;
	}
	
	public static Stack<Integer> removeDoubles(Stack s)
	{
		Stack<Integer> res = new Stack<Integer>() ;
		Integer h =(int) s.pop() ;
		res.push(h) ;
		while(!s.isEmpty())
		{
			Integer j = (Integer) s.pop() ;
			if(!j.equals(res.peek()))
			{
			res.push(j) ;
			}
		}
		
		return res ;
	}
	
	
	
  public static void sort(ListNode l)
  {
	 
  }
  
  public static ListNode mergesorted(ListNode l , ListNode l2)
  {
	 if(l==null) return l2 ;

     if(l2==null) return l ;
     ListNode res=null;
     if(l.value>l2.value)
     {
    	res = l2 ;
    	res.next=mergesorted(l , l2.next) ;
     }
     else
     {
    	res = l ;
    	res.next=mergesorted(l.next , l2) ;
     }
     return res ;

  }
  
  public static ListNode getMiddle(ListNode h)
  {
	  ListNode slowptr=h;
	  ListNode fastptr=h;
	  while(fastptr!=null && fastptr.next!=null)
	  {
		  fastptr=fastptr.next.next ;
		  if(fastptr==null) break ;
		  slowptr=slowptr.next ;
	  }
	  
	  return slowptr ;
  }
  
  public static ListNode sortwithmerge(ListNode h)
  {
	  
	  if(h==null || h.next==null) return h ;
	  ListNode middle =getMiddle(h);
	  ListNode rightNode=middle.next ;
	  middle.next=null ;
	  ListNode left =sortwithmerge(h) ;
	  ListNode right =sortwithmerge(rightNode) ;
	  ListNode res =  mergesorted(left , right) ;
	  
	 return res ;
	  
  }

}


class ListNode {
	public int value ;
	public ListNode next ;
	
	public ListNode(int val)
	{
		this.value=val ;
	}
	
	
}


class MyComparator  implements Comparator
{

	public int compare(Player o1, Player o2) {
        // TODO Auto-generated method stub
        if(o1.name.equals(o2.name))
        {
            return o1.age-o2.age ;
        }
        else {
            return o1.name.compareTo(o2.name) ;
        }
    }

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Player {
	
	String name ;
	Integer age ;
	
	public Player(String s , int i) {
		this.name=s ;
		this.age=i ;
	}
	
	public String toString()
	{
		return "name :"+this.name +"**age :" + this.age ;
	}
}