import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Digite o Valor da tabuada: ");
            int numero = scanner.nextInt();
            
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "X" + i + "=" + numero * i );
        }
        }
    }
}
