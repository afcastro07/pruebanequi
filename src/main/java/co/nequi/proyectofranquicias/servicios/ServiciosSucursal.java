package co.nequi.proyectofranquicias.servicios;

import co.nequi.proyectofranquicias.entidades.Sucursal;

import java.util.List;

public interface ServiciosSucursal {

    public List<Sucursal> ListarSucursal();

    public Sucursal guardarSucursal(Sucursal sucursal);

    public Sucursal obtenerSucursalId(int id);

    public Sucursal actualizarSucursal(Sucursal sucursal);

    public void eliminarSucursal(int id);
}
