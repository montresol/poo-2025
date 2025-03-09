package AulaJava.exercicioJava.exercicio2;

import javax.swing.JOptionPane;

public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public Float saldo;

    public Cliente() {
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.nome = "Desconhecido";
        this.saldo = 0.0f;
    }

    public void realizarDeposito(float x) {
        this.saldo = saldo + x;

    }

    public void realizarSaque(float y) {
        if (this.saldo >= y) {
            this.saldo -= y;
        } else {
            JOptionPane.showMessageDialog(null,
                    "Saque não pode ser realizado, saldo não pode ser menor que 0.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void exibirDetalhes() {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Número da agencia: " + numeroAgencia);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo atual: " + saldo);
    }

}
