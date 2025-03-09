package AulaJava.exercicioJava.exercicio3;

public class Produto {
    public int id;
    public String descricao;
    public int qtde;
    public float preco;

    public Produto() {
        this.id = 0;
        this.descricao = "Indefinida";
        this.qtde = 0;
        this.preco = 0.0f;
    }

    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void comprar(int x) {
        if (x > 0) {
            this.qtde += x;
            System.out.println("Compra realizada: " + x + " unidades.");
        } else {
            System.out.println("Quantidade inválida para compra.");
        }
    }

    public void vender(int x) {
        if (x > 0 && x <= this.qtde) {
            this.qtde -= x;
            System.out.println("Venda realizada: " + x + " unidades.");
        } else {
            System.out.println("Quantidade inválida para venda.");
        }
    }

    public void subir(float x) {
        if (x > 0) {
            this.preco += x;
            System.out.println("Preço aumentado em: R$" + x);
        } else {
            System.out.println("Valor inválido para aumento de preço.");
        }
    }

    public void descer(float x) {
        if (x > 0) {
            this.preco -= x;
            System.out.println("Preço diminuído em: R$" + x);
        } else {
            System.out.println("Valor inválido para diminuição de preço.");
        }
    }

    public void mostra() {
        System.out.println("ID: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + qtde);
        System.out.println("Preço: R$" + preco);
    }
}