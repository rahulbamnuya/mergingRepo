import java.io.*;
import java.util.*;
class calc
{

	public int add(int n1, int n2,int n3){
		return n1+n2+n3;
	}
	public int add(int n1, int n2){
		return n1+n2;
	}

}
public class Addition
{ 
  public static void main(String args[])throws IOException
  {
    int a,b,sum;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	a=Integer.parseInt(br.readLine());
	System.out.println("enter second number");
	b=sc.nextInt();
    calc obj=new calc();
	sum=obj.add(a,b);
	System.out.println("addition "+ sum);
	
	sc.close();;
  }
}
