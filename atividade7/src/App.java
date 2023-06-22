import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int base;
        int altura;
        int dobro;
        System.out.printf("Informe a base do quadrado: ");
        base = ler.nextInt();
        System.out.printf("Informe a altura do quadrado: ");
        altura = ler.nextInt();
        dobro = ((base*altura)*2);
        System.out.println("A aréa do quadrado é " + (base*altura));
        System.out.println("O dobro da aréa do quadrado é: " + dobro);

    }
}
