import java.util.HashMap;
import java.util.List;

public class BinaryTree {
	
	BinaryNode root ;
	
	public BinaryTree(int val)
	{
		this.root=new BinaryNode(val) ;
	}
	
	public BinaryNode insertNode(BinaryNode node , int val)
	{
		BinaryNode myNode = node ;
		if(myNode==null) myNode = new BinaryNode(val) ;
		
		if(myNode.data<val )
				{
					if(myNode.right==null)
								{
									myNode.right=new BinaryNode(val) ;
								
								}
					else {
						     return insertNode(myNode.right , val);
					     }
				}
		else {
						if(myNode.left==null)
						{
						myNode.left =new BinaryNode(val) ;
										
							}
						else
							{return insertNode(myNode.left , val);
							
							}
			 }
					
				
		return null ;
	}
	
	public void print(BinaryNode root)
	{
		if(root==null) return ;
		print(root.left) ;
		System.out.println(root.data);
		print(root.right) ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bin =new BinaryTree(5) ;
		bin.insertNode(bin.root, 3) ;
	 	bin.insertNode(bin.root, 10) ;
		bin.insertNode(bin.root, 1) ;
		bin.insertNode(bin.root, 2) ;
		bin.insertNode(bin.root, 12) ;
		bin.insertNode(bin.root, 11) ;
		bin.insertNode(bin.root, 4) ;
		bin.print(bin.root);
		String s = "didi" ;
	//System.out.println("***LCA"+ bin.LCA(1 , 4 ) );
		String rev = reverse("onaitsirc") ;
		//System.out.println(s.substring(1 , s.length()) );
		System.out.println(rev );
		System.out.println( removedup("geeksforgeeks"));
		
	}
	
	public int LCA (int a , int b )
	{
		BinaryNode parentA =  getParent(this.root ,a) ;
		BinaryNode parentB =  getParent(this.root ,b) ;
		HashMap<BinaryNode , Boolean> muhash = new HashMap<BinaryNode , Boolean>();
		while(parentA!=null)
		{
			muhash.put(parentA, true) ;
			parentA=getParent(this.root ,parentA.data) ;
		}
		while(parentB!=null)
		{
		           if(muhash.containsKey(parentB)) return parentB.data ;
		           parentB=getParent(this.root ,parentB.data) ;	   
		}
		return this.root.data ;
		
		
	}
	
	public static BinaryNode getParent(BinaryNode node , int a)
	{
		BinaryNode mynode = new BinaryNode(a);
		
		if(node==null || mynode.data==node.data) return null;

	    else 
	    {
	    	System.out.println(node.data);
	    	if(node.data <a )
	    		{ 
	    		  if( node.right.data==a) return node;
	    		  else return getParent(node.right , a) ;
	    		}
	    	else {
	    		if(node.left.data==a ) return node ;
	    		
	    		else return getParent(node.left , a);
	    	}
	    }
	}
	
	public static String reverse(String s)
	{
		 
		if(s.length()==1) return s ;
		return reverse(s.substring(1,s.length()))+s.charAt(0) ;
	}
	
	public static String removedup(String s)
	{
		boolean b= true ;
		for(int i=0 ; i<s.length()-1; i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				b=false ;
				break ;
			}
		}
		       if(b) return s ;
				else 
				{
					
					String d ="";	
					for(int i=0 ; i<s.length()-1; i++)
						{   
									if(s.charAt(i)==s.charAt(i+1))
									{
										
										d=s.substring(0, i) ;
										if(i+2<=s.length()-1) {
											d=d+s.substring(i+1) ;
										}
										break ;
									}
						}
						return removedup(d) ;
				}
		
	}

}

class BinaryNode {
	
	int data ;
	BinaryNode left , right ;
	public BinaryNode(int val)
	{
		this.data=val ;
		this.left=this.right=null ;
	}
	
}
