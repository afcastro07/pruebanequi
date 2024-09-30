package co.nequi.proyectofranquicias.operaciones;

import co.nequi.proyectofranquicias.entidades.Franquicia;
import java.util.List;

public interface OperacionesFranquicia {

    public Franquicia crear(Franquicia franquicia);
    public Franquicia actualizar(Franquicia franquicia);
    public void borrar(Franquicia franquicia);
    public List<Franquicia> consultarT();
    public Franquicia consultarPK(int pk);

}
