package co.nequi.proyectofranquicias.repositorios;

import co.nequi.proyectofranquicias.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioProducto extends JpaRepository<Producto, Integer>, JpaSpecificationExecutor<Producto> {

}
