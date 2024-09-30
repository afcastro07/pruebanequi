package co.nequi.proyectofranquicias.controlador;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorHome {
    @GetMapping("/Franquicia")
    public String administrador() {
        return "administrador";
    }

    @GetMapping("/vendedor")
    public String vendedor() {
        return "vendedor";
    }
}