package loops;
public class Primenumber{
    public static void main(String[] args) {
        int num;
        Boolean isprime=true;
        System.out.println("Enter the number");
        num=Integer.parseInt(System.console().readLine());

        for (int i = 1; i < args.length; i++) {
            if (num%i==0) {
                isprime=false;
                break;
            }
            
        }
        if (isprime) {
            System.out.println("Prime");
        }else{
            System.out.print("Not prime");
        }
    }
}
