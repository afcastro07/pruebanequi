package co.nequi.proyectofranquicias.entidades;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Data
@ToString
@Entity(name = "Producto")
@Table(name = "PRODUCTO")

public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUCTO")
    @SequenceGenerator(name = "SEQ_SUCURSAL", sequenceName = "SEQ_PRODUCTO", allocationSize = 1)
    @Column(name = "idproducto")
    private int idproducto;

    @Column(name = "producto", nullable = false)
    private String producto;

    @Column(name = "Cantidad_disponible", nullable = false)
    private int cantidad_disponible;

    public Producto() {

    }

    public Producto(int idproducto, String producto, int cantidad_disponible) {
        this.idproducto = idproducto;
        this.producto = producto;
        this.cantidad_disponible = cantidad_disponible;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }
}
