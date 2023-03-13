package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void letra() {
        System.out.println("Digite uma letra:");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":
                System.out.println(letra + " É uma vogal");
                break;
            case "e":
                System.out.println(letra + " É uma vogal");
                break;
            case "i":
                System.out.println(letra + " É uma vogal");
                break;
            case "o":
                System.out.println(letra + " É uma vogal");
                break;
            case "u":
                System.out.println(letra + " É uma vogal");
                break;
            default:
                System.out.println(letra + " É consoante");
                break;
        }
    }
    public void mes() {
        
    }
}
