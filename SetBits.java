import java.util.Scanner;
class SetBits{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int n=sc.nextInt();
int count=0;
while(n>0){
if((n&1)==1){
count++;
}
n=n>>1;
}
System.out.print("The number of set bits are : "+count);
}
}
