package EX06.CaixaGenerica;

public class Caixa <T> {
    private T obj;

  public void guardar (T obj) {
  this.obj = obj;
}
 public T recuperar(){
    return this.obj;

 }
}