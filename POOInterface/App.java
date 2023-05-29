package POOInterface;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quadrado figura1 = new Quadrado(7);
        Retangulo figura2 = new Retangulo(10, 5);
        //array de objetos2
        
        Trapezio figTrapezio[] = new Trapezio[5];
        figTrapezio[0] = new Trapezio(10 , 5, 6, 7, 8);

        for (int i = 0; i < figTrapezio.length; i++) {
            figTrapezio[i]=new Trapezio(i+5, i, i+1, i+2, i+3);
        }

        System.out.println("Nome Figura é "+figura1.getNomeFigura()
                            +"\n Area = "+figura1.getArea()
                            +"\n Perimetro = "+figura1.getPerimetro());
        int v = sc.nextInt();
        System.out.print("\033[H\033[2J");
        
        System.out.flush();
        
        System.out.println("Nome Figura é "+figura2.getNomeFigura()
                            +"\n Area = "+figura2.getArea()
                            +"\n Perimetro = "+figura2.getPerimetro());
        sc.close();
    }
}
