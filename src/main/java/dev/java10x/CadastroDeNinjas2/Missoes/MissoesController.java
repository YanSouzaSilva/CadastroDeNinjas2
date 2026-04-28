package dev.java10x.CadastroDeNinjas2.Missoes;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/boasvindas")
    public String boasVindasMissoes(){
        return "Boas vindas a seção das missões";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão Criada";
    }

    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    MissoesModel ListarMissoesPorId(@PathVariable Long id){
        return missoesService.ListarMissoesPorId(id);
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
