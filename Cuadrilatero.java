public class Cuadrilatero extends Poligono{
  private int alfa, beta;
  private float a, b, base, altura;

  public Cuadrilatero(){}
  
  public void setBase(float base){
    this.base=base;
  }

  public float getBase(){
    return base;
  }

 public void setAltura(float altura){
   this.altura=altura;
 }

 public float getAltura(){
   return altura;
 }
 @Override
 public double area(){
   return base*altura;
 }
 @Override 
 public double perimetro(){
   return 2*(a+b);
 }
 @Override 
 public String toString(){
   return "Cuadrilatero{Base="+base+" Altura= "+altura+"}";
 }
}