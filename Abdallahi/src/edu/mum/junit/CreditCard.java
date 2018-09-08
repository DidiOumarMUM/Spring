package edu.mum.junit;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
	
	public final static  void main(String[] args) 
	
	
	{
		
		List<String> ls = new ArrayList<String>();
		ls.add("4123456789123456");
ls.add("5123-4567-8912-3456");
ls.add("61234-567-8912-3456") ;
ls.add("4123356789123456");
ls.add("5133-3367-8912-3456");
ls.add("5123 - 3567 - 8912 - 3456");
      for(String s : ls)
      {
		System.out.println(validCredit(s));
      }
	}

	public static String  validCredit(String s)
	{
		int max=0 ;
		int c=1 ;
		String d=s ;
		if(s.matches("[4-6][0-9]{3}-[0-9]{4}-[0-9]{4}-[0-9]{4}")){
			d=s.replaceAll("-", "") ;
			//System.out.println(d);
		}
		for(int i=1 ; i<d.length() ; i++)
		{
			//Character ch = s.charAt(i);
			//if(ch.equals('-')) System.out.println("her"+i);
			if(d.charAt(i)==(d.charAt(i-1))) c=c+1;
			if(c>max) max=c ; 
			
			if(d.charAt(i)!=d.charAt(i-1))
				{
				  c=1 ;
				       
				}
			
		}
		//System.out.println(max);
		if(d.matches("[4-6][0-9]{15}")  && max<4) 
			return "valid" ;
		else return "invalid" ;
	}
}
