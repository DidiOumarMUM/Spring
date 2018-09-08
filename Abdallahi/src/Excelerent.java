import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Excelerent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] tes = {1,4,2,3} ;
		System.out.println(frequentInteger(tes)) ;
		Set<String> res = TwoSum(tes , 6) ;
		Iterator<String> it = res.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(uniqueString("di"));
		System.out.println(uniqueArray(tes));
		System.out.println(mostFreaquenChar("ddddffffffffffffff"));
		
	System.out.println(rever("abcde"));
	System.out.println(longetsSub("stackoverflow"));
		

	}
	
	public static boolean uniqueString(String s)
	{
		for(int i=0 ; i<s.length() ; i++)
		{
			if(s.lastIndexOf(s.charAt(i)) != s.indexOf(s.charAt(i))) return false ;
		}
		return true ;
	}
	public static boolean uniqueArray(int[] arr)
	{
		List<Integer> l = new ArrayList<Integer>() ;
		for(int i=0 ; i<arr.length ; i++)
		{
			if(!l.contains(arr[i]))  l.add(arr[i]) ;
			else return false ;
		}
		return true ;
	}

	public static int frequentInteger(int[] arr)
	{
		
	   HashMap<Integer , Integer> h = new HashMap<Integer , Integer>() ;
	   for(int i : arr)
	   {
		   if(!h.containsKey(i)) h.put(i, 1) ;
		   else {
			   h.put(i, Integer.valueOf(h.get(i)+1) );
		   }
	   }
	   int max = Collections.max(h.values()) ;
	   for(Entry<Integer , Integer> e : h.entrySet())
	   {
		   if(e.getValue()==max)  return e.getKey() ;
	   }
		return arr[0];
	}
	
	public static Set<String> TwoSum(int [] arr ,int  target)
	{
		
		Set<String> mys = new HashSet<String>() ;
		List<Integer> l = new ArrayList<Integer>();
		for(int k : arr)
		{
			l.add(k) ;
		}
		Collections.sort(l);
		int start=0 ;
		int end = l.size()-1;
		while(start <end )
		{
			if(l.get(start)+l.get(end)==target)
			{
					 mys.add(l.get(start)+""+l.get(end)) ;
					 start++ ;
			}
			else {
				if(l.get(start)+l.get(end)< target) start++ ;
				else end-- ;
			}
				
				 
			 
		}
		return mys ;
		
	}
	
	public static Character mostFreaquenChar(String s)
	{
		int [] count = new int[256] ;
		for(int i=0 ; i<s.length() ; i++)
		{
			count[s.charAt(i)]+=1 ;
		}
		
		int max=-1 ;
		Character res=s.charAt(0) ;
		for(int i=0 ; i<s.length() ; i++)
		{
			if(count[s.charAt(i)]>max) {
				max=count[s.charAt(i)] ;
				res =s.charAt(i);
			}
		}
		
		return res ;
	}
	
	public static String  rever(String s )
	{
		StringBuilder str = new StringBuilder();
		for(int j=s.length() -1 ; j>=0 ; j--)
		{
			String d= String.valueOf(s.charAt(j));
			str.append(d);
		}
		return str.toString();
	}
	
	
	public static String longetsSub(String s )
	{
		List<String> lis = new ArrayList<String>() ;
		int i=0 ;
		for(int j= i ; i<s.length() ; j++ )
		{
			int k=s.lastIndexOf(s.charAt(i)) ;
			if(k!=s.indexOf(s.charAt(i)) && j<k)
			{
			String d=s.substring(i, k) ;
			lis.add(d) ;
			i++ ;
			}
			else {
				List<Character> str= new ArrayList<Character>();
				StringBuilder strb= new StringBuilder();
				int b=i ;
				while(b<s.length() && !str.contains(s.charAt(b)))
				{
				
				
					 str.add(s.charAt(b)) ;
					 strb.append(String.valueOf(s.charAt(b))) ;
				
				 b++;
				}
				lis.add(strb.toString());
				i++ ;
			}
		}
		
	for(String sv : lis) {
		System.out.println(sv);
	}
		String p =lis.get(0) ;
		System.out.println("***"+p);
		return p ;
	}
}
