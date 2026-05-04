package dev.java10x.CadastroDeNinjas2.Ninja;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja){
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("O ninja " + novoNinja.getNome() + " de ID " + novoNinja.getId() + " foi criado com sucesso.");
    }

    // Procurar Ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjasPorId(@PathVariable Long id){
        NinjaDTO ninjaId = ninjaService.listarNinjasPorId(id);

        if (ninjaId != null){
            return ResponseEntity.ok(ninjaId);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Ninja com o ID " + id + " não foi encontrado");
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> listarNinjas(){
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas);
    }

    // Alterar Ninja (UPDATE)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> atualizarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){
        NinjaDTO ninja = ninjaService.atualizarNinjaPorId(id, ninjaAtualizado);

        if (ninja != null){
            return ResponseEntity.ok(ninja);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Ninja com o ID " + id + " não foi encontrado");
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinjaPorId(@PathVariable Long id){
        if(ninjaService.listarNinjasPorId(id) != null){
            ninjaService.deletarNinjaPorId(id);
            return ResponseEntity.ok("Ninja com o ID " + id + " deletado com sucesso");
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Ninja com o ID " + id + " não foi encontrado");
    }

}
