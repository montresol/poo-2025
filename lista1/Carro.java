package AulaJava.lista1;

/*
public class Carro{
//metodos
        public void exibirDetalhes(){ no usages
            // this representa o objeto que chama o metodo
           System.out.println("Modelo: " + this.marca +
             "\n Modelo: " + this.modelo +
             "\n Ano " + this.ano +
             "\n Velocidade " + this.velocidade +

             public String marca, modelo;
             //metodo cnstrutor

        }
}
*/

import javax.swing.JOptionPane;

public class Carro {
    public int ano;
    public float velocidade;
    public String marca;
    public String modelo;

    public Carro() {
        this.ano = 2023;
        this.velocidade = 0.0f;
        this.marca = "Desconhecida";
        this.modelo = "Desconhecido";
    }

    public Carro(int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    public void exibirDetalhes2() {
        JOptionPane.showMessageDialog(null, modelo, marca, ano);
    }

    // acelerar o carro de x unidades
    public void acelerar(float x) {
        this.velocidade = this.velocidade + x;
    }

    // frear o carro em x unidades
    // velocidade não pode ficar negativa após a freagem
    public void frear(float x) {
        if (this.velocidade >= x) {
            this.velocidade -= x;
        } else {
            JOptionPane.showMessageDialog(null,
                    "A velocidade de frenagem é maior que a velocidade atual do carro.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);

        }
    }
}
