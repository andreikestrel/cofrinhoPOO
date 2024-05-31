package Moedas;

public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public int getValorInteiro() {
        return (int) Math.round(valor);
    }
}
