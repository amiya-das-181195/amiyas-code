import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num= sc.nextInt();

        System.out.println(sumOf(num));
    }
    public static int sumOf(int number){

        int sum=0;
        while(number>0){

            sum=sum+number%10;
            number=number/10;
        }


        return sum;
    }

}
