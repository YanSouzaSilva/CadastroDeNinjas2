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
    public MissoesModel criarMissao(@RequestBody MissoesModel missaoCriada){
        return missoesService.criarMissao(missaoCriada);
    }

    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    MissoesModel ListarMissoesPorId(@PathVariable Long id){
        return missoesService.ListarMissoesPorId(id);
    }

    @PutMapping("/alterar/{id}")
    public MissoesModel alterarMissaoPorId(@PathVariable Long id, @RequestBody MissoesModel missaoAtualizada){
        return missoesService.alterarMissaoPorId(id, missaoAtualizada);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarMissaoPorId(@PathVariable Long id){
        missoesService.deletarMissaoPorId(id);
    }

}
