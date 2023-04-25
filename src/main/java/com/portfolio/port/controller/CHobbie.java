
package com.portfolio.port.controller;

import com.portfolio.port.entity.Hobbie;
import com.portfolio.port.service.SHobbie;
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
@RequestMapping("hobbie") //localhost:8080/hobbie
@CrossOrigin(origins = "http://localhost:4200")
public class CHobbie {
    
    @Autowired
    SHobbie hobServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Hobbie> verHobbies(){
        return hobServ.verHobbies();
    }
    
    @GetMapping("/ver/id")
    @ResponseBody
    public Hobbie verHobbie(@PathVariable int id){
        return hobServ.buscarHobbie(id);
    }
    
    @PostMapping("/crear")
    public String agregarHobbie (@RequestBody Hobbie hob) {
        hobServ.crearHobbie(hob);
        return "El hobbie fue creado correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarHobbie (@PathVariable int id) {
        hobServ.borrarHobbie(id);
        return "El hobbie fue borrado correctamente";
    }
    
    @PutMapping("/editar")
    public void editarHobbie(@RequestBody Hobbie hob){
        hobServ.editarHobbie(hob);
    }
    
}
