import java.util.Scanner;

public class Selection222 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        System.out.print("Nilai uas : ");
        float finalExam = input22.nextFloat();
        System.out.print("Nilai uts : ");
        float midExam = input22.nextFloat();
        System.out.print("Nilai kuis : ");
        float quiz = input22.nextFloat();
        System.out.println("Nilai tugas : ");
        float assignment = input22.nextFloat();
        float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assignment * 0.2F);
        String message = total < 65 ? "Retake" : "Pass";
        System.out.println("Final Grade = "+ total + " and the decission is" + message);
    }
}
