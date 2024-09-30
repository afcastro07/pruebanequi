package co.nequi.proyectofranquicias.operaciones;

import co.nequi.proyectofranquicias.entidades.Producto;
import co.nequi.proyectofranquicias.entidades.Sucursal;
import java.util.List;

public interface OperacionesSucursal {
    public Sucursal crear(Sucursal sucursal);
    public Sucursal actualizar(Sucursal sucursal);
    public void borrar(Sucursal sucursal);
    public List<Sucursal> consultarT();
    public Sucursal consultarPK(int pk);
}
