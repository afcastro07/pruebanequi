package co.nequi.proyectofranquicias.controlador;

import co.nequi.proyectofranquicias.entidades.Franquicia;
import co.nequi.proyectofranquicias.entidades.Sucursal;
import co.nequi.proyectofranquicias.servicios.ServiciosSucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorSucursal {

    @Autowired
    ServiciosSucursal servicios;

    @GetMapping(("/sucursales"))
    public String ListarSucursales(Model model) {
        model.addAttribute("sucursales", servicios.ListarSucursal());
        return "sucursales";
    }

    @GetMapping("/sucursales/nuevo")
    public String mostrarFormularioRegistrarSucursal(Model model) {
        Sucursal sucursal = new Sucursal();
        model.addAttribute("sucursal", sucursal);
        return "registroSucursal";
    }

    @PostMapping("/sucursales")
        public String guardarProducto(@ModelAttribute("sucursal")Sucursal sucursal){
        servicios.guardarSucursal(sucursal);
        return "redirect:/sucursales";
    }

    @GetMapping("/sucursales/editar/{id}")
    public String mostrarFormularioEditarProducto(@PathVariable int id, Model model) {
        model.addAttribute("sucursales",servicios.obtenerSucursalId(id));
        return "editarSucursales";
    }

    @PostMapping("/sucursales/{id}")
    public String actualizarSucursales(@PathVariable int  id, @ModelAttribute("sucursales") Sucursal sucursal, Model model){
        Sucursal SucursalExistente = servicios.obtenerSucursalId(id);
        SucursalExistente.setNombresucursal(sucursal.getNombresucursal());
        servicios.actualizarSucursal(SucursalExistente);
        return "redirect:/sucursales";
    }

    @GetMapping("/sucursales/{id}")
    public String eliminarSucursal(@PathVariable int id){
        servicios.eliminarSucursal(id);
        return "redirect:/sucursales";

    }

}
