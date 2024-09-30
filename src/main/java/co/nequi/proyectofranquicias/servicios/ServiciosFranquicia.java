package co.nequi.proyectofranquicias.servicios;

import co.nequi.proyectofranquicias.entidades.Franquicia;
import co.nequi.proyectofranquicias.operaciones.OperacionesFranquicia;
import co.nequi.proyectofranquicias.repositorios.RepositorioFranquicia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosFranquicia implements OperacionesFranquicia {
    @Autowired
    RepositorioFranquicia repositorioFranquicia ;

    @Override
    public Franquicia crear(Franquicia franquicia) {
        return repositorioFranquicia.save(franquicia);
    }

    @Override
    public Franquicia actualizar(Franquicia franquicia) {
        if (this.consultarPK(franquicia.getCodigofranquicia()) != null)
            return repositorioFranquicia.save(franquicia);
        return null;
    }

    @Override
    public void borrar(Franquicia franquicia) {
        repositorioFranquicia.delete(franquicia);;
    }

    @Override
    public List<Franquicia> consultarT() {
            return repositorioFranquicia.findAll();
        }

    @Override
    public Franquicia consultarPK(int pk) {
        Franquicia franquicia =  repositorioFranquicia.findById(pk).orElse(null);
        return null;
    }
}