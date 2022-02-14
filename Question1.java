public class Question1 {
   public static void main(String[] args) {
       int num;
       System.out.println("Enter the number");
       num=Integer.parseInt(System.console().readLine());

       if (num % 5 ==0 && num % 3 !=0) {
           System.out.println("Number is divisible by 5");
       }else{
           System.out.println("Number is not divisible by 3");
       }

           
       }
   }