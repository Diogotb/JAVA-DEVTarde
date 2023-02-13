package CalculadorGastoViagem;

public class CalculoGastoViagem {
    public static void main(String[] args) {
        int distanciaPercorrida = 150;//distancia em km
        double consumoVeiculo = 10.8;//consumo km/l
        double precoCombustivel = 5.6;
        double litrosCombustivel = distanciaPercorrida/consumoVeiculo;
        double custoViagem = litrosCombustivel*precoCombustivel;
        System.out.println("o Custo da Viagem é de:");
        System.out.println("R$ "+custoViagem);
    }
}
