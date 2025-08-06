package entities;

public class Retangulo {
    public float largura;
    public float altura;

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * (largura + altura);
    }

    public float diagonal() {
        return (float) Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }
}
