import java.util.Scanner;
public class atividadLp1{

    public static void main(String[] args) {
    Scanner nome = new Scanner(System.in);
    Scanner nota = new Scanner(System.in);
        estudante estu = new estudante();

    //variaveis
        //na classe estudante

    //entrada de dados
        //lembrando que a nota maxima é 100 pontos
        //conciderando que a nota do aluno não é inteira, e sim com virgula

    System.out.println("Digite seu nome");
    estu.nomeAluno = nome.nextLine();
    System.out.println("Digite sua primeira nota");
    estu.nota1 = nota.nextDouble();
    System.out.println("Digite sua segunda nota");
    estu.nota2 = nota.nextDouble();
    System.out.println("Digite sua terceira nota");
    estu.nota3 = nota.nextDouble();

    //processamento dos dados, em outra classe
        //lembrando que a nota maxima é 100 pontos
        estu.mediaAluno();
 
    //saida de dados
        estu.desempenhoAluno();

    }
    
    }