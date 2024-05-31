package Moedas;

public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor);
    }

    
    public void info() {
        System.out.println("Dolar: " + valor);
    }

    
    public double converter(char tipoDeMoeda) {
        switch (tipoDeMoeda) {
            case 'r':
                return valor * 5.25; // conversão para Real
            case 'd':
                return valor * 1.08; // conversão para dolar
            case 'e':
                return valor; // Já está em dolar, logo retorna o mesmo valor.
            default:
                return 0;
        }
    }
}
