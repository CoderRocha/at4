import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int A = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = input.nextInt();

        int C;
        if (A == B) {
            C = A + B;
        } else {
            C = A * B;
        }

        System.out.println("O resultado é: " + C);
    }
}
