package co.nequi.proyectofranquicias.servicios;

import co.nequi.proyectofranquicias.entidades.Producto;
import co.nequi.proyectofranquicias.operaciones.OperacionesProducto;
import co.nequi.proyectofranquicias.repositorios.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosProducto implements OperacionesProducto {
    @Autowired
    RepositorioProducto repositorioProducto ;

    @Override
    public Producto crear(Producto producto) {
        return repositorioProducto.save(producto);
    }

    @Override
    public Producto actualizar(Producto producto) {
        if (this.consultarPK(producto.getIdproducto()) != null)
            return repositorioProducto.save(producto);
        return null;
    }

    @Override
    public void borrar(Producto producto) {
        repositorioProducto.delete(producto);;
    }

    @Override
    public List<Producto> producto() {
        return repositorioProducto.findAll();
    }

    @Override
    public Producto consultarPK(int pk) {
        Producto producto =  repositorioProducto.findById(pk).orElse(null);
        return null;
    }
}
