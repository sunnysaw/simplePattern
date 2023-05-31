import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int start,Input,SecondStart,Number = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        Input = input.nextInt();
        System.out.println("Printing the result : ");
        for (start = 1; start <= Input; start++){
            for (SecondStart = 1; SecondStart <= start; SecondStart++){
                System.out.print( " " + Number);
            }
            System.out.println();
            Number++;
        }
    }
}