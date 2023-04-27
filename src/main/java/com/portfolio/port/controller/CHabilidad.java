
package com.portfolio.port.controller;

import com.portfolio.port.entity.Habilidad;
import com.portfolio.port.service.SHabilidad;
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
@RequestMapping("habilidad") //localhost:8080/habilidad
@CrossOrigin(origins = "https://portfolio-frontend-diegolozano.web.app")
public class CHabilidad {
    
    @Autowired
    SHabilidad habServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Habilidad> verHabilidades(){
        return habServ.verHabilidades();
    }
    
    @GetMapping("/ver/id")
    @ResponseBody
    public Habilidad verHabilidad(@PathVariable int id){
        return habServ.buscarHabilidad(id);
    }
    
    @PostMapping("/crear")
    public String agregarHabiidad (@RequestBody Habilidad hab) {
        habServ.crearHabilidad(hab);
        return "La habilidad fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarHabilidad (@PathVariable int id) {
        habServ.borrarHabilidad(id);
        return "La habilidad fue borrada correctamente";
    }
    
    @PutMapping("/editar")
    public void editarHabilidad(@RequestBody Habilidad hab){
        habServ.editarHabilidad(hab);
    }
    
}
