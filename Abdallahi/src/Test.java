import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;




public class Test {

	static int spr ;
	A a = new B() ;
	C c = new D() ;
	
	public  int getSpr() {
		return spr;
	}

	public  void setSpr(int spr) {
		Test.spr = spr;
	}

	public Test()
	{
		super() ;	
	}
	
	/*public final static  void main(String[] args) 
	{/*
		int[][] arr =  
				{ {1,10},
		          {	1,6},
                   {2,8},
                   {3,5} }  ;
		maxFlorists(9 ,arr) ;
		Integer in = 5 ;
		
		System.out.println(a.b);*/
		/*int c = 0 ;
	    Test t = new Test() ;
	    t.setSpr(10);
		System.out.println(Test.spr);
	   */
	  /* System.out.println(MostFrequent("moustaphaoumar ismail p")) ;
	   int[] a={1,2,3} ;
	   int []b = {1,4,9} ;
	   List<Integer> l= opp( a, b ) ;
	   l.forEach(e -> System.out.println(e));*/
    /*  try {
		    try {
		    	String m=null ;
	        	System.out.println(m.toString());
        	int x=0 ;
        	System.out.println(5/x);
        	
           } catch(NullPointerException e ) {
		          System.out.println("exception") ;
			       
		        }
		    catch(ArithmeticException  d)
          {
        	System.out.println("divide by zero ");
        	
            }
		   
      } catch(NullPointerException e ) {
          System.out.println("exception") ;
       
        }
		

	}*/
	
	public static int time (int [] arr , int pos )
	{
		int time=0 ;	
		int nbrticket=arr[pos] ;
		  int length =arr.length - 1 ;
		 
		for(int i=0 ; i< nbrticket ; i++)
		{
			
			if(i==0) time=pos ;
			
			else
			{
			
			  for(int j=0  ; j<arr.length ; j++)
			  {
				  if(arr[j]>0 )
					  {   
					  arr[j]=arr[j]-1 ; 
					  if(arr[j]==0)  {length-- ; }
					 }
				 
			  }
			}
			  
			
			  time=time+length ;
		}
		
		
		return time; 
	}
	
	
	
	
	public static List<Integer> rotate (List<Integer> l , int d)
	{
	
		for(int i=0 ; i<d ; i++)
		{
			int c= l.get(0) ;
			//System.out.println(c);
			l.remove(0) ;
		    Stack cs = new Stack();
		    
		    Queue q = new LinkedList() ;
		    	l.add(c) ;
		} 
		return l ;
	}
	
	public static void MergetwoStack(Stack<Integer> s1 , Stack<Integer> s2)
	{
		int i=s1.size() ;
		int j=s2.size() ;
		Stack<Integer> st = new Stack<Integer>() ;
		while(true)
		{
			if(s1.size()!=0 && s2.size()!=0)
			{
			if(s1.peek()> s2.peek()) {st.push(s1.pop()) ;}
			else {st.push(s2.pop()) ;}
			}
			else {
				     if(s1.isEmpty()) {st.push(s2.pop()) ;}
				     if(s2.isEmpty()) {st.push(s1.pop()) ; }
			}
			
			if(s1.isEmpty() && s2.isEmpty()) break ;
		}
		
		for(int k=0 ; k<st.size() ; k++)
		{
			System.out.println(st.get(k));
		}
	}
	
	static int nonDivisibleSubset(int k, int[] S) {

       int x=0 ;
       int res=0; 
       while(x< S.length-1)
       {
    	   for(int i=x+1 ; i<S.length ; i++)
    	   {
    		   if((S[x]+S[i])%k!=0) res++ ;
    	   }
    	   System.out.println(S[x]);
    	   x++ ;
    	   
       }
		
		return res;
    }

	
	
	
	
	
	
	
	
	
	
	
	
	public static int sherif(int[] arr , int pos )
	{
		 int time=0 ;
		
		 for(int i=0 ; i<arr.length ; i++)
		 {
			 if(arr[i]>arr[pos] && i<pos ) time=time+arr[pos] ;
			 if(arr[i]>arr[pos] && i>pos ) time=time+arr[i]-arr[pos] ;
			 else
			 {
				 time=arr[i]+arr[i] ;
			 }
		 }
		 
		
		
		return time; 
	}
	
	
	
	
	public static boolean BudyString(String a , String b)
	{
		/*if(a.length() != b.length()) return false ;
		if(a.equals(b)) {
			for (Character c : a.toCharArray()) {
				if(a.indexOf(c) != a.lastIndexOf(c)) {
					return true;
				}
			}
			return false;
		} 
		else
		{
			int indexOne = -1;
			int indexTwo = -1;
			int index = 0;
			int count = 0;
			
			for (Character c : a.toCharArray()) {
				if(count > 2) {
					return false ;
				}
				if(!c.equals(b.charAt(index))) {
					count++;
					if(indexOne != -1) indexTwo = index;
					else indexOne = index;
				}
				index++;
			} 
			
			char[] aChar = a.toCharArray();
			char[] bChar = b.toCharArray();
			
			if((aChar[indexOne] == bChar[indexTwo] && aChar[indexTwo] == bChar[indexOne]) || 
				(aChar[indexTwo] == bChar[indexOne] && aChar[indexOne] == bChar[indexTwo]) ) {
				return true;
			}else {
				return false;
			}
			
			
			
		}*/
		
		List<Character> alist = new ArrayList<Character> () ;
	
		HashMap<Character , Integer > aMap = new HashMap<Character , Integer> () ;
		HashMap<Character , Integer > bMap = new HashMap<Character , Integer> () ;
		
		if(a.length() !=b.length()) return false ;
		
		for(int i=0 ; i<a.length(); i++ )
		{
			char c= a.charAt(i) ;
			char d=b.charAt(i) ;
			Integer val = aMap.get(c) ;
			Integer val2 = bMap.get(d) ;
			if(val==null) {
				aMap.put(c, 1) ;
			}
			else {
				aMap.put(c, new Integer(val+1)) ;
			}
			
			if(val2==null) {
			bMap.put(d, 1) ;
			}
			else {
				bMap.put(d, new Integer(val2+1)) ;
			}
		}
		
	   

		for(Character c: a.toCharArray())
		{
			Integer val = aMap.get(c) ;
			Integer val2=bMap.get(c) ;
			if(val2==null) return false ;
			else {
			if(val.intValue()!=val2.intValue()) return false ;
			}
			
		}
	
	
		if(  a.length()==b.length())
		{
			int ind=0 ;
			if(a.equals(b))
			{
			for(Character c: a.toCharArray())
			{
				
				Integer val = aMap.get(c) ;
				
				if(val.intValue() >1) ind++ ;
			   	
			}
			}
			
			int count =0 ;
			for(int i=0 ;i<a.length() ;i++)
			{
				int j= a.indexOf(a.charAt(i)) ;
				int l= b.indexOf(a.charAt(i)) ;
				
				
				if(l!=j) count++ ;
				System.out.println(j+"****"+l ) ;
			}
			if(count>2 || count==0  || (ind>1 && count>2 )) return false ;
			else {
				return true ;
			}
		}
		
		return true ;
		
	}
	
	
	
	public static boolean subCommunString(String s1 , String s2)
	{
		
		for(int i=0 ; i< s1.length(); i++) {
			Character c = s1.charAt(i) ;
			if(s2.contains(c.toString())) return true ; ;
			
		}
	
		return false;
	}
	
	
	public static String longestSubstring(String s1 , String s2)
	{
		
		List<String> l = new ArrayList<String>() ;
		for(int i=0 ; i< s1.length(); i++) {
			Character c = s1.charAt(i) ;
			l.add(c.toString()) ;
			StringBuilder str = new StringBuilder(c.toString()) ;
			for(int j=i+1 ; j< s1.length(); j++) 
			     {
				Character ca = s1.charAt(j) ;
			         str.append(ca.toString()) ;
			         l.add(str.toString()) ;
			      }
		}
	     int leng =0 ;
	     StringBuilder result  =new StringBuilder() ;
		for(String st : l)
		{ 
		
			if(s2.contains(st) && st.length()>=leng)  {
				leng=st.length();
				System.out.println(st);
				result=new StringBuilder(st) ;
			}
			
		}
		return result.toString();
	}
	
	 public static int findComplement(int num) {
	     int count=0 ;
		 String s = Integer.toBinaryString(num) ;
		 System.out.println(s);
		 if(!s.contains("0")) return 0 ;
		 for(Character c : s.toCharArray()) 
		 {
			 if(c.equals('1')) count++ ;
		 }
		 return count;
	    }
	 
	 
	  static String findNumber(int[] arr, int k) {
	        /*
	         * Write your code here.
	         */
	        Integer j = Integer.valueOf(k) ;
		  if(arr.toString().contains(j.toString())) return "YES" ;
	        return "NO" ;

	    }
	  
	  static int[] oddNumbers(int l, int r) {
	        /*
	         * Write your code here.
	         */
             List<Integer> lis = new ArrayList<Integer>() ;
             for(int k=l ; k<=r ; k++)
             {
            	 if(k%2!=0) lis.add(k) ;
             }
             int[]arr = new int[lis.size()] ;
             
             int c=0 ;
             for(int k : lis )
             {
            	 arr[c]=k ;
            	 c++ ;
             }
             
             return arr ;
	    }
	
	  
	  static  int[][] solveMinesweeper(String[][] puzzleArray) {
         
		  int[][] result = new int[puzzleArray.length][puzzleArray[0].length] ;  
		  
		  List<int[]> list=new ArrayList<int[]>() ;
		   
		  for(int i=0 ; i <puzzleArray.length ; i++)
		  {
			 
			  for(int j=0 ; j <puzzleArray[0].length ; j++)
			  {
				  String mine=puzzleArray[i][j] ; 
				  int mycount=0;
				  int testCorner=0 ;
				  if(mine.equals("m")) result[i][j]=-1;
				  else
				  {
				   
				   if(i-1>=0 && j-1>=0)
				   {
			            String s=puzzleArray[i-1][j-1] ; 
			            if(s.equals("m")) {  result[i][j]= result[i][j]+1;testCorner=1; }
				   }
				   if(i-1>=0 && j+1<puzzleArray[0].length )
				   {
			            String s=puzzleArray[i-1][j+1] ; 
			            if(s.equals("m")) {result[i][j]= result[i][j]+1;testCorner=1;}
				   }
				   
				   if(i+1<puzzleArray.length && j+1<puzzleArray[0].length )
				   {
			            String s=puzzleArray[i+1][j+1] ; 
			            if(s.equals("m")) { result[i][j]= result[i][j]+1;testCorner=1;}
				   }
				   if(i+1<puzzleArray.length && j-1>=0)
				   {
			            String s=puzzleArray[i+1][j-1] ; 
			            if(s.equals("m")) { result[i][j]= result[i][j]+1;testCorner=1;}
				   }
				   if( j-1>=0)
				   {
			            String s=puzzleArray[i][j-1] ; 
			            if(s.equals("m"))result[i][j]= result[i][j]+1;
				   }
				   if( j+1<puzzleArray[0].length)
				   {
			            String s=puzzleArray[i][j+1] ; 
			            if(s.equals("m")) result[i][j]= result[i][j]+1;
				   }
				   if( i-1>=0)
				   {
			            String s=puzzleArray[i-1][j] ; 
			            if(s.equals("m")) result[i][j]= result[i][j]+1;
				   }
				   if( i+1<puzzleArray.length )
				   {
			            String s=puzzleArray[i+1][j] ; 
			            if(s.equals("m")) result[i][j]= result[i][j]+1;
				   }
				   if( i-1>=0 )
				   {
			            String s=puzzleArray[i-1][j] ; 
			            if(s.equals("m")) result[i][j]= result[i][j]*2;
				   }
				   
				   if( j-1>=0 )
				   {
			            String s=puzzleArray[i][j-1] ; 
			            if(s.equals("m")) result[i][j]= 0;
				   }
				   if(i%2!=0)
				   {
					   String s=Arrays.toString(puzzleArray[i]) ;
					   if(s.contains("m") && mycount==0) { result[i][j]=  result[i][j]*3 ;mycount=1 ;}
					   
				   }
				   if(testCorner==1)  result[i][j]=  result[i][j]*2 ;
				  }
		  }
		  }
          return result ;
	    }
	  
	  
	  static int maxFlorists(int pathLength, int[][] floristIntervals) {

		  List<int[]> list = new ArrayList<int[]>();
		  int numberfloris =0 ;
          for(int i=0 ; i<floristIntervals.length-1 ; i++ )
          {
        	for(int j=i ; j<floristIntervals.length ;j++)
        	 {
        		 int[] temp ;
        		 if(floristIntervals[i][1] > floristIntervals[j][1]) {
        			 temp = floristIntervals[i] ;
        			 floristIntervals[i] = floristIntervals[j] ;
        			 floristIntervals[j] = temp ;
        		 }
        	 }
        		 
          }
          
          for(int i=0 ; i<floristIntervals.length-1 ; i++ )
          {
        	  int test=0 ;
        	for(int j=i+1 ; j<floristIntervals.length ;j++)
        	 {
        		if( ContainArray(floristIntervals[i] ,floristIntervals[j] ) )
        		{
        			test=1 ;
        		}
        		if(numberfloris <=1 )  {
        			if(test==0 ) list.add(floristIntervals[i]) ;
        		}
        		else {
        			if(floristIntervals[i][1]<pathLength && test==0) list.add(floristIntervals[i]) ;
        		}
        		
        	 }
        		 
          }
		    for(int[] c : list)
		    {
		    	System.out.println(Arrays.toString(c));
		    }
        
		  return 0 ;
	    }
	  
	  static boolean ContainArray(int[] arr1 , int [] arr2)
	  {
		  if(arr1[0] <= arr2[0] && arr1[1] >= arr2[1] ) return true ; 
		  return false ;
	  }
	  
	  public static Character MostFrequent(String s)
	  {
		  HashMap<Character , Integer> h = new HashMap<Character , Integer>() ;
		  
		  for(int i=0 ; i<s.length() ; i++)
		  {
			  if(!h.containsKey(s.charAt(i)))  h.put(s.charAt(i), 1) ;
			  else {
				  Integer c = h.get(s.charAt(i)) ;
				  h.put(s.charAt(i), c.intValue()+1) ;
			  }
		  }
		  
		  int max=Collections.max(h.values()); 
		  for(Entry<Character , Integer> e : h.entrySet())
		  {
			   if(e.getValue()==max) return e.getKey() ;
		  }
		  
		  return s.charAt(0) ;
		  
	  }
	  
	  public static List<Integer> opp(int[]a , int[] b )
	  {
		 List<Integer> l = new ArrayList<Integer>() ;
		 for(int i=0 ; i<a.length+b.length ; i++)
		 {  
			 if(i<a.length) l.add(a[i]) ;
			 if(i>=a.length) l.add(b[i-a.length]) ;
		 }
		  Collections.sort(l) ;
		  return l;
	  }
	  
	  class BinarySearch
	  {
	      // Returns index of x if it is present in arr[l..
	      // r], else return -1
	      int binarySearch(int arr[], int l, int r, int x)
	      {
	          if (r>=l)
	          {
	              int mid = l + (r - l)/2;
	   
	              // If the element is present at the 
	              // middle itself
	              if (arr[mid] == x)
	                 return mid;
	   
	              // If element is smaller than mid, then 
	              // it can only be present in left subarray
	              if (arr[mid] > x)
	                 return binarySearch(arr, l, mid-1, x);
	   
	              // Else the element can only be present
	              // in right subarray
	              return binarySearch(arr, mid+1, r, x);
	          }
	   
	          // We reach here when element is not present
	          //  in array
	          return -1;
	      }
	   
	      // Driver method to test above
	   
	  }
	  
	  public static List<String> clean (List<String>  ls )
	  {
		  List<String> res = new ArrayList<String>() ;
		 
		for(String s : ls )
		{
			/*if(s.matches("[0-9]+.*[0-9]+.*[0-9]+"))
			{
				System.out.println(s);
				res.add(s);
			}*/
			String d = s.replaceAll("[^0-9.]", "") ;
			res.add(d);
		}
		  res.sort((a,b) -> { 
			 
			  return b.compareTo(a) ;
					  });
		  
	 
		  return res  ;
	  }
	  
	  public static Character getMaxOccurence(String s)
	  {
		  int [] count = new int[256] ;
		  int h=0 ;
		  for(int i=0 ; i<s.length(); i++)
		  {
			  count[s.charAt(i)]++ ; 
		  }
		  for(int i=0 ; i<s.length(); i++)
		  {
			  System.out.println(count[s.charAt(i)]) ;
			  System.out.println((int)s.charAt(i)) ;
			  
		  }
		  
		  return null ;
	  }
	  
	  public static void main(String[] args) {
	        BinarySearchTree tree = new BinarySearchTree();
	        /*
	                   15
	                /     \
	              10      20
	             / \     /  \
	           8  12   16  25    */
	        tree.insert(15);
	        tree.insert(10);
	        tree.insert(20);
	        tree.insert(8);
	        tree.insert(12);
	        tree.insert(16);
	        tree.insert(25);
	 
	        tree.isPairPresent(tree.root, 33);
	        
	       
	       /* List<String> ls =Arrays.asList( "1.2.34", "$5.j8", "3.4#", "3.45") ;
	        List<String> res = clean(ls) ;
	        
	        res.forEach(r  -> System.out.println(r));*/
	        
	        //Character c = getMaxOccurence("DIDI") ;
	        /*List<Integer> myl= new ArrayList<Integer>();
	        myl.add(1); myl.add(0) ;myl.add(2) ;myl.add(1);myl.add(2); myl.add(4);myl.add(7); myl.add(8);
	        System.out.println("result is" +threeSum(myl ,4)) ;*/
	        Stack<Integer> s1 = new Stack<Integer>() ;
	        Stack<Integer> s2 = new Stack<Integer>() ;
	        s1.push(1) ;s1.push(2) ; s1.push(4) ; s2.push(3) ; s2.push(5) ;
	        //MergetwoStack(s1 , s2) ;
	       String d="d";
	       String dt=""+"d" ;
 	     System.out.println(d.equals(dt));
 	     int [] testd = {1,3,6, 5 ,4,5} ;
 	     System.out.println(angram("abcabacbbccaaabc" , "aaaaaabbbbbcccc"));
 	     LinkedList<Integer> lk = new LinkedList<Integer>();
 	     lk.add(1) ;
 	     lk.add(3) ;
 	     lk.add(1) ;
 	     
 	     for(int i=0 ; i<lk.size() ; i++)
 	     {
 	    	 System.out.println(lk.get(i));
 	     }
 	     
 	    Singleton.INSTANCE.setCount(2);
 	   Singleton.INSTANCE.doProcess();
 	    
	  }
	  public static boolean angram(String s , String d )
	  {
		  int [] countS= new int [256] ;
		  int [] countD= new int [256] ;
		  if(s.length()!=d.length()) return false ;
		  for(char c : s.toCharArray())
		  {
			  countS[c]++ ; 
		  }
		  
		  for(char c : d.toCharArray())
		  {
			  countD[c]++ ; 
		  }
		  
		  for(char c : s.toCharArray())
		  {
			  if(countD[c]!=countS[c]) return false  ; 
		  }
		  
		  
		  return true ;
	  }
	  
	  public static int sum(int [] arr)
	  {
		  int sum1=0 , sum2=0 ;
		  int i=0 , j=arr.length;
		  if(arr.length%2 !=0) j=arr.length-1 ;
		  while(i<j)
		  {
			  if(i%2==0) sum1=sum1+arr[i] ;
			  else sum2=sum2+arr[i] ;
			  i=i+1 ;
		  }
		  return sum1>sum2 ? sum1 : sum2 ;
	  }
	      public static boolean palindrome(String s)
	      {
	    	  StringBuilder st = new StringBuilder() ;
	    	  for(int i=s.length()-1 ; i>=0 ; i--)
	    	  {
	    		 st.append(s.charAt(i)) ;
	    	  }
	    	  if(s.equals(st.toString())) return true ;
	    	  return false ;
	      }
	  
	    public static boolean  threeSum(List<Integer> l ,int  target) {
	    	
	    	int start =0 ;
	    	boolean b=false ;
	    	int end = l.size()-1 ;
	    	Set<String> h = new HashSet<String>() ;
	    	Collections.sort(l);
	    	while(start<end)
	    	{
	    		if(l.get(start)+l.get(end) >=target) {
	    			
	    			end-- ;
	    		}
	    		else {
	    			     for(int j=start+1 ; j<end ; j++)  {
	    			    	
	    			    	 if(l.get(start)+l.get(j)+l.get(end)==target) { 
	    			    		 h.add(l.get(start)+""+l.get(j)+""+l.get(end));
	    			    		 b= true ;}
	    			          }
	    			           start++ ;
	    		        }
	    	}
	
	    	Iterator<String> it = h.iterator() ;
	    	while(it.hasNext()) {
	    		System.out.println(it.next());
	    	}
	    	return b ;
	    }
	  
	 
}


class Node {
    
    int data;
    Node left, right;
     
    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BinarySearchTree
{
     
    // Root of BST
    Node root;
 
    // Constructor
    BinarySearchTree() { 
        root = null; 
    }
     
    // Inorder traversal of the tree
    void inorder()
    {
        inorderUtil(this.root);
    }
     
    // Utility function for inorder traversal of the tree
    void inorderUtil(Node node)
   {
        if(node == null)
            return;
         
        inorderUtil(node.left);
        System.out.print(node.data + " ");
        inorderUtil(node.right);
    }
     
    // This method mainly calls insertRec()
    void insert(int key) {
    root = insertRec(root, key);
    }
     
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int data) {
 
        /* If the tree is empty, return a new node */
       /* if (root == null) {
            root = new Node(data);
            return root;
        }
 
        /* Otherwise, recur down the tree */
      /*  if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);*/
    	
 
        return root;
    }
     
    // Method that adds values of given BST into ArrayList
    // and hence returns the ArrayList
    ArrayList<Integer> treeToList(Node node, ArrayList<Integer>
                                                      list)
    {     
        // Base Case
        if(node == null)
            return list;
         
        treeToList(node.left, list);
        list.add(node.data);
        treeToList(node.right, list);
         
        return list;
    }
     
    // method that checks if there is a pair present
    boolean isPairPresent(Node node, int target)
    {   
        // This list a1 is passed as an argument
        // in treeToList method 
        // which is later on filled by the values of BST
        ArrayList<Integer>a1 = new ArrayList<>(); 
         
        // a2 list contains all the values of BST 
        // returned by treeToList method
        ArrayList<Integer> a2 = treeToList(node, a1); 
         
        int start = 0; // Starting index of a2
         
        int end = a2.size() - 1; // Ending index of a2
 
        while(start < end)
        {
         
        if(a2.get(start) + a2.get(end) == target) // Target Found!
        {
            System.out.println("Pair Found: "+a2.get(start)+
                      " + "+a2.get(end)+" " + "= "+ target);
            return true;
        }
         
        if(a2.get(start) + a2.get(end)>target) // decrements end
        {
            end--;
        }
         
        if(a2.get(start) + a2.get(end)<target) // increments start
        {
            start++;
        }
    }
 
        System.out.println("No such values are found!");
        return false;
    }
         
    // Driver function
    

}
 


 