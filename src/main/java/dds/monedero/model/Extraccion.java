package dds.monedero.model;

import java.time.LocalDate;

public class Extraccion extends Movimiento{

  public Extraccion(LocalDate fecha, double monto){
    this.fecha = fecha;
    this.monto = monto;
    this.tipo = TipoMovimiento.EXTRACCION;
  };

  public boolean fueExtraido(LocalDate fecha) {
    return esDeLaFecha(fecha);
  }
}
