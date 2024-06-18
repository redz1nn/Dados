import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("{***Digite seu Primeiro Nome:***}");
    String nome = sc.next();

    System.out.println("{***Digite seu Sobrenome:***}");
    String sobrenome = sc.next();

    System.out.println("{***Digite sua Idade:***}");
    int idade = sc.nextInt();
    
    System.out.println("{***Digite sua Altura em Metros:***}");
    double altura = sc.nextDouble();
    
    System.out.println("{***Digite sua Massa em Quilogramas:***}");
    double massa = sc.nextDouble();

    double imc = massa / (altura * altura);

    System.out.println("");
    System.out.println("- Seu nome completo é: " + nome + " " + sobrenome);
    System.out.println("- Sua idade é: " + idade + " anos");
    System.out.println("- Sua altura é: " + altura + " metros");
    System.out.println("- Sua massa é: " + massa + " kg");
    System.out.println("- Seu IMC é de: " + imc );

    sc.close();
  }
}