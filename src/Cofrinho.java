import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import Moedas.*;

public class Cofrinho {
    private List<Moeda> moedas;

    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma ação:");
            System.out.println("1. Mostrar valor do cofre");
            System.out.println("2. Adicionar moeda");
            System.out.println("3. Sair");

            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    cofrinho.mostrarValorCofre();
                    break;
                case 2:
                    cofrinho.adicionarMoeda();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }

    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

    public void adicionarMoeda() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tipo da moeda?");
        System.out.println("1. Real");
        System.out.println("2. Dolar");
        System.out.println("3. Euro");
        int tipo = scanner.nextInt();

        System.out.println("Digite o valor da moeda:");
        double valor = scanner.nextDouble();

        switch (tipo) {
            case 1:
                moedas.add(new Real(valor));
                break;
            case 2:
                moedas.add(new Dolar(valor));
                break;
            case 3:
                moedas.add(new Euro(valor));
                break;
            default:
                System.out.println("Tipo de moeda inválido.");
        }
    }

    public void mostrarValorCofre() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Como deseja mostrar o valor do cofre?");
        System.out.println("1. Separando por moedas");
        System.out.println("2. Total em reais");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                mostrarValorSeparado();
                break;
            case 2:
                mostrarValorTotal();
                break;
            default:
                System.out.println("Escolha inválida.");
        }
    }

    public void mostrarValorSeparado() {
        for (Moeda moeda : moedas) {
            System.out.println(moeda.getClass().getSimpleName() + ": " + moeda.getValor());
        }
    }

    public void mostrarValorTotal() {
        double total = 0.0;
        for (Moeda moeda : moedas) {
            if (moeda instanceof Dolar) {
                total += ((Dolar) moeda).converter('r'); // Converter Dólar para Real
            } else if (moeda instanceof Euro) {
                total += ((Euro) moeda).converter('r'); // Converter Euro para Real
            } else {
                total += moeda.getValor(); // Adicionar o valor das moedas Real diretamente
            }
        }
        System.out.println("Total do cofre em reais: " + total);
    }

}
