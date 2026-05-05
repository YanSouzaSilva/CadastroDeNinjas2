package dev.java10x.CadastroDeNinjas2.Ninja;
import dev.java10x.CadastroDeNinjas2.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {

    private Long id;
    private String nome;
    private int idade;
    private String imgUrl;
    private String email;
    private MissoesModel missao;
    private String rank;
}
