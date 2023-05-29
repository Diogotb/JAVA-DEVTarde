package POOInterface;

public class Trapezio implements FigurasGeometricas{
    //atributo
    int baseMaior;
    int baseMenor;
    int altura;
    int lado1;
    int lado2;
    
    //contrutor ( com todos os Parâmetros)
    public Trapezio(int baseMaior, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //métodos da interface

    @Override
    public double getArea() {
        return (baseMaior+baseMenor)*altura/2;
    }

    @Override
    public String getNomeFigura() {
        return "Trapézio";
    }

    @Override
    public double getPerimetro() {
        return baseMaior+baseMenor+lado1+lado2;
    }
    
}
