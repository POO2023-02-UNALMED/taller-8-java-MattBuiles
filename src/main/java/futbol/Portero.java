package futbol;
public class Portero extends Futbolista {
  public short golesRecibidos;
  public byte dorsal;
  public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
    super(nombre, edad, "Portero");
    this.golesRecibidos = golesRecibidos;
    this.dorsal = dorsal;
  }
  public int compareTo(Object f) {
    return Math.abs(this.getEdad() - ((Futbolista)f).getEdad());
  }
  public String toString() {
    return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
  }
  public boolean jugarConLasManos() {
    return true;
  }
}
