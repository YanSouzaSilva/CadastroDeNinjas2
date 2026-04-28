package dev.java10x.CadastroDeNinjas2.Missoes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @GetMapping("/boasvindas")
    public String boasVindasMissoes(){
        return "Boas vindas a seção das missões";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão Criada";
    }

    @GetMapping("/listar")
    public String mostrarMissoes(){
        return "Mostrando todas missões";
    }

    @GetMapping("/listarID")
    public String mostrarMissaoID(){
        return "Mostrando missão pelo ID";
    }

    @PutMapping("/alterar")
    public String alterarMissaoID(){
        return "Alterando missao pelo ID";
    }

    @DeleteMapping("/deletar")
    public String deletarMissaoID(){
        return "Missao deletada";
    }

}
