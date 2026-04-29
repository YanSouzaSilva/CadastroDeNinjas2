package dev.java10x.CadastroDeNinjas2.Missoes;
import dev.java10x.CadastroDeNinjas2.Ninja.NinjaModel;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private final MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Listar todas as missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    // Listar missão pelo ID
    public MissoesModel ListarMissoesPorId(Long id){
        Optional<MissoesModel> missao = missoesRepository.findById(id);
        return missao.orElse(null);
    }

    // Criar Missao
    public MissoesModel criarMissao(MissoesModel missaoCriada){
        return missoesRepository.save(missaoCriada);
    }

    // Deletar Missao
    public void deletarMissaoPorId(Long id){
        missoesRepository.deleteById(id);
    }

    // Atualizar Missao
    public MissoesModel alterarMissaoPorId(Long id, MissoesModel missaoAtualizada){
        if(missoesRepository.existsById(id)){
            missaoAtualizada.setId(id);
            return missoesRepository.save(missaoAtualizada);
        }
        return null;
    }
}
