public class Flauta extends InstrumentoViento{

  public Flauta(){};

public void limpiar(){
  System.out.println("estoy limpiando la flauta");

}
@Override
public String tipoInstrumento(){
  return "Flauta";
}
@Override 
public String toString(){
  return "Flauta{}";
}
}