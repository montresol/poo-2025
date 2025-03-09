package AulaJava.exercicioJava.exercicio1;

import javax.swing.JOptionPane;

public class TestaAluno {
    public static void main(String[] args) {

        Aluno obj1 = new Aluno();
        obj1.nome = JOptionPane.showInputDialog("Nome do Aluno");
        obj1.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Número do Aluno"));
        obj1.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        obj1.p1 = Float.parseFloat(JOptionPane.showInputDialog("Prova 1"));
        obj1.p2 = Float.parseFloat(JOptionPane.showInputDialog("Prova 2"));
        obj1.DadosAlunos();
        obj1.notaFinal();
        obj1.PassarAluno();
    }
}
