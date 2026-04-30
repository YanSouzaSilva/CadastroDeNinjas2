package dev.java10x.CadastroDeNinjas2.Ninja;
import dev.java10x.CadastroDeNinjas2.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_cadastro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int idade;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(unique = true)
    private String email;

    @Column(name = "rank")
    private String rank;

    @ManyToOne
    @JoinColumn(name = "missao_id") //chave estrangeira
    private MissoesModel missao;
}
