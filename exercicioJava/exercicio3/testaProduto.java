package AulaJava.exercicioJava.exercicio3;

import javax.swing.JOptionPane;

public class testaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Camiseta", 50, 29.99f);
        Produto produto2 = new Produto();

        produto2.id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        produto2.descricao = JOptionPane.showInputDialog("Descrição: ");
        produto2.qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
        produto2.preco = Float.parseFloat(JOptionPane.showInputDialog("Preço: "));

        System.out.println("Produto 1:");
        produto1.mostra();
        System.out.println("\nProduto 2:");
        produto2.mostra();

        produto1.comprar(20);
        produto1.vender(10);
        produto1.subir(5.00f);
        produto1.descer(2.00f);

        System.out.println("\nProduto 1 após as operações:");
        produto1.mostra();

        produto2.comprar(10);
        produto2.vender(5);
        produto2.subir(3.00f);
        produto2.descer(1.00f);

        System.out.println("\nProduto 2 após as operações:");
        produto2.mostra();
    }
}