import java.util.Scanner;

class revereTheDigitsOfaNumber{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        System.out.println(renum(num));

    }
    public static int renum(int number){
        int ans =0;
        while(number>0) {
            ans = (ans * 10) + number % 10;
            number = number / 10;
        }

        return ans;
    }
}