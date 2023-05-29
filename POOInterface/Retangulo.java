package POOInterface;

public class Retangulo implements FigurasGeometricas{
    //atributos
    int base;

    int altura;

    //métodos
    //construtor
    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //métodos do implements (figura Geométrica)
    @Override
    public double getArea() {
        return base*altura;
    } 

    @Override
    public String getNomeFigura() {
        return "Retângulo";
    }

    @Override
    public double getPerimetro() {
        return (base+altura)*2;
    }

    
}
