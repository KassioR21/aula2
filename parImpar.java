import java.util.Scanner;

public class parImpar {

    public static void main(String [] args){
Scanner entrada = new Scanner(System.in);
int num = entrada.nextInt();

if (num % 2 == 0){
    System.out.println("O número é par.");
}else{
    System.out.println("O número é ímpar.");
}
entrada.close();
    }
}