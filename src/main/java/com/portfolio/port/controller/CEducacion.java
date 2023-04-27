
package com.portfolio.port.controller;

import com.portfolio.port.entity.Educacion;
import com.portfolio.port.service.SEducacion;
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
@RequestMapping("educacion") //localhost:8080/educacion
@CrossOrigin(origins = "https://portfolio-frontend-diegolozano.web.app")
public class CEducacion {
    
    @Autowired
    SEducacion eduServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Educacion> verEducaciones(){
        return eduServ.verEducaciones();
    }
    
    @GetMapping("/ver/id")
    @ResponseBody
    public Educacion verEducacion(@PathVariable int id){
        return eduServ.buscarEducacion(id);
    }
    
    @PostMapping("/crear")
    public String agregarEducacion (@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
        return "La educacion fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarEducacion (@PathVariable int id) {
        eduServ.borrarEducacion(id);
        return "La educacion fue borrada correctamente";
    }
    
    @PutMapping("/editar")
    public void editarEducacion(@RequestBody Educacion edu){
        eduServ.editarEducacion(edu);
    }
    
}
