package Moedas;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    // Método info()
    public void info() {
        System.out.println("Real: " + valor);
    }

    // Método converter()
    public double converter(char tipoDeMoeda) {
        switch (tipoDeMoeda) {
            case 'r':
                return valor; // Já está em Real, logo retorna o mesmo valor.
            case 'd':
                return valor * 5.25; // conversão para dolar.
            case 'e':
                return valor * 5.7; // conversão para euro.
            default:
                return 0;
        }
    }
}

