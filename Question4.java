import java.math.MathContext;

import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;

public class Question4 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter age:  ");
        age=Integer.parseInt(System.console().readLine());

        if (age>=0 && age<=15) {
            System.out.print("Childhood");
        }else if (age>=16 && age<=25) {
            System.out.println("Youth");
        }else if (age>=26 && age<=55) {
            System.out.println("Adulthood");
        }else if (age<0) {
            System.out.println("Invalid age");
        }else{
            System.out.print("Seniority");
        }
    }
}
