package Iterator;

import java.util.*;

//  Write a function using Core Java that accepts a List of Strings in its argument. 
//  Use an Iterator to Print the last character of each string in the List.

public class LastCharOfEachStringList
{
   public static void main(String[] args)
   {
	   List<String> list=new ArrayList<>();
	   list.add("haresh");
	   list.add("harry");
	   list.add("potter");
	   list.add("Meena");
	   
	   Iterator<String> itr=list.iterator();
	   while(itr.hasNext())
	   {
	   String s = itr.next();
	   System.out.println(s.substring(s.length()-1));
	   // s.length()-1  it will return the last char of each string in list
	  }
 }
}
