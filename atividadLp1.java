import java.util.Scanner;
public class atividadLp1{

    public static void main(String[] args) {
    Scanner nome = new Scanner(System.in);
    Scanner nota = new Scanner(System.in);

    //variaveis
    double nota1, nota2, nota3, media, notaFaltante;
    String nomeAluno;

    //entrada de dados
        //lembrando que a nota maxima é 100 pontos
        //conciderando que a nota do aluno não é inteira, e sim com virgula

    System.out.println("Digite seu nome");
    nomeAluno = nome.nextLine();
    System.out.println("Digite sua primeira nota");
    nota1 = nota.nextDouble();
    System.out.println("Digite sua segunda nota");
    nota2 = nota.nextDouble();
    System.out.println("Digite sua terceira nota");
    nota3 = nota.nextDouble();

    //processamento de dados (futuramente sera realizado em outra classe)
        //lembrando que a nota maxima é 100 pontos

    media = nota1 + nota2 + nota3;
    notaFaltante = 60 - media;
    //saida de dados

    if (media >= 60){
    System.out.println(nomeAluno+" você esta APROVADO, sua nota é:"+media);
    }
    else{
        System.out.println(nomeAluno+" você esta REPROVADO, sua nota é:"+media+" , faltam"
        +notaFaltante+"para voce passar");
    }
   

    }
    
    }