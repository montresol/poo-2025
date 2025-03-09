package AulaJava.exercicioJava.exercicio1;

//import javax.swing.JOptionPane;

public class Aluno {
    public String nome;
    public int numeroAluno;
    public int idade;
    public float p1;
    public float p2;

    public Aluno() {
        this.nome = "Nome";
        this.numeroAluno = 001;
        this.idade = 20;
        this.p1 = 7.0f;
        this.p2 = 8.5f;
    }

    public void notaFinal() {
        float Nfinal = (p1 + p2) / 2;
        System.out.println("Nota Final: " + Nfinal);
    }

    public void DadosAlunos() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Número do Aluno: " + numeroAluno);
        System.out.println("idade: " + idade);
        System.out.println("p2: " + p2);
        System.out.println("p1: " + p1);
    }

    public void PassarAluno() {
        float Nfinal = (p1 + p2) / 2;
        if (Nfinal >= 6.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }

}