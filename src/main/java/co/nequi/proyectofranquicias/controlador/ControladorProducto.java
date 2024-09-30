package co.nequi.proyectofranquicias.controlador;

import co.nequi.proyectofranquicias.entidades.Producto;
import co.nequi.proyectofranquicias.servicios.ServiciosProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorProducto {

    @Autowired
    ServiciosProducto servicios;

    public String ListarProducto(Model model) {
        model.addAttribute("productos", servicios.ListarProducto());
        return "productos";
    }

    @GetMapping("/productos/nuevo")
    public String mostrarFormularioRegistrarProducturo(Model model) {
        Producto producto = new Producto();
        model.addAttribute("producto", producto);
        return "registroProducto";
    }
    @PostMapping("/productos")
    public String guardarProducto(@ModelAttribute("producto")Producto productos){
        servicios.guardarProducto(productos);
        return "redirect:/productos";
    }

    @GetMapping("/productos/editar/{id}")
    public String mostrarFormularioEditarProducto(@PathVariable int id, Model model) {
        model.addAttribute("franquicias",servicios.obtenerProductoId(id));
        return "editarProducto";
    }

    @PostMapping("/productos/{id}")
    public String actualizarFranquicia(@PathVariable int  id, @ModelAttribute("franquicias") Producto producto, Model model){
        Producto productoExistente = servicios.obtenerProductoId(id);
        productoExistente.setProducto(producto.getProducto());
        productoExistente.setCantidad_disponible(producto.getCantidad_disponible());
        servicios.actualizarProducto(productoExistente);
        return "redirect:/productos";
    }

    @GetMapping("/productos/{id}")
    public String eliminarFranquicias(@PathVariable int id){
        servicios.eliminarProducto(id);
        return "redirect:/productos";

    }
}
