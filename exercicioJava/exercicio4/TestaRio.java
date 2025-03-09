package AulaJava.exercicioJava.exercicio4;

import javax.swing.JOptionPane;

public class TestaRio {

    public static void main(String[] args) {
        Rio rio1 = new Rio("Amazonas", 50.0f, false);
        Rio rio2 = new Rio();

        rio2.nome = JOptionPane.showInputDialog("Nome: ");
        rio2.nivel = Float.parseFloat(JOptionPane.showInputDialog("Nivel: "));
        String inputPoluido = JOptionPane.showInputDialog("O rio está poluído? (true/false)");
        boolean poluido = Boolean.parseBoolean(inputPoluido);

        rio2.setPoluido(poluido);

        System.out.println("Rio 1:");
        rio1.mostra();
        System.out.println("\nRio 2:");
        rio2.mostra();

        rio1.chover(10.0f);
        rio1.ensolarar(5.0f);
        rio1.sujar();

        System.out.println("\nRio 1 após as operações:");
        rio1.mostra();

        rio2.chover(20.0f);
        rio2.sujar();
        rio2.limpar();

        System.out.println("\nRio 2 após as operações:");
        rio2.mostra();
    }

}
