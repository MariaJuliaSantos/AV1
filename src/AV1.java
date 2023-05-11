import java.util.Scanner;

public class AV1 {
    public static void main(String[] args) { 

      try(Scanner teclado = new Scanner(System.in)) {
          System.out.print("Informe a placa do veículo: ");
          String placa = teclado.nextLine();
          System.out.print("Informe o valor do litro combustível: ");
          double valorLitro = teclado.nextDouble();
          System.out.print("Informe a quantidade de quilômetros rodados a 60 km/h: ");
          double km60 = teclado.nextDouble();
          System.out.print("Informe a quantidade de quilômetros rodados a 80 km/h: ");
          double km80 = teclado.nextDouble();
          System.out.print("Informe a quantidade de quilômetros rodados a 100 km/h: ");
          double km100 = teclado.nextDouble();
          System.out.print("Informe a quantidade de quilômetros rodados a 120 km/h: ");
          double km120 = teclado.nextDouble();
          System.out.print("Informe a quantidade de quilômetros rodados a 140 km/h: ");
          double km140 = teclado.nextDouble();

          double consumo60 = km60 / 30.7;
          double consumo80 = km80 / 26.8;
          double consumo100 = km100 / 22.4;
          double consumo120 = km120 / 18.1;
          double consumo140 = km140 / 14.5;

          double consumoTotal = consumo60 + consumo80 + consumo100 + consumo120 + consumo140;
          double valorTotal = consumoTotal * valorLitro;
          double distanciaTotal = km60 + km80 + km100 + km120 + km140;
          
          double velocidadedistancia = 60 * km60 + 80 * km80 + 100 * km100 + 120 * km120 + 140 * km140;
          double velocidadeMedia = velocidadedistancia / distanciaTotal;

          System.out.println("Placa do veículo: " + placa );
          System.out.println("Consumo total: " + consumoTotal + " litros");
          System.out.println("Valor total: R$ " + valorTotal);
          System.out.println("Velocidade média ponderada: " + velocidadeMedia + " km/h");
        }
    }
}