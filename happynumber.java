import java.util.Scanner;
public class happynumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter any number:");
         int num= sc.nextInt();
        
         while (num!=1 && num!=4){
            int sum=0;
            while(num>0){
                int digit= num%10;
                sum = sum + digit*digit;
                num=num/10;
            }
            num=sum;
         }
         if(num==1){
            System.out.println("Happy number ");
         }

         else{
            System.out.println("Sad number ");
         }
    }}
