package com.app.marcos.api.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.app.marcos.api.Model.Moto;
import com.app.marcos.api.Repositories.MotoRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HelloController {
    @GetMapping("/")
    public String sayHello() {  
        return "Hola desde mi primera aplicación Spring Boot!";
    }
    @GetMapping("/hola")
    public String saybuenas(){
        return "Hola Buenas como estas?";
    }
    @Autowired
    private MotoRepository motoRepository;

    @GetMapping("/motosPorMarca")
    public List<Moto> getMotosPorMarca(@RequestParam String marca) {
        return motoRepository.findBymarca(marca);
    }
}

