package Moedas;

public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor);
    }

    
    public void info() {
        System.out.println("Euro: " + valor);
    }

    
    public double converter(char tipoDeMoeda) {
        switch (tipoDeMoeda) {
            case 'r':
                return valor * 5.69; // conversão para Real
            case 'd':
                return valor * 0.92; // conversão para dolar
            case 'e':
                return valor; // Já está em dolar, logo retorna o mesmo valor.
            default:
                return 0;
        }
    }
}



