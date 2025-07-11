import java.util.Scanner;
class SumOfDigits{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of digits:");
int num=sc.nextInt();
int sum=0;
while(num!=0){
int digit=num%10;
sum=sum+digit;
num=num/10;
}
System.out.println("Sum Of digits are :"+sum);
}
}
