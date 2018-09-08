import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class jav8test {
	public static  String Java8test(String t)
	{   System.out.println(t);
		if(t==null || t.length()<=1) return t ;
		return Java8test(t.substring(0, t.length()-2) + t.charAt(t.length()-1)) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String res = Java8test("flexton") ;
		System.out.println(res);
		
		String did = "di" ;
		System.out.println("*****"+did.substring(0, 0));

		List<String> l = new ArrayList<String>();
		l.add("didi"); l.add("oumar"); l.add("abc") ;
		
  // sort using java 7 
		Collections.sort(l , new Comparator<String>() {
			@Override
			public int compare(String s , String d )
			{
				return d.compareTo(s) ;
			}
		});
		l.forEach(c  -> System.out.println(c));
		// sort using java 8
		Collections.sort(l , (s1 ,s2) ->  s1.compareTo(s2));
		l.forEach(c  -> System.out.println(c));
		List<String> fil = l.stream().filter(s -> s.length()==4).collect(Collectors.toList()) ;
		fil.forEach(System.out::println);
	}

}
