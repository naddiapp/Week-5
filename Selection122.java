import java.util.Scanner;

public class Selection122 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        System.out.print("Input a number = ");
        int number = input22.nextInt();
        if(number%2 == 0){
            System.out.println(number+" is an even number!");
        }else{
            System.out.println(number+" is an odd number!");
        }
    }
}
