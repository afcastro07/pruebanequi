package co.nequi.proyectofranquicias.servicios;

import co.nequi.proyectofranquicias.entidades.Producto;

import java.util.List;

public interface ServiciosProducto {
    public List<Producto> ListarProducto();

    public Producto guardarProducto(Producto franquicia);

    public Producto obtenerProductoId(int id);

    public Producto actualizarProducto(Producto franquicia);

    public void eliminarProducto(int id);
}
