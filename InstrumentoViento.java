public class InstrumentoViento extends Object implements InstrumentoMusical{
  //Por defecto los metodos de la interfaz son publicos, por lo tanto asi deben ser implementado
  public InstrumentoViento(){};
  @Override
  public void tocar(){
    System.out.println("Tocando un instrumento de viento");
  }
  @Override
  public void afinar(){
    System.out.println("Afinando el instrumento de viento");

  }
  @Override
  public String tipoInstrumento(){
    return "instrumento de viento";
  }
  @Override
  public String toString(){
    return "Instrumento de viento";
  }
} 