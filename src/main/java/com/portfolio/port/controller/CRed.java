
package com.portfolio.port.controller;

import com.portfolio.port.entity.Red;
import com.portfolio.port.service.SRed;
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
@RequestMapping("red")//http://localhost:8080/red
@CrossOrigin(origins = "http://localhost:4200")
public class CRed {
    
    @Autowired
    SRed reServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Red> verRedes(){
        return reServ.verRedes();
    }
    
    @GetMapping("/ver/id")
    @ResponseBody
    public Red verRed(@PathVariable int id){
        return reServ.buscarRed(id);
    }
    
    @PostMapping("/crear")
    public String agregarRed (@RequestBody Red re) {
        reServ.crearRed(re);
        return "La red fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarRed (@PathVariable int id) {
        reServ.borrarRed(id);
        return "La red fue borrada correctamente";
    }
    
    @PutMapping("/editar")
    public void editarRed(@RequestBody Red re){
        reServ.editarRed(re);
       
    }
}

