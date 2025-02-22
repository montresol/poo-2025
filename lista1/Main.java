/*jdk 23

cread

this windwos


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

new

new java class

public class Carro{
    //cujo tipo de dados primitivos
    public int ano;
    public float velocidade;
    //cujo tipo de dados são Classes
    public String marca;modelo
    
}

public class Main {
    public static void main(String[] args) {
        //criação dos objetos da classe Carro
        Carro obj1 = new Carro();
        obj1.ano = 2022;
        obj1.velocidade = 0;
        obj1.marca = "Chavrolet"
        obj1.modelo = "Onix"

        obj1.exibirDetalhes();

        Carro obj2 = new Carro();
        obj2.ano = 2023;
        obj2.velocidade = 10;
        obj2.marca = "Fiat"
        obj2.modelo = "Uno"

        
    }
}
*/

package AulaJava.lista1; // Adicione o pacote correto conforme a estrutura de pastas

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Carro obj1 = new Carro();
        obj1.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
        obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Velocidade"));
        obj1.marca = JOptionPane.showInputDialog("Informe marca");
        obj1.modelo = JOptionPane.showInputDialog("Informe modelo");
        obj1.exibirDetalhes();
        obj1.acelerar(500);
        obj1.exibirDetalhes();

        Carro obj2 = new Carro(2023, 30, "Fiat", "Uno");
        obj2.exibirDetalhes();
        obj2.acelerar(60);
        obj2.exibirDetalhes();
        obj2.frear(30);
        obj2.exibirDetalhes();
    }
}

// fazer e inventar uma classe com 4 variaves (trabalho)