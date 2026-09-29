


public class neonnumber{
    public static void main(String[] args){
int num = 9;
int sq=num*num;
int sum=0;
while(sq>0){
int digit=sq %10;
sum=sum+digit;
sq= sq/10;
}
if(sum==num)
{System.out.print(num+ "is a neon number");}
else
    {  System.out.print(num+ "is a neon number");  
}
    }
}