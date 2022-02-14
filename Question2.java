public class Question2 {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter year");
        year=Integer.parseInt(System.console().readLine());

        if(year % 4 == 0){
            System.out.println("The year is a leap year");
        }else if(year % 4 != 0){
            System.out.println("The year is not a leap year");
        }
    }
    
}
