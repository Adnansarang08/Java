import javax.lang.model.util.ElementScanner14;

public class ifelsenested{
    public static void main(String[] args) {
        int num;
        System.out.print("Enter the number:  ");
        num=Integer.parseInt(System.console().readLine());

        if(num%2==0){
            if(num%4==0){
                System.out.println("Number is even and divisible by 4");
            }else{
                System.out.println("Number is even and not divisible by 4");
            }
        }else{
            if(num>0){
                System.out.println("Number is odd and positive");                
            }else{
                System.out.println("Number is odd and negative");
            }
        }
    }
}