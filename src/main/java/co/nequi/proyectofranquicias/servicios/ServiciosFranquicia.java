package co.nequi.proyectofranquicias.servicios;
import co.nequi.proyectofranquicias.entidades.Franquicia;

import java.util.List;

public interface ServiciosFranquicia {
    public List<Franquicia> ListarFranquicia();

    public Franquicia guardarFranquicia(Franquicia franquicia);

    public Franquicia obtenerFranquiciaId(int id);

    public Franquicia actualizarFranquicia(Franquicia franquicia);

    public void eliminarFranquicia(int id);
}
