package CalculadoraVelocidadeMedia;

/**
 * VelocidadeMedia
 */
public class VelocidadeMedia {

    public static void main(String[] args) {
        System.out.println("===Calculadora de Velocidade Média===");
        int distanciaPercorrida = 150;
        int tempoGasto = 2;
        float velocidadeMedia = distanciaPercorrida/tempoGasto;
        System.out.println("A velocidade média foi de:");
        System.out.println(velocidadeMedia+" km/h");
    }
}