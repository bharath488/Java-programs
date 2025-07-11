import java.util.Scanner;
class FibonacciSeries{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of terms:");
int n=sc.nextInt();
int first=0;
int second=1;
System.out.print("FibonacciSeries : "+first+" "+second);
for(int i=3;i<=n;i++){
int next=first+second;
System.out.println(" "+next);
first=second;
second=next;
}
}
}
