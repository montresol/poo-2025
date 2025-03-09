package AulaJava.exercicioJava.exercicio2;

import javax.swing.JOptionPane;

public class TestaCliente {

    public static void main(String[] args) {

        Cliente Fulano = new Cliente();
        Fulano.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Número da conta"));
        Fulano.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Número da agencia"));
        Fulano.nome = JOptionPane.showInputDialog("Nome");
        Fulano.saldo = Float.parseFloat(JOptionPane.showInputDialog("Saldo"));
        Fulano.exibirDetalhes();
        Fulano.realizarDeposito(100);
        Fulano.realizarSaque(50);
        Fulano.exibirDetalhes();

        Cliente Beltrano = new Cliente();
        Beltrano.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Número da conta"));
        Beltrano.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Número da agencia"));
        Beltrano.nome = JOptionPane.showInputDialog("Nome");
        Beltrano.saldo = Float.parseFloat(JOptionPane.showInputDialog("Saldo"));
        Beltrano.exibirDetalhes();
        Beltrano.realizarDeposito(100);
        Beltrano.realizarSaque(50);
        Beltrano.exibirDetalhes();
    }

}
