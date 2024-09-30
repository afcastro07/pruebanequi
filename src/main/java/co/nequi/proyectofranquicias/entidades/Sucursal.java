package co.nequi.proyectofranquicias.entidades;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "Sucursal")
@Table(name = "SUCURSAL")

public class Sucursal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SUCURSAL")
    @SequenceGenerator(name = "SEQ_SUCURSAL", sequenceName = "SEQ_SUCURSAL", allocationSize = 1)
    @Column(name = "idsucursal")
    private int idsucursal;

    @Column(name = "nombresucursal", nullable = false)
    private String nombresucursal;

    public int getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(int idsucursal) {
        this.idsucursal = idsucursal;
    }

    public String getNombresucursal() {
        return nombresucursal;
    }

    public void setNombresucursal(String nombresucursal) {
        this.nombresucursal = nombresucursal;
    }
}
