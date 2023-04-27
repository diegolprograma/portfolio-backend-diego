
package com.portfolio.port.controller;

import com.portfolio.port.entity.Proyecto;
import com.portfolio.port.service.SProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proyecto") //localhost:8080/proyecto
@CrossOrigin(origins = "https://portfolio-frontend-diegolozano.web.app")
public class CProyecto {
    
    @Autowired
    SProyecto proServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Proyecto> verProyectos(){
        return proServ.verProyectos();
    }
    
    @GetMapping("/ver/id")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id){
        return proServ.buscarProyecto(id);
    }
    
    @PostMapping("/crear")
    public String agregarProyecto (@RequestBody Proyecto pro) {
        proServ.crearProyecto(pro);
        return "El proyecto fue creado correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarProyecto (@PathVariable int id) {
        proServ.borrarProyecto(id);
        return "El proyecto fue borrado correctamente";
    }
    
    @PutMapping("/editar")
    public void editarProyecto(@RequestBody Proyecto pro){
        proServ.editarProyecto(pro);
    }
    
}
