import java.io.*;
import java.util.*;
import java.util.regex.*;
class Triple
{
  public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,i;
    ArrayList<Integer>res = new ArrayList<>();
    String text=sc.nextLine();
    String a[]=new  String[100];
    n=Integer.parseInt(sc.nextLine());
    	for(i=0;i<n;i++)
   	 {
      	a[i]=sc.nextLine();
   	 }
		for(i=0;i<n;i++)
		{ for(int j=-1;(j=text.indexOf(a[i],j+1)) !=-1;)
		{ res.add(j);
		}
		}
	Collections.sort(res);
	for(Integer k:res)
	System.out.print(k+" ");
 }
}