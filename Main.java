
class Main {
  public static void main(String[] args) {
    Poligono poligono1=new Poligono();
    Triangulo triangulo1=new Triangulo();
    Cuadrilatero cuadrilatero1=new Cuadrilatero();

    System.out.println(poligono1);
    System.out.println(triangulo1);
    System.out.println(cuadrilatero1);
    System.out.println(poligono1.area());
    System.out.println(triangulo1.area());
    System.out.println(cuadrilatero1.area());

    System.out.println("Clases abstractas");
    //PoligonoA pol= new PoligonoA();
    TrianguloA triangulo2= new TrianguloA();
    CuadrilateroA cuadro2=new CuadrilateroA();
    System.out.println(triangulo2);
    System.out.println(cuadro2);
    System.out.println(triangulo2.area());
    System.out.println(cuadro2.perimetro());
    System.out.println("Interfaces");
    Flauta flauta1=new Flauta();
    System.out.println(flauta1);
    System.out.println("Areibutos en interfaces");
    System.out.println("El mes "+Meses.NUEVE+" corresponde a:");
    System.out.println(Meses.NOMBRES_MESES[Meses.NUEVE]);
  }
}