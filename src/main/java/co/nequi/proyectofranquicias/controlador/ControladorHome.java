package co.nequi.proyectofranquicias.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorHome {
    @GetMapping("/franquicias")
    public String franquicias() {
        return "franquicias";
    }

    @GetMapping("/productos")
    public String productos() {
        return "productos";
    }

    @GetMapping("/sucursales")
    public String sucursales() {
        return "sucursales";
    }
}