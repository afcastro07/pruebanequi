package co.nequi.proyectofranquicias.servicios;

import co.nequi.proyectofranquicias.entidades.Sucursal;
import co.nequi.proyectofranquicias.operaciones.OperacionesSucursal;
import co.nequi.proyectofranquicias.repositorios.RepositorioSucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosSucursalImpl implements OperacionesSucursal {

    @Autowired
    RepositorioSucursal repositorioSucursal ;

    @Override
    public Sucursal crear(Sucursal sucursal) {
        return repositorioSucursal.save(sucursal);
    }

    @Override
    public Sucursal actualizar(Sucursal sucursal) {
        if (this.consultarPK(sucursal.getIdsucursal()) != null)
            return repositorioSucursal.save(sucursal);
        return null;
    }

    @Override
    public void borrar(Sucursal sucursal) {
        repositorioSucursal.delete(sucursal);;
    }

    @Override
    public List<Sucursal> consultarT() {
        return repositorioSucursal.findAll();
    }

    @Override
    public Sucursal consultarPK(int pk) {
        Sucursal sucursal =  repositorioSucursal.findById(pk).orElse(null);
        return null;
    }
}
