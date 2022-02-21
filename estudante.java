
//essa é a outra classe
public class estudante {
    double nota1, nota2, nota3, media, notaFaltante;
    String nomeAluno;
        
    public void mediaAluno(){
        media = nota1 + nota2 + nota3;
    }

    public void desempenhoAluno(){
        if (media >= 60){
            System.out.println(nomeAluno+" você esta APROVADO, sua nota é:"+media);
            }
            else{
                notaFaltante = 60 - media;
                System.out.println(nomeAluno+" você esta REPROVADO, sua nota é:"+media+" , faltam"
                +notaFaltante+" para voce passar");
            }
}
}