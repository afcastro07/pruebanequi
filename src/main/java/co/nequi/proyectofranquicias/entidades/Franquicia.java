package co.nequi.proyectofranquicias.entidades;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "Franquicia")
@Table(name = "FRANQUICIA")

public class Franquicia implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FRANQUICIA")
    @SequenceGenerator(name = "SEQ_FRANQUICIA", sequenceName = "SEQ_FRANQUICIA", allocationSize = 1)
    @Column(name = "codigofranquicia")
    private int codigofranquicia;

    @Column(name = "nombrefranquicia", nullable = false)
    private String nombrefranquicia;

    public Franquicia() {

    }

    public Franquicia(int codigofranquicia, String nombrefranquicia) {
        this.codigofranquicia = codigofranquicia;
        this.nombrefranquicia = nombrefranquicia;
    }

    public int getCodigofranquicia() {
        return codigofranquicia;
    }

    public void setCodigofranquicia(int codigofranquicia) {
        this.codigofranquicia = codigofranquicia;
    }

    public String getNombrefranquicia() {
        return nombrefranquicia;
    }

    public void setNombrefranquicia(String nombrefranquicia) {
        this.nombrefranquicia = nombrefranquicia;
    }

}
