package co.nequi.proyectofranquicias.repositorios;

import co.nequi.proyectofranquicias.entidades.Franquicia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioFranquicia  extends JpaRepository<Franquicia, Integer>, JpaSpecificationExecutor<Franquicia> {
}
