public class Switchcase {
    public static void main(String[] args) {
        
        char grade;
        System.out.println("Enter the grade:  ");       
        grade=System.console().readLine().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent performance");
                break;
                case 'B':
                System.out.println("Good performance");
                break;
                case 'C':
                System.out.println("Average performance");
                break;
                case 'D':
                System.out.println("Bad performance");
                break;        
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}
