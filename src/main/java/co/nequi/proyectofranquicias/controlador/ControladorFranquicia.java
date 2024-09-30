package co.nequi.proyectofranquicias.controlador;

import co.nequi.proyectofranquicias.entidades.Franquicia;
import co.nequi.proyectofranquicias.servicios.ServiciosFranquicia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorFranquicia {
    @Autowired
    ServiciosFranquicia servicios;

    @GetMapping(("/franquicias/lista"))
    public String ListarFranquicia(Model model) {
        model.addAttribute("franquicias", servicios.ListarFranquicia());
        return "franquicias";
    }

    @GetMapping("/franquicias/nuevo")
    public String mostrarFormularioRegistrarFranquicia(@PathVariable int id, Model model) {
        model.addAttribute("franquicias",servicios.obtenerFranquiciaId(id));
        return "editarFranquicia";
    }
    @PostMapping("/franquicias")
    public String guardarProducto(@ModelAttribute("producto")Franquicia franquicia){
        servicios.guardarFranquicia(franquicia);
        return "redirect:/franquicias";
    }

    @GetMapping("/franquicias/editar/{id}")
    public String mostrarFormularioEditarFranquicia(@PathVariable int id, Model model) {
        model.addAttribute("franquicias",servicios.obtenerFranquiciaId(id));
        return "editarProducto";
    }

    @PostMapping("/franquicias/{id}")
    public String actualizarFranquicia(@PathVariable int  id, @ModelAttribute("franquicias") Franquicia franquicia, Model model){
        Franquicia franquiciaExistente = servicios.obtenerFranquiciaId(id);
        franquiciaExistente.setNombrefranquicia(franquicia.getNombrefranquicia());
        servicios.actualizarFranquicia(franquiciaExistente);
        return "redirect:/franquicias";
    }

    @GetMapping("/franquicias/{id}")
    public String eliminarFranquicias(@PathVariable int id){
        servicios.eliminarFranquicia(id);
        return "redirect:/franquicias";

    }

}
