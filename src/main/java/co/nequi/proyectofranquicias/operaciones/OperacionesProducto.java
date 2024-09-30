package co.nequi.proyectofranquicias.operaciones;

import co.nequi.proyectofranquicias.entidades.Franquicia;
import co.nequi.proyectofranquicias.entidades.Producto;

import java.util.List;

public interface OperacionesProducto {
    public Producto crear(Producto producto);
    public Producto actualizar(Producto producto);
    public void borrar(Producto producto);
    public List<Producto> producto();
    public Producto consultarPK(int pk);
}
