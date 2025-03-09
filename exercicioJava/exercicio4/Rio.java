package AulaJava.exercicioJava.exercicio4;

public class Rio {

    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public Rio() {
        this.nome = "Desconhecido";
        this.nivel = 0.0f;
        this.poluido = false;
    }

    public void chover(float quantidade) {
        if (quantidade > 0) {
            this.nivel += quantidade;
            System.out.println("Chuva: o nível do rio aumentou em " + quantidade + " metros.");
        } else {
            System.out.println("Quantidade de chuva inválida.");
        }
    }

    public void ensolarar(float quantidade) {
        if (quantidade > 0 && this.nivel - quantidade >= 0) {
            this.nivel -= quantidade;
            System.out.println("Sol: o nível do rio diminuiu em " + quantidade + " metros.");
        } else {
            System.out.println("Quantidade de ensolaramento inválida ou nível do rio muito baixo.");
        }
    }

    public void limpar() {
        this.poluido = false;
        System.out.println("O rio foi limpo.");
    }

    public void sujar() {
        this.poluido = true;
        System.out.println("O rio foi poluído.");
    }

    public void setPoluido(boolean poluido) {
        this.poluido = poluido;
    }

    public void mostra() {
        System.out.println("Nome do rio: " + nome);
        System.out.println("Nível do rio: " + nivel + " metros");
        System.out.println("O rio está " + (poluido ? "poluído" : "limpo"));
    }

}
