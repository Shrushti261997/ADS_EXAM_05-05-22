import java.util.Scanner;

class Sorting{
	
	static void print(int a1[]){
			for(int n:a1)
			{
				System.out.print(n + "  ");
			}
			System.out.println();
	}
	
	static void sorting(int a1[]){
		int len=a1.length;
		int ele=a1[len-1];
	for(int i=len-2;i>=0;i--)
	{
		if(a1[i]>ele)
		{
			a1[i+1]=a1[i];
			print(a1);
		}
		else
		{
			a1[i+1]=ele;
			print(a1);
			break;
		}
		if((i==0) && (a1[i]>ele))
		{
			a1[i] = ele;
			print(a1);
		}
	}
	}
	
	//  ----------------------Static output---------------
	public static void main(String args[]){
		int a1[]={1,2,4,5,3};
		//Sorting s = new Sorting();
		sorting(a1);
	}
	
	
	/*   -------Dynamic Output------------------
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a1[] = new int[num];
		
		for(int i=0;i<num; i++)
		{
			a1[i]=sc.nextInt();
		}
	}
	*/
}