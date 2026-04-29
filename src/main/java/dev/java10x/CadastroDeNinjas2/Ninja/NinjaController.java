package dev.java10x.CadastroDeNinjas2.Ninja;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota.";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    // Procurar Ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Alterar Ninja (UPDATE)
    @PutMapping("/alterar")
    public String alterarNinjaPorId(){
        return "Alterar o ninja escolhido";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
    }

}
