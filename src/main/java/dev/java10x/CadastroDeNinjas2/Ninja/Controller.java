package dev.java10x.CadastroDeNinjas2.Ninja;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/teste")
    public String teste() {
        return "Funcionando!";
    }
}
