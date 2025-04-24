import java.util.Scanner; //biblioteca importada

public class Main { //classe publica
    public static void main(String[] args) { //void é uma classe estática e não retorna nenhum valor

        Scanner numero1Scanner = new Scanner(System.in); //comando para input
        System.out.print("Diguite o primeiro numero:"); //mensagem apos digitar
        int numero1 = numero1Scanner.nextInt(); //variavel

        //repete abaixo entrada de outro número para soma

        Scanner numero2Scanner = new Scanner(System.in);
        System.out.print("Digite o segundo numero:");
        int numero2 = numero2Scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("O resultado é: " + resultado);

       // System.out.println(numero1); //imprimir na tela
        // System.out.println(numero2); //imprimir na tela

    }
}